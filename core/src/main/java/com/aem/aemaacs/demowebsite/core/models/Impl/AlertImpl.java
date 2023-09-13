package com.aem.aemaacs.demowebsite.core.models.Impl;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.commons.lang3.StringUtils;

import com.aem.aemaacs.demowebsite.core.models.Alert;

@Model(adaptables = { SlingHttpServletRequest.class }, adapters = { Alert.class }, resourceType = {
    AlertImpl.RESOURCE_TYPE }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class AlertImpl implements Alert {
  protected static final String RESOURCE_TYPE = "aemaacsdemowebsite/components/alert";

  @ValueMapValue
  private String message;

  @Override
  public String getMessage() {
    return (StringUtils.isBlank(message) ? "Please add text to the alert" : message);
  }

  @Override
  public boolean isEmpty() {
    return (StringUtils.isBlank(message) ? true : false);
  }
}