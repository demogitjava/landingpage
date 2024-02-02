FROM alpine:edge

# add repositorys

RUN echo "http://dl-cdn.alpinelinux.org/alpine/edge/main/">>/etc/apk/repositories
RUN echo "http://dl-cdn.alpinelinux.org/alpine/edge/community/">>/etc/apk/repositories


 
RUN apk --update --no-cache add \
	alpine-conf \
	openrc \
	bash \
	chromium \
	dbus \
	xauth \
	supervisor \
	gnome \
	xorg-server \
	xorgxrdp \
	xrdp \
	openjdk11 \
	git \
	maven 
	
EXPOSE 3389