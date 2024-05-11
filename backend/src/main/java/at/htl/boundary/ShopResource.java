package at.htl.boundary;

import at.htl.model.Order;
import at.htl.repository.ShopRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("shop")
public class ShopResource {
    @Inject
    ShopRepository shopRepository;

    @POST
    @Path("createOrder")
    public Response createOrder(List<Long> productIds){
        System.out.println(productIds);
        Order newOrder =  shopRepository.createOrder(productIds);

        return Response.status(201).build();
    }
}
