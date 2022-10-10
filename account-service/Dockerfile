FROM java:8-jre
MAINTAINER liuhaobin <3577504312@qq.com>

ADD ./target/account-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/account-service.jar"]

EXPOSE 6000