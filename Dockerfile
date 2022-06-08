FROM jgsoftwares/jgsoftwares:linuxgraalvmce

#hostname
ENV HOSTNAME demogitjava

# locale to german
ENV LANG=de_DE.ISO-8859-1
ENV LANGUAGE de_DE:de
ENV LC_ALL de_DE.ISO-8859-1

EXPOSE 80
EXPOSE 8082
EXPOSE 9092

# add h2 database to root folder
ADD https://github.com/demogitjava/demodatabase/raw/master/demodb.mv.db /root/demodb.mv.db
ADD https://github.com/demogitjava/demodatabase/raw/master/mawi.mv.db /root/mawi.mv.db
ADD https://github.com/demogitjava/demodatabase/raw/master/shopdb.mv.db /root/shopdb.mv.db