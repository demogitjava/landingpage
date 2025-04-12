# Demo Landingpage with Spring Boot + Thymeleaf + Grapesjs + Bootstrap/Bootflat ui kit



|  |  |  
|--|--|  
| [landingpage.jar](http://demogitjava.ddns.net:8000/landingpage-0.0.1-SNAPSHOT.jar) |  2023 08 24|  
 [war - landingpage.war](http://demogitjava.ddns.net:8000/landingpage-0.0.1-SNAPSHOT.war) |  2023 10 28|  



|  |  |  
|--|--|  
| [maven 3.9.8](http://demogitjava.ddns.net:8000/java-ide/apache-maven-3.9.8-bin.tar.gz) |  2024 10 01|  
 [openjdk11](http://demogitjava.ddns.net:8000/Java_JDK/oracleopenjdk-11.0.2_linux-x64_bin.tar.gz) |  2024 10 01|  


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
> 'jdbc:derby://217.160.255.254:1527//root/derbyshopdb'



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


networkconfig  
run options  
============================================================

for bridge network -> 254 Containers

optional:
`docker network create --driver=bridge --subnet=192.168.10.0/24 --ip-range=192.168.10.0/24 --gateway=192.168.10.1 192.168.10.0`

or edit bridge network if openwrt as host installed 


install openwrt as host - system:  
[http://demogitjava.ddns.net:8000/openwrt/openwrt_installwithgparted?](http://demogitjava.ddns.net:8000/openwrt/openwrt_installwithgparted)

run docker container over the bridge with 192.168.10.0 Network edit

```bash
/etc/config/dockerd
	config globals 'globals'
        option alt_config_file '/etc/docker/daemon.json'

```

and the daemon.json looks like

```bash
{
  "iptables": true,
  "mtu":1500,
  "bip": "192.160.10.1/24",
  "data-root": "/opt/docker",
  "default-runtime": "io.containerd.runc.v2",
  "default-address-pools": [
    { "base": "192.168.10.0/24", "size": 254 }
  ]
}

```




backup  
load / save  
============================================================

`docker save -o landingpage.tar jgsoftwares/jgsoftwares`

to load your image to docker desktop type:
`docker load --input landingpage.tar`







