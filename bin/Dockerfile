FROM jgsoftwares/jgsoftwares:linuxgraalvmce
#FROM jgsoftwares/jgsoftwares:i386ubuntuopenjdk

#hostname
ENV HOSTNAME landingpage



# locale to german
ENV LANG=de_DE.ISO-8859-1
ENV LANGUAGE de_DE:de
ENV LC_ALL de_DE.ISO-8859-1



ADD https://github.com/demogitjava/demodatabase/raw/master/demodb.mv.db /root/demodb.mv.db
ADD https://github.com/demogitjava/demodatabase/raw/master/mawi.mv.db /root/mawi.mv.db
ADD https://github.com/demogitjava/demodatabase/raw/master/shopdb.mv.db /root/shopdb.mv.db
ENV JAVA_HOME /usr/lib64/jvm/jre-1.8.0-openjdk/bin/java
# add jar to maschine
# dropbox client
#ADD https://github.com/demogitjava/demodatabase/raw/master/Dropboxclient.jar /root/applib/dropboxclient.jar

ENV JAVA_TOOL_OPTIONS -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005
COPY target/landingpage-0.0.1-SNAPSHOT.jar landingpage.jar
ENTRYPOINT ["java", "-jar", "landingpage.jar"]