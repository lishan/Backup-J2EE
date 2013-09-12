#!/bin/bash
. `dirname $0`/setEnv.sh
pushd $TOMCAT_HOME/logs
	tail -f catalina.out
popd
