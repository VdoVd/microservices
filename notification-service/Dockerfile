FROM java:8-jre
MAINTAINER liuhaobin <3577504312@qq.com>

ADD ./target/notification-service.jar /app/
CMD ["java","-Xmx200m","-jar","/app/notification-service.jar"]

EXPOSE 8000