package com.aem.aemaacs.demowebsite.core.models;

import org.apache.sling.api.resource.Resource;

public interface Social {

  default Resource getSocials() {
    throw new UnsupportedOperationException();
  };

  boolean isEmpty();
}
