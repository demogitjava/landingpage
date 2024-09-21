FROM jgsoftwares/oraclelinux_openjdk:11


#ENV JAVA_HOME="/usr/lib/jvm/default-jvm/"
#RUN apk add openjdk11

# Has to be set explictly to find binaries 
#ENV PATH=$PATH:${JAVA_HOME}/bin

#EXPOSE 1527

ENTRYPOINT /root/db-derby-10.14.2.0-bin/bin/startNetworkServer -h 0.0.0.0
#CMD ["/root/db-derby-10.14.2.0-bin/bin/startNetworkServer"]