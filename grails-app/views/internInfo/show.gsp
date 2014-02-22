
<%@ page import="internshipchina.InternInfo" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'internInfo.label', default: 'InternInfo')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-internInfo" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-internInfo" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list internInfo">
			
				<g:if test="${internInfoInstance?.category}">
				<li class="fieldcontain">
					<span id="category-label" class="property-label"><g:message code="internInfo.category.label" default="Category" /></span>
					
						<span class="property-value" aria-labelledby="category-label"><g:fieldValue bean="${internInfoInstance}" field="category"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${internInfoInstance?.date}">
				<li class="fieldcontain">
					<span id="date-label" class="property-label"><g:message code="internInfo.date.label" default="Date" /></span>
					
						<span class="property-value" aria-labelledby="date-label"><g:fieldValue bean="${internInfoInstance}" field="date"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${internInfoInstance?.description}">
				<li class="fieldcontain">
					<span id="description-label" class="property-label"><g:message code="internInfo.description.label" default="Description" /></span>
					
						<span class="property-value" aria-labelledby="description-label"><g:fieldValue bean="${internInfoInstance}" field="description"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${internInfoInstance?.location}">
				<li class="fieldcontain">
					<span id="location-label" class="property-label"><g:message code="internInfo.location.label" default="Location" /></span>
					
						<span class="property-value" aria-labelledby="location-label"><g:fieldValue bean="${internInfoInstance}" field="location"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${internInfoInstance?.source}">
				<li class="fieldcontain">
					<span id="source-label" class="property-label"><g:message code="internInfo.source.label" default="Source" /></span>
					
						<span class="property-value" aria-labelledby="source-label"><g:fieldValue bean="${internInfoInstance}" field="source"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${internInfoInstance?.title}">
				<li class="fieldcontain">
					<span id="title-label" class="property-label"><g:message code="internInfo.title.label" default="Title" /></span>
					
						<span class="property-value" aria-labelledby="title-label"><g:fieldValue bean="${internInfoInstance}" field="title"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:internInfoInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${internInfoInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
