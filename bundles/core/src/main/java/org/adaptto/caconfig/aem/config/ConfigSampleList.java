/*
 * #%L
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
package org.adaptto.caconfig.aem.config;

import org.apache.sling.caconfig.annotation.Configuration;
import org.apache.sling.caconfig.annotation.Property;

/**
 * Config annotation class example
 */
@Configuration(label = "adaptTo() Sample Config List", description = "This is a sample configuration list.", collection = true)
public @interface ConfigSampleList {

  /**
   * @return String parameter
   */
  @Property(label = "String Param", description = "This is a string parameter within the configuration list.")
  String stringParam();

  /**
   * @return String parameter
   */
  @Property(label = "String Param 2", description = "This is a string parameter within the configuration list.")
  String stringParam2();

  /**
   * @return String parameter
   */
  @Property(label = "String Param 3", description = "This is a string parameter within the configuration list.")
  String stringParam3();

}
