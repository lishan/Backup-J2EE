#!/bin/bash
. `dirname $0`/setEnv.sh
rm -rf startup.sh shutdown.sh catalina.sh
ln -s $TOMCAT_HOME/bin/startup.sh startup.sh
ln -s $TOMCAT_HOME/bin/shutdown.sh shutdown.sh
ln -s $TOMCAT_HOME/bin/catalina.sh catalina.sh

pushd $PROJECT_HOME
	rm -rf .gitignore
	touch .gitignore
	echo "./dev/startup.sh" >> .gitignore
	echo "./dev/shutdown.sh" >> .gitignore
	echo "./dev/catalina.sh" >> .gitignore
popd
