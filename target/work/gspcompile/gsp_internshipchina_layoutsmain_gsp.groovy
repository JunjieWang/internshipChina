import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_internshipchina_layoutsmain_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/main.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge,chrome=1")],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('layoutTitle','g',10,['default':("Grails")],-1)
})
invokeTag('captureTitle','sitemesh',10,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',10,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(2)
expressionOut.print(resource(dir: 'images', file: 'favicon.ico'))
printHtmlPart(3)
expressionOut.print(resource(dir: 'images', file: 'apple-touch-icon.png'))
printHtmlPart(4)
expressionOut.print(resource(dir: 'images', file: 'apple-touch-icon-retina.png'))
printHtmlPart(5)
expressionOut.print(resource(dir: 'css', file: 'bootstrap.css'))
printHtmlPart(6)
expressionOut.print(resource(dir: 'css', file: 'index.css'))
printHtmlPart(7)
expressionOut.print(resource(dir: 'fonts', file: 'glyphicons-halflings-regular.eot'))
printHtmlPart(8)
expressionOut.print(resource(dir: 'fonts', file: 'glyphicons-halflings-regular.eot?#iefix'))
printHtmlPart(9)
expressionOut.print(resource(dir: 'fonts', file: 'glyphicons-halflings-regular.woff'))
printHtmlPart(10)
expressionOut.print(resource(dir: 'fonts', file: 'glyphicons-halflings-regular.ttf'))
printHtmlPart(11)
expressionOut.print(resource(dir: 'fonts', file: 'glyphicons-halflings-regular.svg#glyphicons-halflingsregular'))
printHtmlPart(12)
invokeTag('layoutHead','g',24,[:],-1)
printHtmlPart(1)
invokeTag('javascript','g',25,['library':("application")],-1)
printHtmlPart(13)
invokeTag('layoutResources','r',26,[:],-1)
printHtmlPart(14)
})
invokeTag('captureHead','sitemesh',27,[:],1)
printHtmlPart(14)
createTagBody(1, {->
printHtmlPart(15)
invokeTag('layoutBody','g',66,[:],-1)
printHtmlPart(16)
invokeTag('layoutResources','r',68,[:],-1)
printHtmlPart(17)
})
invokeTag('captureBody','sitemesh',83,[:],1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392786274552L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
