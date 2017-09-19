adaptTo() 2017 - Context-Aware Configuration in AEM
===================================================

Code samples for talk at adaptTo() 2017 in Berlin:<br/>
https://adapt.to/2017/en/schedule/context-aware-configuration-in-aem.html


Requirements
------------

* Java 8
* Maven 3.3.9
* AEM 6.1, 6.2 or 6.3 running on port 4502


Try it out
----------

* Deploy the sample application to your local AEM instance using the script {{clean_install_deploy_package.sh}}
  * This does a full `mvn clean install` and then uploads the content packages from `config-definition/target/configuration/development/aem-author/packages`
* Open the sample site at http://localhost:4502/sites.html/content/adaptto-caconfig-aem/en
* Open Configuration Editor at http://localhost:4502/content/adaptto-caconfig-aem/en/config.html
