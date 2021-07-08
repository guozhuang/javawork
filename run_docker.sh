#!/usr/bin/env bash

PROJECT_NAME=framework
# 必须与应用的 server.port 值相同
HTTP_PORT=8080


mvn clean package -Dmaven.test.skip
docker build \
  --no-cache -f docker/Dockerfile \
  -t ${PROJECT_NAME} \
  --build-arg projectName=${PROJECT_NAME} \
  . &&
  docker run -it \
    -e TZ=Asia/Shanghai \
    -p $HTTP_PORT:$HTTP_PORT \
    $PROJECT_NAME /bin/bash "$LOCAL_TEST_IP" "$HTTP_PORT"
