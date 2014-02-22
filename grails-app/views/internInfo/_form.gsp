<%@ page import="internshipchina.InternInfo" %>



<div class="fieldcontain ${hasErrors(bean: internInfoInstance, field: 'category', 'error')} ">
	<label for="category">
		<g:message code="internInfo.category.label" default="Category" />
		
	</label>
	<g:textField name="category" value="${internInfoInstance?.category}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: internInfoInstance, field: 'date', 'error')} ">
	<label for="date">
		<g:message code="internInfo.date.label" default="Date" />
		
	</label>
	<g:textField name="date" value="${internInfoInstance?.date}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: internInfoInstance, field: 'description', 'error')} ">
	<label for="description">
		<g:message code="internInfo.description.label" default="Description" />
		
	</label>
	<g:textField name="description" value="${internInfoInstance?.description}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: internInfoInstance, field: 'location', 'error')} ">
	<label for="location">
		<g:message code="internInfo.location.label" default="Location" />
		
	</label>
	<g:textField name="location" value="${internInfoInstance?.location}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: internInfoInstance, field: 'source', 'error')} ">
	<label for="source">
		<g:message code="internInfo.source.label" default="Source" />
		
	</label>
	<g:textField name="source" value="${internInfoInstance?.source}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: internInfoInstance, field: 'title', 'error')} ">
	<label for="title">
		<g:message code="internInfo.title.label" default="Title" />
		
	</label>
	<g:textField name="title" value="${internInfoInstance?.title}"/>
</div>

