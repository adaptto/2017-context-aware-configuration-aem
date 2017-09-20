#!/bin/sh

# defaultconfig
sling_url="http://localhost:4502"
sling_user="admin"
sling_password="admin"
sling_params=""

# set parameter variables before run
init()
{
sling_params="-Dsling.url=$sling_url -Dsling.user=$sling_user -Dsling.password=$sling_password"
other_params=$4
}

####

# run modes
default_build()
{
    motd
    init
    clean_install
    deploy_artifacts
}

#####

motd()
{
echo "********************************************************************"
echo ""
echo " Cleans and installs all modules"
echo " Uploads and installs application complete packages, config and sample content"
echo ""
echo " Destination: $sling_url"
echo ""
echo "********************************************************************"
}

####

clean_install()
{
echo ""
echo "*** Build artifacts ***"
echo ""

mvn $sling_params $other_params -Pfast clean install eclipse:eclipse

if [ "$?" -ne "0" ]; then
  error_exit "*** Build artifacts FAILED ***"
fi
}

#####

deploy_artifacts()
{

echo ""
echo "*** Deploy AEM packages  ***"
echo ""

cd config-definition
mvn -B $sling_params -Pdeploy-packages -Dconga.nodeDirectory=target/configuration/development/aem-author conga-aem:package-install

if [ "$?" -ne "0" ]; then
  error_exit "*** Deploying config packages FAILED ***"
fi

cd ../

}

#####

error_exit()
{
  echo ""
  echo "$1" 1>&2
  echo ""
  read -n1 -r -p "Press any key to continue..." key
  exit 1
}

# check params and run
if [ "$1" != "" ]
then
  # commandlineconfig
  sling_url=$1
  sling_user=$2
  sling_password=$3
  shift 3
  other_params=$@
fi
default_build

echo ""
echo "*** Build complete ***"
echo ""
read -n1 -r -p "Press any key to continue..." key
