package snippet;

public class Snippet {
	server:
	  port: 8080
	
	spring:
	  datasource:
	    url: jdbc:mysql://localhost:3306/testdb
	    username: root
	    password: root
	  jpa:
	    hibernate:
	      ddl-auto: update
	    show-sql: true
	
}

