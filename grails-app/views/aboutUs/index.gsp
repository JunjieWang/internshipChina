
<%@ page import="internshipchina.AboutUs" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<title>About Us</title>
	</head>
	<body>
            <div class="container" >
			<div class="jumbotron" style="margin-top: 40px; font-size: 15px;">
			  <h3>About Us</h3>
			  <p>Developer: <a href="https://github.com/tzheng">T.Zheng</a>  <a href="https://www.devwang.com">J.J.Wang </a> </p>
			  <p>
			  	This is a website to proivde reilable internship job opportunities for Chinese college student.
			  	It's a non-profit website.
			  	We will share the source code as well as the architecture of this website after full implementation.
			  	Our sever has web scraper class to collect intership job information from some reliable resource (e.g. university bbs).
			  	<br /> <br />
			  	In China, when a company needs to hire some interns, it usually ask alumni to post job opportunites on their universities' BBS. 
			  	And only student and alumni can post article/information on university BBS.
			  	Therefore, university BBS is a very reliable information source for internship information. It hardly has fake information.
			  	<br /> <br />
			  	The problem is that it's almost impossible for an individual to access tens of BBS in one time because 
			  	usually he/she does not have so many accounts. 
			  	So we decided to solve this problem by collecting information from different BBS and present here. 
			  	It's much more convinient for student to just visit one website.
			  </p>
			  
			  <h3>Architecture</h3>
			  <p>
			  	Our project is host on Amazon AWS. <br />
			  	<b>Backend</b> Java as back end, using web scraper class to retrieve internship hiring Information from different university BBS 
			  	in China. Centralize in one website.  <br />
			  	How the web scraper works?<br />
			  	We use HttpClient API to fetch data from certern websites in our list. 
			  	Then we use our own word analysis tool to abstract internship information such as location, contact information..
			  	Since most of the content are well-structured, we don't have much problem in this part. <br />
			  	<b>Frontend</b> Bootstrap as template, with customized css. 
			  	
			  </p>
			  
			  <h3>Future Plan</h3>
			  <p>
			  	In the future, we want to add social function to our website. 
			  	User can login to manage a favorite list, resume and more personalization functions.
			  	Companies can post internship information directly on our website through alumni. We don't allow company to register account.
			  	The reason is that we don't want to be a LinkedIn. You might notice that many companies post job opportunities on Linkedin
			  	but they might not actually want to hire new people. It's better to build a community for referral. A community for those who really
			  	want to hire interns.  
			  	For the web content analysis, we want to implement auto-category function, thus we can enable filter to have more funcitons.
			  	We actually want to implement REST API.
			  </p>
			  
			</div>
		</div>
	</body>
</html>
