package com.aem.aemaacs.demowebsite.core.models;

import com.adobe.cq.wcm.core.components.models.Component;

public interface Alert extends Component {

  default String getMessage() {
    throw new UnsupportedOperationException();
  }

  boolean isEmpty();
}
