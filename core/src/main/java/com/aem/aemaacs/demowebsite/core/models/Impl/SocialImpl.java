package com.aem.aemaacs.demowebsite.core.models.Impl;

import com.aem.aemaacs.demowebsite.core.models.Social;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = { SlingHttpServletRequest.class }, adapters = { Social.class }, resourceType = {
    SocialImpl.RESOURCE_TYPE }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class SocialImpl implements Social {
  protected static final String RESOURCE_TYPE = "aemaacsdemowebsite/components/social";

  @ChildResource
  private Resource socials;

  public Resource getSocials() {
    return socials;

  }

  @Override
  public boolean isEmpty() {
    if (getSocials() == null) {
      return true;
    } else {
      return false;
    }
  }

}
