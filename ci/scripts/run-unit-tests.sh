#!/usr/bin/env bash

export TERM=xterm
export ROOT_FOLDER=$( pwd )
export GRADLE_HOME="${ROOT_FOLDER}/../.gradle/"

pushd secure-app-git > /dev/null


popd > /dev/null

mv secure-app-git/build/libs/*jar artifacts/