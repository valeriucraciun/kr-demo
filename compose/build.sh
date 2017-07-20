#!/bin/bash
echo "Building config-server ----------------->"
cd ../config-server && ./gradlew clean build
echo "Building patient-service ----------------->"
cd ../demo && ./gradlew clean build

