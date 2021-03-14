package org.acme.lifecycle;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/utils/people")
@Produces(MediaType.APPLICATION_JSON)
public class PersonResource {

  @GET
  @Path("/name/{name}")
  public Person getPersonByName(@PathParam("name") String name) {
    return Person.findByName(name);
  }

  @GET
  @Path("/role/{role}")
  public Response getPersonByRole(@PathParam("role") String name) {
    return Response.status(200).entity(Person.findByRoleName(name)).build();
  }


}