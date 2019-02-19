FROM anapsix/alpine-java:8_server-jre_unlimited

MAINTAINER soc

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

RUN mkdir -p /restapi

WORKDIR /restapi

EXPOSE 8081


ADD target/demo.jar ./

CMD java -Djava.security.egd=file:/dev/./urandom -jar demo.jar