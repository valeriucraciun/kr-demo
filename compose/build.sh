#!/bin/bash
echo "Building config-server ----------------->"
cd ../config-server && ./gradlew clean build

echo "Building discovery-server ----------------->"
cd ../discovery-service && ./gradlew clean build

echo "Building proxy-server ----------------->"
cd ../edge-server && ./gradlew clean build

echo "Building patient-service ----------------->"
cd ../demo && ./gradlew clean build

