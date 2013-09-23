#!/bin/bash
. `dirname $0`/setEnv.sh

pushd $PROJECT_HOME
	mvn clean install
popd
