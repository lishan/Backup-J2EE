#!/bin/bash
. `dirname $0`/setEnv.sh

pushd $TOMCAT_HOME/webapps
	rm -rf markdown/
	rm -rf markdown.war
popd

echo "clean webapps complete!"
cp -rf $PROJECT_WEB_HOME/target/markdown.war $TOMCAT_HOME/webapps/
echo "depoly complete!"
