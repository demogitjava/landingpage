#
#
# war config 
# 
#
FROM jgsoftwares/alpinelinuxjava11:latest


#hostname
#ENV HOSTNAME demogitjava

# locale to german
ENV LANG=de_DE.ISO-8859-1
ENV LANGUAGE de_DE:de
ENV LC_ALL de_DE.ISO-8859-1

ENV TZ Europe/Berlin

# web
EXPOSE 80

# h2 console
EXPOSE 8082

# derbydb
EXPOSE 1527


# cluster h2 db
EXPOSE 9101
EXPOSE 9102

#ENV HTTP_PROXY="http://217.160.255.254:80"


# add h2 database to root folder
#ADD https://github.com/demogitjava/demodatabase/raw/master/db_landingpage/demodb.mv.db /root/demodb.mv.db
#ADD https://github.com/demogitjava/demodatabase/raw/master/db_landingpage/mawi.mv.db /root/mawi.mv.db
#ADD https://github.com/demogitjava/demodatabase/raw/master/db_landingpage/shopdb.mv.db /root/shopdb.mv.db


# add network config for container to path /etc
#ADD https://github.com/demogitjava/demodatabase/raw/master/db_landingpage/networkconf/networks /etc/networks

ADD target/landingpage-0.0.1-SNAPSHOT.war /root/landingpage.war
ENTRYPOINT ["java", "-jar", "/root/landingpage.war"]