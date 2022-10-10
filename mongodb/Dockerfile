FROM mongo:3
MAINTAINER liuhaobin <3577504312@qq.com>

ADD init.sh /init.sh
ADD ./dump/

RUN \
chmod +x /init.sh &&\
apt-get update && apt-get dist-upgrade -y --force-yes && apt-get install dos2unix && \
apt-get install psmisc -y -q && \
rm -rf autoremove -y && apt-get clean && \
dos2unix -n /init.sh /initx.sh && chmod +x /initx.sh

ENTRYPOINT ["/initx.sh"]