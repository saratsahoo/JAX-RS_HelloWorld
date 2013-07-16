package com.cbs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("helloworldrs")
public class HelloWorldRS {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String greeting(){
		return "Hello Sarat";
	}
	
}
