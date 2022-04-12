FROM jgsoftwares/jgsoftwares:linuxgraalvmce


#hostname
ENV HOSTNAME landingpage



# locale to german
ENV LANG=de_DE.ISO-8859-1
ENV LANGUAGE de_DE:de
ENV LC_ALL de_DE.ISO-8859-1



ADD https://github.com/demogitjava/demodatabase/raw/master/demodb.mv.db /root/demodb.mv.db
ADD https://github.com/demogitjava/demodatabase/raw/master/mawi.mv.db /root/mawi.mv.db
ADD https://github.com/demogitjava/demodatabase/raw/master/shopdb.mv.db /root/shopdb.mv.db

# h2 database
#ADD https://raw.githubusercontent.com/demogitjava/demodatabase/master/h2.zip /root/

ENV JAVA_TOOL_OPTIONS -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005

COPY target/landingpage-0.0.1-SNAPSHOT.jar landingpage.jar

ENTRYPOINT ["java", "-jar", "debugjava/landingpage-0.0.1-SNAPSHOT.jar"]

