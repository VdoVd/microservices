FROM java:8-jre
MAINTAINER liuhaobin <3577504312@qq.com>

ADD ./target/monitoring.jar /app/
CMD ["java","-Xmx200m","-jar","/app/monitoring"]

EXPOSE 8080