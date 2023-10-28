# Demo Landingpage with Spring Boot + Thymeleaf + Grapesjs + Bootstrap/Bootflat ui kit



|  |  |  
|--|--|  
| [landingpage.jar](http://demogitjava.ddns.net:8000/landingpage.jar) |  2023 08 24|  
 [native - landingpage.jar](http://demogitjava.ddns.net:8000/native-landingpage.jar) |  2023 08 29|  
 [war - landingpage.war](http://demogitjava.ddns.net:8000/native-landingpage.war) |  2023 10 28|  



the used timezone is -> UTC Europe/Berlin

The used IDE was Apache Netbeans 
[download netbeans](https://netbeans.apache.org/download/index.html)

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
`admin  
jj78mvpr52k1`

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

-p 0.0.0.0:80:80 --add-host=docker:217.160.255.254 --network 172.17.0.0 --name landingpage 



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



backup  
load / save  
============================================================

docker save -o landingpage.tar jgsoftwares/jgsoftwares

to load your image to docker desktop type:


docker load --input landingpage.tar

