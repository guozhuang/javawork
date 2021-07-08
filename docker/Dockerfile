FROM java:8

ARG projectName

ENV deployDir /home/deploy/framework
ENV logDir /home/logs/framework

RUN mkdir -p ${deployDir} ${logDir}

ADD target/framework-0.0.1-SNAPSHOT.jar app.jar
# 运行jar包
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]