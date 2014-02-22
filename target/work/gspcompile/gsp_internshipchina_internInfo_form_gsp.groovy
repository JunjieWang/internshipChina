import internshipchina.InternInfo
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_internshipchina_internInfo_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/internInfo/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: internInfoInstance, field: 'category', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("internInfo.category.label"),'default':("Category")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("category"),'value':(internInfoInstance?.category)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: internInfoInstance, field: 'date', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("internInfo.date.label"),'default':("Date")],-1)
printHtmlPart(2)
invokeTag('textField','g',18,['name':("date"),'value':(internInfoInstance?.date)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: internInfoInstance, field: 'description', 'error'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("internInfo.description.label"),'default':("Description")],-1)
printHtmlPart(2)
invokeTag('textField','g',26,['name':("description"),'value':(internInfoInstance?.description)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: internInfoInstance, field: 'location', 'error'))
printHtmlPart(6)
invokeTag('message','g',31,['code':("internInfo.location.label"),'default':("Location")],-1)
printHtmlPart(2)
invokeTag('textField','g',34,['name':("location"),'value':(internInfoInstance?.location)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: internInfoInstance, field: 'source', 'error'))
printHtmlPart(7)
invokeTag('message','g',39,['code':("internInfo.source.label"),'default':("Source")],-1)
printHtmlPart(2)
invokeTag('textField','g',42,['name':("source"),'value':(internInfoInstance?.source)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: internInfoInstance, field: 'title', 'error'))
printHtmlPart(8)
invokeTag('message','g',47,['code':("internInfo.title.label"),'default':("Title")],-1)
printHtmlPart(2)
invokeTag('textField','g',50,['name':("title"),'value':(internInfoInstance?.title)],-1)
printHtmlPart(9)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392872466390L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
