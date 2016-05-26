package services;


import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import datamodel.Item;
import datamodel.DaoItems;
import datamodel.Peticiones;

@Path("/sensor")
public class DimeSensor{
	List<Peticiones> peticiones_app = new ArrayList<Peticiones>();
	  @Context
	  UriInfo uriInfo;
	  @Context
	  Request request;
	  
	  @GET
	  @Path("/{param}/{param2}")
	  @Produces(MediaType.TEXT_PLAIN)
	  public String getSaludoHTML(@PathParam("param") String id_robot,@PathParam("param2") String id_sensor) {
		  Peticiones nueva = new Peticiones("1",id_robot,id_sensor);
		  peticiones_app.add(nueva);
		  return nueva.toString();
	    }
	  

	  /*@GET
	    @Path("/{param}")
	    @Produces(MediaType.TEXT_HTML)
	    public String getSaludoHTML(@PathParam("param") String nombre) {
	        return "<html> " + "<title>" + "Hola Mundo" + "</title>"  
	             + "<body><h1>" + "Hola Mundo en HTML : " + nombre 
	             + "</body></h1>" + "</html> ";
	    }
	    
	    @GET
	    @Produces(MediaType.TEXT_PLAIN)
	    public String getSaludoPlain() {
	        return "Hola mundo!"  ;
	    }*/
}