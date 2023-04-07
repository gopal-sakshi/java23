A Servlet is a Java program that runs within a web server

javax.servlet & javax.servlet.http packages 
- contain interfaces and classes for creating servlets

All servlets should implement the Servlet interface, which defines life-cycle methods.


Web servers 
- capable enough to serve static HTML requests
- but they don't know how to deal with dynamic requests & databases. 
    hence, we need a language for dynamic content; 
    these languages are PHP, Python, Java, Ruby on Rails
- In Java, there are two technologies Servlet & JSPs
    that deals with dynamic content and database. 
    Java also provides frameworks such as Spring, Spring Boot, Hibernate, Struts to use the servlet and JSP easily.

----------------------------------------------------------------------------------------------------------------------------------
Tomcat
- open-source Java servlet container
- it implements many Java Enterprise Specs 
    Websites API
    Java-Server Pages
    Java Servlet. 
- Tomcat = one of the most widely used java-server

EXPLANATION
- If you want to provide any web-services 
    such as you want to provide a simple static content
    or maybe you just want to send data from a server to point you
- you necessarily need a server
- AND that server is HTTP (HyperText transfer protocol).
- If anyone wants to make a simple, static website ----------------> he definitely requires an HTTP server
    We use the HTTP server if we want to send simple data.
- But if he wants to make website dynamic, he has to use servlet. 
    we want to send dynamic data or to make our website dynamic, we need to use the servlet. 
- Hence, we need an HTTP server plus a container where we will run or servlet
- So, when we combine the HTTP server and the servlet container ---------> they both combine to become a single server know as tomcat server.
- The Apache Tomcat ============> HTTP server + servlet container


----------------------------------------------------------------------------------------------------------------------------------

difference between 
- Apache Tomcat
- Apache HTTP Server
    

Apache Tomcat
- delivers content that changes depending upon 
    who the client is, 
    whether the client has signed in 
    what the client has done on previous interactions with the server
- meaning = dynamic content
- Prerequisites = local JDK installation
- competitors = JBoss, Jetty, Payara, Wildfly
- deployment
    applications deployed to the Tomcat server must be packaged as web application archives (.war) files




Apache HTTP Server
- Apache has become the colloquial name for the Apache HTTP Server. 
- simply serve static files to --------> web-based clients
- static files = such as text, HTML, images, audio & video files
- Prerequisites = Linux (or) Windows OS
- competitors = NodeJS runtime, Nginx, Microsoft IIS
- deployment
    Resources placed under '\htdocs' become accessible to incoming requests
- Despite the fact that Apache HTTP Server deals with static content, 
    it is possible for it to deliver dynamic content if you install various modules or extensions, such as Perl, Python, PHP add-ons.
----------------------------------------------------------------------------------------------------------------------------------

Modern software architectures embrace a three-tiered approach to content delivery.
- client or presentation tier
    Apache HTTP Server resides on this client tier. 
    It is the first server-side resource a client interacts with when a request is made, 
    and Apache HTTP Server itself sends a final response back to the client.
- If a request is for a simple, static file such as HTML or an image, the Apache web server will send that file back to the client. 
- If the request requires some logic, the Apache web server passes the request to the Tomcat server. 
- As such, the Tomcat server is considered to be part of the middle-tier of a modern software architecture topology.
- If a request requires it to perform logic, 
    a Tomcat server may need to interact with a relational database, a NoSQL datastore or even a message queue. 
    These resources are said to be part of the back-end tier -- or the third tier -- in a modern architecture.
- So the typical request flow in a three-tier architecture is to 
    first hit the Apache web server, 
    followed by the middle-tier Tomcat server and 
    then Tomcat interacts with databases and other resources in the back-end tier. 
- Tomcat aggregates the results and passes them to the Apache HTTP Server, and the HTTP server then sends the final response back to the client.

----------------------------------------------------------------------------------------------------------------------------------