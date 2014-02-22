
<%@ page import="internshipchina.InternInfo" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'internInfo.label', default: 'InternInfo')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-internInfo" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-internInfo" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="category" title="${message(code: 'internInfo.category.label', default: 'Category')}" />
					
						<g:sortableColumn property="date" title="${message(code: 'internInfo.date.label', default: 'Date')}" />
					
						<g:sortableColumn property="description" title="${message(code: 'internInfo.description.label', default: 'Description')}" />
					
						<g:sortableColumn property="location" title="${message(code: 'internInfo.location.label', default: 'Location')}" />
					
						<g:sortableColumn property="source" title="${message(code: 'internInfo.source.label', default: 'Source')}" />
					
						<g:sortableColumn property="title" title="${message(code: 'internInfo.title.label', default: 'Title')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${internInfoInstanceList}" status="i" var="internInfoInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${internInfoInstance.id}">${fieldValue(bean: internInfoInstance, field: "category")}</g:link></td>
					
						<td>${fieldValue(bean: internInfoInstance, field: "date")}</td>
					
						<td>${fieldValue(bean: internInfoInstance, field: "description")}</td>
					
						<td>${fieldValue(bean: internInfoInstance, field: "location")}</td>
					
						<td>${fieldValue(bean: internInfoInstance, field: "source")}</td>
					
						<td>${fieldValue(bean: internInfoInstance, field: "title")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${internInfoInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
