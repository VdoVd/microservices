FROM java:8-jre
MAINTAINER liuhaobin <3577504312@qq.com>

ADD ./target/registry.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/registry.jar"]

EXPOSE 8761