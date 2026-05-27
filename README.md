# Demo Landingpage with Spring Boot + Thymeleaf + Grapesjs + Bootstrap/Bootflat ui kit

to this project the jetty server is implements with http3 support over upd on port 53
for older version remove file de.jgsoftwares.landingpage.config.JettyConfiguration


on openjdk17 the login session over jdbc works
on openjdk25 the login session over jdbc doesnt work -> openjdk17 or opendjk26
on openjdk26 the login session over jdbc works





the web application is set to dmz 
/src/main/resources
application.properties
# listen to ip 
server.address=10.255.255.1

|  |  |  
|--|--|  
| [landingpage.jar](http://demogitjava.ddns.net:8000/landingpage-0.0.1-SNAPSHOT.jar) |  2023 08 24|  
 [war - landingpage.war](http://demogitjava.ddns.net:8000/landingpage-0.0.1-SNAPSHOT.war) |  2023 10 28|  



|  |  |  
|--|--|  
| [maven 3.9.15](http://demogitjava.ddns.net:8000/java-ide/apache-maven-3.9.15-bin.tar.gz) |  2026 05|  
 [openjdk25](http://demogitjava.ddns.net:8000/java-ide/openjdk-25.0.2_linux-x64_bin.tar.gz) |  2026 05|  


change runtime with
alternatives --config java

/usr/lib/jvm/java-11-openjdk-11.0.23.0.9-3.0.1.el8.x86_64/bin/java) ---> 3


maven executable jar
--> `mvn package`
`mvn package spring-boot:repackage`



![enter image description here](https://raw.githubusercontent.com/demogitjava/demodatabase/master/landingapge.png)






*FOR EMAIL*  
**in class contact_service.java  
edit password and username for your smtp account -- hard coded in the moment  
-> testet with gmx.**



The login for the database over jdbc is

> 'root' 'jj78mvpr52k1'
>
> jdbc:derby://217.160.255.254:1527//root/derbydemodb 
> 'jdbc:derby://217.160.255.254:1527//root/derbyshopdb'
> 'jdbc:derby://217.160.255.254:1527//root/derbymawi'

or over vpn

> jdbc:derby://192.168.10.56:1527//root/derbydemodb 
> 'jdbc:derby://192.168.10.56:1527//root/derbyshopdb'
> 'jdbc:derby://192.168.10.56:1527//root/derbymawi'

to edit the port of the tomcat server  
look at the application.properties  
**server.port=80**



# For Docker
============================================================  


	
    docker-compose up -d --build
    
    JPDA socket connect on port 5005 is available
     


access to running docker container with 

    docker exec oraclelinuxlandingpagedebug /bin/bash 

copy jar to docker container with

> docker cp container:source_path host_destination_path


    docker cp /root/git/landingpage/target/landingpage-0.0.1-SNAPSHOT.jar oraclelinuxlandingpagedebug:/root

sh file to run the docker container in debug mode
the runlandingpage.sh

    #!/bin/bash \
    java -jar /root/landingpage-0.0.1-SNAPSHOT.jar -J-Dsun.java2d.dpiaware=true\


to build the image over dockerfile:
[https://github.com/demogitjava/landingpage/blob/master/oraclelinux_landingpage/Dockerfile]
`docker build -f Dockerfile -t landingpage .`



run the container  - host network:
`docker run -it -p 0.0.0.0:80:80 
        --add-host=demogitjava.ddns.net:217.160.255.254 
        --runtime io.containerd.runc.v2 
        --name oraclelinuxlandingpage 
        -e TZ=Europe/Berlin 
        --net=host 
        --hostname demogitjava.ddns.net 
        --restart unless-stopped 
        --cap-add=NET_ADMIN 
        --platform=linux/amd64 
        --kernel-memory=6M 
        -e NTP_SERVER="2.rhel.pool.ntp.org" 
        jgsoftwares/oraclelinux_openjdk_landingpage:latest /bin/bash /root/runlandingpage.sh`

run the container on a bridge network
`docker run -it -p 0.0.0.0:80:80 
        --add-host=demogitjava.ddns.net:217.160.255.254 
        --runtime io.containerd.runc.v2 
        --name oraclelinuxlandingpage 
        -e TZ=Europe/Berlin 
        --net=bridge
        --hostname demogitjava.ddns.net 
        --restart unless-stopped 
        --cap-add=NET_ADMIN 
        --platform=linux/amd64 
        --kernel-memory=6M 
        -e NTP_SERVER="2.rhel.pool.ntp.org" 
        jgsoftwares/oraclelinux_openjdk_landingpage:latest /bin/bash /root/runlandingpage.sh`
 
 to start the container with a ip like 192.168.10.100 create a bridge network
 optional:
`docker network create --driver=bridge --subnet=192.168.10.0/24 --ip-range=192.168.10.0/24 --gateway=192.168.10.1 192.168.10.0`

run the container on a bridge network with ip 
`docker run -it -p 0.0.0.0:80:80 
        --add-host=demogitjava.ddns.net:217.160.255.254 
        --runtime io.containerd.runc.v2 
        --name oraclelinuxlandingpage 
        -e TZ=Europe/Berlin 
        --net=bridge
        -- ip 192.168.10.100
        --hostname demogitjava.ddns.net 
        --restart unless-stopped 
        --cap-add=NET_ADMIN 
        --platform=linux/amd64 
        --kernel-memory=6M 
        -e NTP_SERVER="2.rhel.pool.ntp.org" 
        jgsoftwares/oraclelinux_openjdk_landingpage:latest /bin/bash /root/runlandingpage.sh`
        
optional 
`--runtime runc`



for docker compose:
`docker compose build`
`docker compose up -d --build`

<br/>  
docker for windows are available on https://www.docker.com/products/docker-desktop  

backup  
load / save  
============================================================

`docker save -o landingpage.tar jgsoftwares/jgsoftwares`

to load your image to docker desktop type:
`docker load --input landingpage.tar`







