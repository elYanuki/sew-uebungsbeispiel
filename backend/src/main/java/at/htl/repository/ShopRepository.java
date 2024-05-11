package at.htl.repository;

import at.htl.model.Order;
import at.htl.model.Product;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

import java.util.LinkedList;
import java.util.List;

@ApplicationScoped
public class ShopRepository {
    @Inject
    EntityManager em;

    @Transactional
    public Order createOrder(List<Long> productIds){
        List<Product> productList = new LinkedList<Product>();

        for(Long id : productIds){
            productList.add(em.find(Product.class, id));
        }

        Order newOrder = new Order(productList);

        em.persist(newOrder);

        return newOrder;
    }
}
