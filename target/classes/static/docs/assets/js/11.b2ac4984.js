(window.webpackJsonp=window.webpackJsonp||[]).push([[11,13],{275:function(t,n,e){},291:function(t,n,e){"use strict";var a=e(275);e.n(a).a},311:function(t,n,e){"use strict";e.r(n);var a={render:function(t){return t("div",{class:"carbon-ads",attrs:{id:"native-carbon"}})},mounted:function(){window.BSANativeCallback=function(t){if(!t.ads.length){var n=document.createElement("script");n.src="//cdn.carbonads.com/carbon.js?zoneid=1673&serve=C6AILKT&placement=grapesjscom",n.setAttribute("id","_carbonads_js");var e=document.getElementById("native-carbon");e&&e.appendChild(n)}},this.load()},watch:{$route:function(t,n){t.path!==n.path&&this.$el.querySelector("#carbonads")&&(this.$el.innerHTML="",this.load())}},methods:{initCarbon:function(){var t=window._bsa;void 0!==t&&t&&t.init("default","CK7I62QJ","placement:grapesjscomdocs",{target:"#native-carbon"})},load:function(){var t=this,n=document.createElement("script");n.src="//m.servedby-buysellads.com/monetization.js",n.onload=function(){return t.initCarbon()},this.$el.appendChild(n)}}},o=(e(291),e(33)),r=Object(o.a)(a,void 0,void 0,!1,null,null,null);n.default=r.exports},385:function(t,n,e){"use strict";e.r(n);var a=e(347),o=e(311),r={components:{Layout:a.a,CarbonAds:o.default}},i=e(33),s=Object(i.a)(r,(function(){var t=this.$createElement,n=this._self._c||t;return n("Layout",[n("CarbonAds",{attrs:{slot:"sidebar-top"},slot:"sidebar-top"})],1)}),[],!1,null,null,null);n.default=s.exports}}]);