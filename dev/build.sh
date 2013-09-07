#!/bin/bash
. `dirname $0`/setEnv.sh

pushd $PLATFORM_HOME
	mvn install
popd
pushd $PROJECT_WEB_HOME
	mvn clean install
popd
