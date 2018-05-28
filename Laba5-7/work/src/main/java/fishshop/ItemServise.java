package fishshop;


import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;
import java.util.HashMap;
import fishshop.Good;

import fishshop.persistence.dao.*;
import java.util.Map;

@Path("/good")
@SessionScoped
public class ItemServise {
    @Inject
    private FishShop manager;

    private static final long serialVersionUID = 1L;

    private static Map<Integer, Good> goodMap = new HashMap<>();

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public final Good getGoodMap(final @PathParam("id") Integer id) {
        return goodMap.get(id);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response createGood(final Good good) {
        goodMap.put(good.getId(), good);
        return Response.status(200).entity("Items").build();
    }

    @DELETE
    @Path("/{id}")
    public final Response deleteGood(final @PathParam("id") Integer id) {
        goodMap.remove(id);
        return Response.status(200).entity("Item").build();
    }

    @POST
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response replaceGood(final @PathParam("id") Integer id,final Good good) {
        goodMap.replace(id, good);
        return Response.status(200).entity("Items").build();
    }

}
