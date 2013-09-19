#!/bin/bash
. `dirname $0`/setEnv.sh

pushd $TOMCAT_HOME/webapps
	rm -rf $PROJECT_NAME/
	rm -rf $PROJECT_NAME.war
popd

echo "clean webapps complete!"
cp -rf $PROJECT_WEB_HOME/target/$PROJECT_NAME.war $TOMCAT_HOME/webapps/
echo "depoly complete!"
