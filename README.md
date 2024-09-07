# Demo Landingpage with Spring Boot + Thymeleaf + Grapesjs + Bootstrap/Bootflat ui kit



|  |  |  
|--|--|  
| [landingpage.jar](http://demogitjava.ddns.net:8000/landingpage.jar) |  2023 08 24|  
 [war - landingpage.war](http://demogitjava.ddns.net:8000/landingpage.war) |  2023 10 28|  



the used timezone is -> Europe/Berlin
 
The used IDE was Apache Netbeans 
[download netbeans](https://netbeans.apache.org/download/index.html)

edit the port on netbeans to run the project on port 8080
Project properties -> run -> vm options -> -Dserver.port=8080



The used maven 3.9.1 version  
[download maven](https://maven.apache.org/download.cgi)

![enter image description here](https://raw.githubusercontent.com/demogitjava/demodatabase/master/landingapge.png)




derbydb 
jdbc login 
root
jj78mvpr52k1



*FOR EMAIL*  
**in class contact_service.java  
edit password and username for your smtp account -- hard coded in the moment  
-> testet with gmx.**



The login for the database over jdbc is

'root'
'jj78mvpr52k1'

'jdbc:derby://172.17.0.2:1527//root/derbyshopdb'


the application url // port is  
url: https:// "your domain " /

to edit the port of the tomcat server  
look at the application.properties  
**server.port=80**



# For Docker
============================================================  
<br/>  
start docker container with   
line   


to build the image type:
docker build -f Dockerfile -t landingpage .

run the container with 

docker run -it -p 0.0.0.0:80:80 
        --add-host=demogitjava.ddns.net:217.160.255.254 
        --runtime io.containerd.runc.v2 
        --name oraclelinuxlandingpage 
        -e TZ=Europe/Berlin 
        --net=host 
        --hostname demogitjava.ddns.net 
        --restart unless-stopped 
        --cap-add=NET_ADMIN 
        --platform=linux/amd64 
        --cpu-quota 2000 
        --cpu-period 2000 
        --cpu-shares 1024 
        --kernel-memory=6M 
        --cpuset-cpus="1" 
        -e NTP_SERVER="2.rhel.pool.ntp.org" 
        jgsoftwares/oraclelinux_openjdk_landingpage:latest /bin/bash /root/runlandingpage.sh

optional 
--runtime runc


<br/>  
docker for windows are available on https://www.docker.com/products/docker-desktop  


networkconfig  
run options  
============================================================

for bridge network -> 254 Containers

router gateway from my provider is 10.255.255.1

optional:
`docker network create --driver=bridge --subnet=10.255.255.0/24 --ip-range=10.255.255.0/24 --gateway=10.255.255.1 10.255.255.0`


to run a container on desktop pc
`docker network create --driver=bridge --subnet=172.17.0.0/24 --ip-range=172.17.0.0/24 --gateway=172.17.0.1 172.17.0.0`

**to publish the container over the internet
-> 10.255.255.0
then 172.17.0.1
docker get the route to the first network -> rate for download is about 500 kb**

macvlan docker gateway 
docker network create -d macvlan --subnet=217.160.255.254/32 --gateway=217.160.255.254 -o parent=eth0.50 macvlan50


backup  
load / save  
============================================================

docker save -o landingpage.tar jgsoftwares/jgsoftwares

to load your image to docker desktop type:


docker load --input landingpage.tar

