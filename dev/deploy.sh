#!/bin/bash
. `dirname $0`/setEnv.sh
cp -rf $PROJECT_WEB_HOME/target/web.markdown.war $TOMCAT_HOME/webapps/
echo "depoly complete!"