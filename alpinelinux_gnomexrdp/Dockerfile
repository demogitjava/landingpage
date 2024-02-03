FROM alpine:edge

# add repositorys

RUN echo "http://dl-cdn.alpinelinux.org/alpine/edge/main/">>/etc/apk/repositories
RUN echo "http://dl-cdn.alpinelinux.org/alpine/edge/community/">>/etc/apk/repositories


RUN apk add xf86-input-keyboard
RUN apk add xf86-input-mouse

RUN apk --update --no-cache add \
    alpine-conf \
    bash \
    chromium \
    dbus \
    faenza-icon-theme \
    firejail \
    libpulse \
    openssh \
    paper-gtk-theme \
    paper-icon-theme \
    pavucontrol \
    pulseaudio \
    pulseaudio-utils \
    pulsemixer \
    setxkbmap \
    slim \
    sudo \
    supervisor \
    thunar-volman \
    ttf-freefont \
    util-linux \
    vim \
    wireshark \
    vlc-qt \
    xauth \
    xf86-input-keyboard \
    xf86-input-mouse \
    xf86-input-synaptics \
    xfce4 \
    xfce4-pulseaudio-plugin \
    xfce4-terminal \
    xinit \
    xorg-server \
    xorgxrdp \
    xrdp \
    openjdk11 \
&& rm -rf /tmp/* /var/cache/apk/*

# RUN rm -rf /usr/lib/pulse-13.0/modules
COPY --from=builder /usr/lib/pulse-13.0/modules /usr/lib/pulse-13.0/modules
COPY --from=builder  /tmp/pulseaudio-module-xrdp-0.4/src/.libs  /tmp/libs
WORKDIR /tmp/libs
COPY --from=builder  /tmp/pulseaudio-module-xrdp-0.4/build-aux/install-sh /bin
RUN install-sh -c -d '/usr/lib/pulse-13.0/modules'

#COPY --from=builder /home/sdk/packages/testing/x86_64/firefox.apk /tmp/firefox.apk
RUN ldconfig -n /usr/lib/pulse-13.0/modules
RUN ls $(pkg-config --variable=modlibexecdir libpulse)

RUN mkdir -p /var/log/supervisor
# add scripts/config
ADD etc /etc
ADD bin /bin

# prepare user alpine
RUN addgroup alpine \
&& adduser  -G alpine -s /bin/sh -D alpine \
&& echo "root:jj78mvpr52k1" | /usr/sbin/chpasswd \
&& echo "root    ALL=(ALL) ALL" >> /etc/sudoers

# prepare xrdp key
RUN xrdp-keygen xrdp auto

EXPOSE 3389 22

ENTRYPOINT ["/bin/docker-entrypoint.sh"]
CMD ["/usr/bin/supervisord","-c","/etc/supervisor/supervisord.conf"]