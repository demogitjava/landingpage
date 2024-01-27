
#jgsoftwares/alpinelinux_h2lanserver:edge
FROM jgsoftwares/alpinelinux_h2lanserver:edge

# time 
RUN apk add tzdata
CMD ["ln -s /usr/share/zoneinfo/Europe/Berlin /etc/localtime"]

# config lo interface to 127.0.0.1/24
CMD ip addr del 127.0.0.1/8 dev lo
CMD ip addr add 127.0.0.1/24 dev lo

# update docker container
RUN apk add --update docker openrc

#RUN apk add openjdk11

# intall docker and run service 
RUN rc-update add docker boot

EXPOSE 8082 9092

# copy h2 database to /root 
#ADD http://demogitjava.ddns.net:8000/h2_database/h2-1.4.199.zip /root/h2-1.4.199.zip
#CMD ["unzip /root/h2-1.4.199.zip"]

#ADD http://demogitjava.ddns.net:8000/h2_database/demodb.mv.db /root/demodb.mv.db
#ADD http://demogitjava.ddns.net:8000/h2_database/mawi.mv.db /root/mawi.mv.db
#ADD http://demogitjava.ddns.net:8000/h2_database/shopdb.mv.db /root/shopdb.mv.db
# start h2 database

ENTRYPOINT java -cp /root/h2-1.4.199/bin/h2-1.4.199.jar org.h2.tools.Server -web -webAllowOthers -tcp -tcpAllowOthers -baseDir /root
 