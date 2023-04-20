FROM jgsoftwares/jgsoftwares:linuxgraalvmce
#hostname
ENV HOSTNAME demogitjava

# locale to german
ENV LANG=de_DE.ISO-8859-1
ENV LANGUAGE de_DE:de
ENV LC_ALL de_DE.ISO-8859-1

ENV TZ Europe/Berlin

EXPOSE 80
EXPOSE 8082
EXPOSE 9092

ENV HTTP_PROXY="http://217.160.255.254:80"


# add h2 database to root folder
ADD https://github.com/demogitjava/demodatabase/raw/master/db_landingpage/demodb.mv.db /root/demodb.mv.db
ADD https://github.com/demogitjava/demodatabase/raw/master/db_landingpage/mawi.mv.db /root/mawi.mv.db
ADD https://github.com/demogitjava/demodatabase/raw/master/db_landingpage/shopdb.mv.db /root/shopdb.mv.db


# add network config for container to path /etc
ADD https://github.com/demogitjava/demodatabase/raw/master/db_landingpage/networkconf/networks /etc/networks


# add jar to maschine
#ADD https://cgateu01mc.storage-gmx.net/cgate-mc/rest/document/os-live-mc/628955951117900355/1205461780277494448/2023_02_09_landingpage-0.0.1-SNAPSHOT.jar?x_cd=attachment&c=AAi6Q5bWwBXrELqZSZbAF1AAAAGGNb6FXf__&t=1681971710294&h=GePs7LgUZVauSriyPlpgD9aHJdc /root/2023_02_09_landingpage-0.0.1-SNAPSHOT.jar
#ENV JAVA_TOOL_OPTIONS -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005

#ENTRYPOINT ["java", "-jar", "2023_02_09_landingpage-0.0.1-SNAPSHOT.jar"]
