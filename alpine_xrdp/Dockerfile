FROM alpine:edge


RUN echo "http://dl-cdn.alpinelinux.org/alpine/edge/main" >> /etc/apk/repositories
RUN echo "http://dl-cdn.alpinelinux.org/alpine/edge/community" >> /etc/apk/repositories
RUN apk update
RUN apk add --no-cache xvfb x11vnc fluxbox supervisor xterm bash chromium firefox xrdp wqy-zenhei novnc websockify

#RUN ln -s /usr/share/novnc/vnc_lite.html /usr/share/novnc/index.html

ADD supervisord.conf /etc/supervisord.conf
ADD xrdp.ini /etc/xrdp/xrdp.ini
#ADD menu /root/.fluxbox/menu
ADD entry.sh /entry.sh

RUN chmod +x /entry.sh

ENV DISPLAY :0
ENV RESOLUTION=1280x1024

EXPOSE 3389 
EXPOSE 1527
EXPOSE 8082
EXPOSE 9092
EXPOSE 3306

EXPOSE 8843

ENTRYPOINT ["/bin/bash", "-c", "/entry.sh"]