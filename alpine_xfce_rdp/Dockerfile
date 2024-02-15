FROM amd64/alpine:latest

RUN echo 'root:jj78mvpr52k1' | chpasswd

# install tools
RUN apk add --no-cache \
  wget curl sudo vim file tzdata


ARG ARG_TZ="Europe/Berlin"
RUN ln -snf /usr/share/zoneinfo/$ARG_TZ /etc/localtime && \
  echo $ARG_TZ > /etc/timezone


RUN apk add --no-cache alpine-conf && \
  setup-xorg-base || true


RUN apk add --no-cache \
  xfce4 \
  xfce4-terminal \
  xfce4-screensaver \
  lightdm-gtk-greeter \
  dbus \
  openssl \
  xrdp \
  xorgxrdp


COPY ./etc/X11/Xwrapper.config /etc/X11/
COPY ./etc/xrdp/sesman.ini /etc/xrdp/
COPY ./etc/xrdp/xrdp.ini /etc/xrdp/
RUN mkdir -p /var/log/xrdp
RUN xrdp-keygen xrdp auto


RUN apk add --no-cache supervisor 
COPY ./etc/supervisord.conf /etc/
ADD ./etc/supervisor.d/* /etc/supervisor.d/
RUN mkdir -p /var/log/supervisor/


ARG ARG_USER="hoscho"
ARG ARG_PASSWORD="jj78mvpr52k1"
RUN adduser --shell /bin/ash -S $ARG_USER && \
  echo "$ARG_USER ALL=(ALL) ALL" >> /etc/sudoers && \
  echo "$ARG_USER:$ARG_PASSWORD" | chpasswd


RUN apk add openjdk11
RUN apk add firefox

# RDP port
EXPOSE 3389

CMD ["bash", "-c", "/usr/bin/supervisord -c /etc/supervisord.conf"]
