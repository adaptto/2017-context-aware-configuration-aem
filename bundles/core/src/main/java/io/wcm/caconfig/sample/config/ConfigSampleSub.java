/*
 * #%L
 * wcm.io
 * %%
 * Copyright (C) 2017 pro!vision GmbH
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package io.wcm.caconfig.sample.config;

import org.apache.sling.caconfig.annotation.Property;

/**
 * Nested sub config.
 */
public @interface ConfigSampleSub {

  /**
   * @return String parameter
   */
  @Property(label = "Sub String Param", description = "This is a string parameter in the ConfigSampleSub configuration.")
  String subStringParam();

  /**
   * @return Integer parameter
   */
  @Property(label = "Integer Param")
  int intParam();

  /**
   * @return Boolean parameter
   */
  @Property(label = "Boolean Param")
  boolean boolParam();

  /**
   * @return String array parameter with default value
   */
  @Property(label = "String Array Param")
  String[] stringArrayParam() default {
      "value1", "value2"
  };

}
