(window.webpackJsonp=window.webpackJsonp||[]).push([[20],{431:function(t,a,e){"use strict";e.r(a);var s=e(33),r=Object(s.a)({},(function(){var t=this,a=t.$createElement,e=t._self._c||a;return e("ContentSlotsDistributor",{attrs:{"slot-key":t.$parent.slotKey}},[e("h2",{attrs:{id:"assetmanager"}},[e("a",{staticClass:"header-anchor",attrs:{href:"#assetmanager"}},[t._v("#")]),t._v(" AssetManager")]),t._v(" "),e("p",[t._v("You can customize the initial state of the module from the editor initialization, by passing the following "),e("a",{attrs:{href:"https://github.com/artf/grapesjs/blob/master/src/asset_manager/config/config.js",target:"_blank",rel:"noopener noreferrer"}},[t._v("Configuration Object"),e("OutboundLink")],1)]),t._v(" "),e("div",{staticClass:"language-js extra-class"},[e("pre",{pre:!0,attrs:{class:"language-js"}},[e("code",[e("span",{pre:!0,attrs:{class:"token keyword"}},[t._v("const")]),t._v(" editor "),e("span",{pre:!0,attrs:{class:"token operator"}},[t._v("=")]),t._v(" grapesjs"),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(".")]),e("span",{pre:!0,attrs:{class:"token function"}},[t._v("init")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("(")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("{")]),t._v("\n assetManager"),e("span",{pre:!0,attrs:{class:"token operator"}},[t._v(":")]),t._v(" "),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("{")]),t._v("\n   "),e("span",{pre:!0,attrs:{class:"token comment"}},[t._v("// options")]),t._v("\n "),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("}")]),t._v("\n"),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("}")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(")")]),t._v("\n")])])]),e("p",[t._v("Once the editor is instantiated you can use its API. Before using these methods you should get the module from the instance")]),t._v(" "),e("div",{staticClass:"language-js extra-class"},[e("pre",{pre:!0,attrs:{class:"language-js"}},[e("code",[e("span",{pre:!0,attrs:{class:"token keyword"}},[t._v("const")]),t._v(" assetManager "),e("span",{pre:!0,attrs:{class:"token operator"}},[t._v("=")]),t._v(" editor"),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(".")]),t._v("AssetManager"),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(";")]),t._v("\n")])])]),e("ul",[e("li",[e("a",{attrs:{href:"#add"}},[t._v("add")])]),t._v(" "),e("li",[e("a",{attrs:{href:"#get"}},[t._v("get")])]),t._v(" "),e("li",[e("a",{attrs:{href:"#getall"}},[t._v("getAll")])]),t._v(" "),e("li",[e("a",{attrs:{href:"#getallvisible"}},[t._v("getAllVisible")])]),t._v(" "),e("li",[e("a",{attrs:{href:"#remove"}},[t._v("remove")])]),t._v(" "),e("li",[e("a",{attrs:{href:"#store"}},[t._v("store")])]),t._v(" "),e("li",[e("a",{attrs:{href:"#load"}},[t._v("load")])]),t._v(" "),e("li",[e("a",{attrs:{href:"#getcontainer"}},[t._v("getContainer")])]),t._v(" "),e("li",[e("a",{attrs:{href:"#getassetsel"}},[t._v("getAssetsEl")])]),t._v(" "),e("li",[e("a",{attrs:{href:"#addtype"}},[t._v("addType")])]),t._v(" "),e("li",[e("a",{attrs:{href:"#gettype"}},[t._v("getType")])]),t._v(" "),e("li",[e("a",{attrs:{href:"#gettypes"}},[t._v("getTypes")])])]),t._v(" "),e("h2",{attrs:{id:"add"}},[e("a",{staticClass:"header-anchor",attrs:{href:"#add"}},[t._v("#")]),t._v(" add")]),t._v(" "),e("p",[t._v("Add new asset/s to the collection. URLs are supposed to be unique")]),t._v(" "),e("h3",{attrs:{id:"parameters"}},[e("a",{staticClass:"header-anchor",attrs:{href:"#parameters"}},[t._v("#")]),t._v(" Parameters")]),t._v(" "),e("ul",[e("li",[e("code",[t._v("asset")]),t._v(" "),e("strong",[t._v("("),e("a",{attrs:{href:"https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/String",target:"_blank",rel:"noopener noreferrer"}},[t._v("string"),e("OutboundLink")],1),t._v(" | "),e("a",{attrs:{href:"https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object",target:"_blank",rel:"noopener noreferrer"}},[t._v("Object"),e("OutboundLink")],1),t._v(" | "),e("a",{attrs:{href:"https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array",target:"_blank",rel:"noopener noreferrer"}},[t._v("Array"),e("OutboundLink")],1),t._v("<"),e("a",{attrs:{href:"https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/String",target:"_blank",rel:"noopener noreferrer"}},[t._v("string"),e("OutboundLink")],1),t._v("> | "),e("a",{attrs:{href:"https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array",target:"_blank",rel:"noopener noreferrer"}},[t._v("Array"),e("OutboundLink")],1),t._v("<"),e("a",{attrs:{href:"https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object",target:"_blank",rel:"noopener noreferrer"}},[t._v("Object"),e("OutboundLink")],1),t._v(">)")]),t._v(" URL strings or an objects representing the resource.")]),t._v(" "),e("li",[e("code",[t._v("opts")]),t._v(" "),e("strong",[e("a",{attrs:{href:"https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object",target:"_blank",rel:"noopener noreferrer"}},[t._v("Object"),e("OutboundLink")],1),t._v("?")]),t._v(" Options (optional, default "),e("code",[t._v("{}")]),t._v(")")])]),t._v(" "),e("h3",{attrs:{id:"examples"}},[e("a",{staticClass:"header-anchor",attrs:{href:"#examples"}},[t._v("#")]),t._v(" Examples")]),t._v(" "),e("div",{staticClass:"language-javascript extra-class"},[e("pre",{pre:!0,attrs:{class:"language-javascript"}},[e("code",[e("span",{pre:!0,attrs:{class:"token comment"}},[t._v("// In case of strings, would be interpreted as images")]),t._v("\nassetManager"),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(".")]),e("span",{pre:!0,attrs:{class:"token function"}},[t._v("add")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("(")]),e("span",{pre:!0,attrs:{class:"token string"}},[t._v("'http://img.jpg'")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(")")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(";")]),t._v("\nassetManager"),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(".")]),e("span",{pre:!0,attrs:{class:"token function"}},[t._v("add")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("(")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("[")]),e("span",{pre:!0,attrs:{class:"token string"}},[t._v("'http://img.jpg'")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(",")]),t._v(" "),e("span",{pre:!0,attrs:{class:"token string"}},[t._v("'./path/to/img.png'")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("]")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(")")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(";")]),t._v("\n\n"),e("span",{pre:!0,attrs:{class:"token comment"}},[t._v("// Using objects you could indicate the type and other meta informations")]),t._v("\nassetManager"),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(".")]),e("span",{pre:!0,attrs:{class:"token function"}},[t._v("add")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("(")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("{")]),t._v("\n\tsrc"),e("span",{pre:!0,attrs:{class:"token operator"}},[t._v(":")]),t._v(" "),e("span",{pre:!0,attrs:{class:"token string"}},[t._v("'http://img.jpg'")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(",")]),t._v("\n\t"),e("span",{pre:!0,attrs:{class:"token comment"}},[t._v("//type: 'image',\t//image is default")]),t._v("\n\theight"),e("span",{pre:!0,attrs:{class:"token operator"}},[t._v(":")]),t._v(" "),e("span",{pre:!0,attrs:{class:"token number"}},[t._v("300")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(",")]),t._v("\nwidth"),e("span",{pre:!0,attrs:{class:"token operator"}},[t._v(":")]),t._v(" "),e("span",{pre:!0,attrs:{class:"token number"}},[t._v("200")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(",")]),t._v("\n"),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("}")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(")")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(";")]),t._v("\nassetManager"),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(".")]),e("span",{pre:!0,attrs:{class:"token function"}},[t._v("add")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("(")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("[")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("{")]),t._v("\n\tsrc"),e("span",{pre:!0,attrs:{class:"token operator"}},[t._v(":")]),t._v(" "),e("span",{pre:!0,attrs:{class:"token string"}},[t._v("'http://img.jpg'")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(",")]),t._v("\n"),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("}")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(",")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("{")]),t._v("\n\tsrc"),e("span",{pre:!0,attrs:{class:"token operator"}},[t._v(":")]),t._v(" "),e("span",{pre:!0,attrs:{class:"token string"}},[t._v("'./path/to/img.png'")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(",")]),t._v("\n"),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("}")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("]")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(")")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(";")]),t._v("\n")])])]),e("p",[t._v("Returns "),e("strong",[t._v("Model")])]),t._v(" "),e("h2",{attrs:{id:"get"}},[e("a",{staticClass:"header-anchor",attrs:{href:"#get"}},[t._v("#")]),t._v(" get")]),t._v(" "),e("p",[t._v("Returns the asset by URL")]),t._v(" "),e("h3",{attrs:{id:"parameters-2"}},[e("a",{staticClass:"header-anchor",attrs:{href:"#parameters-2"}},[t._v("#")]),t._v(" Parameters")]),t._v(" "),e("ul",[e("li",[e("code",[t._v("src")]),t._v(" "),e("strong",[e("a",{attrs:{href:"https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/String",target:"_blank",rel:"noopener noreferrer"}},[t._v("string"),e("OutboundLink")],1)]),t._v(" URL of the asset")])]),t._v(" "),e("h3",{attrs:{id:"examples-2"}},[e("a",{staticClass:"header-anchor",attrs:{href:"#examples-2"}},[t._v("#")]),t._v(" Examples")]),t._v(" "),e("div",{staticClass:"language-javascript extra-class"},[e("pre",{pre:!0,attrs:{class:"language-javascript"}},[e("code",[e("span",{pre:!0,attrs:{class:"token keyword"}},[t._v("var")]),t._v(" asset "),e("span",{pre:!0,attrs:{class:"token operator"}},[t._v("=")]),t._v(" assetManager"),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(".")]),e("span",{pre:!0,attrs:{class:"token function"}},[t._v("get")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("(")]),e("span",{pre:!0,attrs:{class:"token string"}},[t._v("'http://img.jpg'")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(")")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(";")]),t._v("\n")])])]),e("p",[t._v("Returns "),e("strong",[e("a",{attrs:{href:"https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object",target:"_blank",rel:"noopener noreferrer"}},[t._v("Object"),e("OutboundLink")],1)]),t._v(" Object representing the asset")]),t._v(" "),e("h2",{attrs:{id:"getall"}},[e("a",{staticClass:"header-anchor",attrs:{href:"#getall"}},[t._v("#")]),t._v(" getAll")]),t._v(" "),e("p",[t._v("Return the global collection, containing all the assets")]),t._v(" "),e("p",[t._v("Returns "),e("strong",[t._v("Collection")])]),t._v(" "),e("h2",{attrs:{id:"getallvisible"}},[e("a",{staticClass:"header-anchor",attrs:{href:"#getallvisible"}},[t._v("#")]),t._v(" getAllVisible")]),t._v(" "),e("p",[t._v("Return the visible collection, which containes assets actually rendered")]),t._v(" "),e("p",[t._v("Returns "),e("strong",[t._v("Collection")])]),t._v(" "),e("h2",{attrs:{id:"remove"}},[e("a",{staticClass:"header-anchor",attrs:{href:"#remove"}},[t._v("#")]),t._v(" remove")]),t._v(" "),e("p",[t._v("Remove the asset by its URL")]),t._v(" "),e("h3",{attrs:{id:"parameters-3"}},[e("a",{staticClass:"header-anchor",attrs:{href:"#parameters-3"}},[t._v("#")]),t._v(" Parameters")]),t._v(" "),e("ul",[e("li",[e("code",[t._v("src")]),t._v(" "),e("strong",[e("a",{attrs:{href:"https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/String",target:"_blank",rel:"noopener noreferrer"}},[t._v("string"),e("OutboundLink")],1)]),t._v(" URL of the asset")])]),t._v(" "),e("h3",{attrs:{id:"examples-3"}},[e("a",{staticClass:"header-anchor",attrs:{href:"#examples-3"}},[t._v("#")]),t._v(" Examples")]),t._v(" "),e("div",{staticClass:"language-javascript extra-class"},[e("pre",{pre:!0,attrs:{class:"language-javascript"}},[e("code",[t._v("assetManager"),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(".")]),e("span",{pre:!0,attrs:{class:"token function"}},[t._v("remove")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("(")]),e("span",{pre:!0,attrs:{class:"token string"}},[t._v("'http://img.jpg'")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(")")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(";")]),t._v("\n")])])]),e("p",[t._v("Returns "),e("strong",[t._v("this")])]),t._v(" "),e("h2",{attrs:{id:"store"}},[e("a",{staticClass:"header-anchor",attrs:{href:"#store"}},[t._v("#")]),t._v(" store")]),t._v(" "),e("p",[t._v("Store assets data to the selected storage")]),t._v(" "),e("h3",{attrs:{id:"parameters-4"}},[e("a",{staticClass:"header-anchor",attrs:{href:"#parameters-4"}},[t._v("#")]),t._v(" Parameters")]),t._v(" "),e("ul",[e("li",[e("code",[t._v("noStore")]),t._v(" "),e("strong",[e("a",{attrs:{href:"https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Boolean",target:"_blank",rel:"noopener noreferrer"}},[t._v("Boolean"),e("OutboundLink")],1)]),t._v(" If true, won't store")])]),t._v(" "),e("h3",{attrs:{id:"examples-4"}},[e("a",{staticClass:"header-anchor",attrs:{href:"#examples-4"}},[t._v("#")]),t._v(" Examples")]),t._v(" "),e("div",{staticClass:"language-javascript extra-class"},[e("pre",{pre:!0,attrs:{class:"language-javascript"}},[e("code",[e("span",{pre:!0,attrs:{class:"token keyword"}},[t._v("var")]),t._v(" assets "),e("span",{pre:!0,attrs:{class:"token operator"}},[t._v("=")]),t._v(" assetManager"),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(".")]),e("span",{pre:!0,attrs:{class:"token function"}},[t._v("store")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("(")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(")")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(";")]),t._v("\n")])])]),e("p",[t._v("Returns "),e("strong",[e("a",{attrs:{href:"https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object",target:"_blank",rel:"noopener noreferrer"}},[t._v("Object"),e("OutboundLink")],1)]),t._v(" Data to store")]),t._v(" "),e("h2",{attrs:{id:"load"}},[e("a",{staticClass:"header-anchor",attrs:{href:"#load"}},[t._v("#")]),t._v(" load")]),t._v(" "),e("p",[t._v("Load data from the passed object.\nThe fetched data will be added to the collection.")]),t._v(" "),e("h3",{attrs:{id:"parameters-5"}},[e("a",{staticClass:"header-anchor",attrs:{href:"#parameters-5"}},[t._v("#")]),t._v(" Parameters")]),t._v(" "),e("ul",[e("li",[e("code",[t._v("data")]),t._v(" "),e("strong",[e("a",{attrs:{href:"https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object",target:"_blank",rel:"noopener noreferrer"}},[t._v("Object"),e("OutboundLink")],1)]),t._v(" Object of data to load (optional, default "),e("code",[t._v("{}")]),t._v(")")])]),t._v(" "),e("h3",{attrs:{id:"examples-5"}},[e("a",{staticClass:"header-anchor",attrs:{href:"#examples-5"}},[t._v("#")]),t._v(" Examples")]),t._v(" "),e("div",{staticClass:"language-javascript extra-class"},[e("pre",{pre:!0,attrs:{class:"language-javascript"}},[e("code",[e("span",{pre:!0,attrs:{class:"token keyword"}},[t._v("var")]),t._v(" assets "),e("span",{pre:!0,attrs:{class:"token operator"}},[t._v("=")]),t._v(" assetManager"),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(".")]),e("span",{pre:!0,attrs:{class:"token function"}},[t._v("load")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("(")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("{")]),t._v("\n\tassets"),e("span",{pre:!0,attrs:{class:"token operator"}},[t._v(":")]),t._v(" "),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("[")]),e("span",{pre:!0,attrs:{class:"token operator"}},[t._v("...")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("]")]),t._v("\n"),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("}")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(")")]),t._v("\n")])])]),e("p",[t._v("Returns "),e("strong",[e("a",{attrs:{href:"https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object",target:"_blank",rel:"noopener noreferrer"}},[t._v("Object"),e("OutboundLink")],1)]),t._v(" Loaded assets")]),t._v(" "),e("h2",{attrs:{id:"getcontainer"}},[e("a",{staticClass:"header-anchor",attrs:{href:"#getcontainer"}},[t._v("#")]),t._v(" getContainer")]),t._v(" "),e("p",[t._v("Return the Asset Manager Container")]),t._v(" "),e("p",[t._v("Returns "),e("strong",[e("a",{attrs:{href:"https://developer.mozilla.org/docs/Web/HTML/Element",target:"_blank",rel:"noopener noreferrer"}},[t._v("HTMLElement"),e("OutboundLink")],1)])]),t._v(" "),e("h2",{attrs:{id:"getassetsel"}},[e("a",{staticClass:"header-anchor",attrs:{href:"#getassetsel"}},[t._v("#")]),t._v(" getAssetsEl")]),t._v(" "),e("p",[t._v("Get assets element container")]),t._v(" "),e("p",[t._v("Returns "),e("strong",[e("a",{attrs:{href:"https://developer.mozilla.org/docs/Web/HTML/Element",target:"_blank",rel:"noopener noreferrer"}},[t._v("HTMLElement"),e("OutboundLink")],1)])]),t._v(" "),e("h2",{attrs:{id:"render"}},[e("a",{staticClass:"header-anchor",attrs:{href:"#render"}},[t._v("#")]),t._v(" render")]),t._v(" "),e("p",[t._v("Render assets")]),t._v(" "),e("h3",{attrs:{id:"parameters-6"}},[e("a",{staticClass:"header-anchor",attrs:{href:"#parameters-6"}},[t._v("#")]),t._v(" Parameters")]),t._v(" "),e("ul",[e("li",[e("code",[t._v("assets")]),t._v(" "),e("strong",[e("a",{attrs:{href:"https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array",target:"_blank",rel:"noopener noreferrer"}},[t._v("array"),e("OutboundLink")],1)]),t._v(" Assets to render, without the argument will render\nall global assets")])]),t._v(" "),e("h3",{attrs:{id:"examples-6"}},[e("a",{staticClass:"header-anchor",attrs:{href:"#examples-6"}},[t._v("#")]),t._v(" Examples")]),t._v(" "),e("div",{staticClass:"language-javascript extra-class"},[e("pre",{pre:!0,attrs:{class:"language-javascript"}},[e("code",[e("span",{pre:!0,attrs:{class:"token comment"}},[t._v("// Render all assets")]),t._v("\nassetManager"),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(".")]),e("span",{pre:!0,attrs:{class:"token function"}},[t._v("render")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("(")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(")")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(";")]),t._v("\n\n"),e("span",{pre:!0,attrs:{class:"token comment"}},[t._v("// Render some of the assets")]),t._v("\n"),e("span",{pre:!0,attrs:{class:"token keyword"}},[t._v("const")]),t._v(" assets "),e("span",{pre:!0,attrs:{class:"token operator"}},[t._v("=")]),t._v(" assetManager"),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(".")]),e("span",{pre:!0,attrs:{class:"token function"}},[t._v("getAll")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("(")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(")")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(";")]),t._v("\nassetManager"),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(".")]),e("span",{pre:!0,attrs:{class:"token function"}},[t._v("render")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("(")]),t._v("assets"),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(".")]),e("span",{pre:!0,attrs:{class:"token function"}},[t._v("filter")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("(")]),t._v("\n "),e("span",{pre:!0,attrs:{class:"token parameter"}},[t._v("asset")]),t._v(" "),e("span",{pre:!0,attrs:{class:"token operator"}},[t._v("=>")]),t._v(" asset"),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(".")]),e("span",{pre:!0,attrs:{class:"token function"}},[t._v("get")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("(")]),e("span",{pre:!0,attrs:{class:"token string"}},[t._v("'category'")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(")")]),t._v(" "),e("span",{pre:!0,attrs:{class:"token operator"}},[t._v("==")]),t._v(" "),e("span",{pre:!0,attrs:{class:"token string"}},[t._v("'cats'")]),t._v("\n"),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(")")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(")")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(";")]),t._v("\n")])])]),e("p",[t._v("Returns "),e("strong",[e("a",{attrs:{href:"https://developer.mozilla.org/docs/Web/HTML/Element",target:"_blank",rel:"noopener noreferrer"}},[t._v("HTMLElement"),e("OutboundLink")],1)])]),t._v(" "),e("h2",{attrs:{id:"addtype"}},[e("a",{staticClass:"header-anchor",attrs:{href:"#addtype"}},[t._v("#")]),t._v(" addType")]),t._v(" "),e("p",[t._v("Add new type. If you want to get more about type definition we suggest to read the "),e("RouterLink",{attrs:{to:"/modules/Assets.html"}},[t._v("module's page")])],1),t._v(" "),e("h3",{attrs:{id:"parameters-7"}},[e("a",{staticClass:"header-anchor",attrs:{href:"#parameters-7"}},[t._v("#")]),t._v(" Parameters")]),t._v(" "),e("ul",[e("li",[e("code",[t._v("id")]),t._v(" "),e("strong",[e("a",{attrs:{href:"https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/String",target:"_blank",rel:"noopener noreferrer"}},[t._v("string"),e("OutboundLink")],1)]),t._v(" Type ID")]),t._v(" "),e("li",[e("code",[t._v("definition")]),t._v(" "),e("strong",[e("a",{attrs:{href:"https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object",target:"_blank",rel:"noopener noreferrer"}},[t._v("Object"),e("OutboundLink")],1)]),t._v(" Definition of the type. Each definition contains\n"),e("code",[t._v("model")]),t._v(" (business logic), "),e("code",[t._v("view")]),t._v(" (presentation logic)\nand "),e("code",[t._v("isType")]),t._v(" function which recognize the type of the\npassed entity")])]),t._v(" "),e("h3",{attrs:{id:"examples-7"}},[e("a",{staticClass:"header-anchor",attrs:{href:"#examples-7"}},[t._v("#")]),t._v(" Examples")]),t._v(" "),e("div",{staticClass:"language-javascript extra-class"},[e("pre",{pre:!0,attrs:{class:"language-javascript"}},[e("code",[t._v("assetManager"),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(".")]),e("span",{pre:!0,attrs:{class:"token function"}},[t._v("addType")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("(")]),e("span",{pre:!0,attrs:{class:"token string"}},[t._v("'my-type'")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(",")]),t._v(" "),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("{")]),t._v("\n model"),e("span",{pre:!0,attrs:{class:"token operator"}},[t._v(":")]),t._v(" "),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("{")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("}")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(",")]),t._v("\n view"),e("span",{pre:!0,attrs:{class:"token operator"}},[t._v(":")]),t._v(" "),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("{")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("}")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(",")]),t._v("\n "),e("span",{pre:!0,attrs:{class:"token function-variable function"}},[t._v("isType")]),e("span",{pre:!0,attrs:{class:"token operator"}},[t._v(":")]),t._v(" "),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("(")]),e("span",{pre:!0,attrs:{class:"token parameter"}},[t._v("value")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(")")]),t._v(" "),e("span",{pre:!0,attrs:{class:"token operator"}},[t._v("=>")]),t._v(" "),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("{")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("}")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(",")]),t._v("\n"),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v("}")]),e("span",{pre:!0,attrs:{class:"token punctuation"}},[t._v(")")]),t._v("\n")])])]),e("h2",{attrs:{id:"gettype"}},[e("a",{staticClass:"header-anchor",attrs:{href:"#gettype"}},[t._v("#")]),t._v(" getType")]),t._v(" "),e("p",[t._v("Get type")]),t._v(" "),e("h3",{attrs:{id:"parameters-8"}},[e("a",{staticClass:"header-anchor",attrs:{href:"#parameters-8"}},[t._v("#")]),t._v(" Parameters")]),t._v(" "),e("ul",[e("li",[e("code",[t._v("id")]),t._v(" "),e("strong",[e("a",{attrs:{href:"https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/String",target:"_blank",rel:"noopener noreferrer"}},[t._v("string"),e("OutboundLink")],1)]),t._v(" Type ID")])]),t._v(" "),e("p",[t._v("Returns "),e("strong",[e("a",{attrs:{href:"https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object",target:"_blank",rel:"noopener noreferrer"}},[t._v("Object"),e("OutboundLink")],1)]),t._v(" Type definition")]),t._v(" "),e("h2",{attrs:{id:"gettypes"}},[e("a",{staticClass:"header-anchor",attrs:{href:"#gettypes"}},[t._v("#")]),t._v(" getTypes")]),t._v(" "),e("p",[t._v("Get types")]),t._v(" "),e("p",[t._v("Returns "),e("strong",[e("a",{attrs:{href:"https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array",target:"_blank",rel:"noopener noreferrer"}},[t._v("Array"),e("OutboundLink")],1)])])])}),[],!1,null,null,null);a.default=r.exports}}]);