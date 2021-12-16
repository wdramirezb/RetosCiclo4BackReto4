package com.ciclo4.catalogo.repository.crud;

import com.ciclo4.catalogo.model.Order;
import java.util.Date;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Flia Ramirez Palacio
 */
public interface OrderCrudRepository extends MongoRepository<Order, Integer> {

    /**
     * Consultar las órdenes que se han creado para una zona en particular.
     */
    List<Order> findBySalesManZone(String zone);

    List<Order> findBySalesManId(Integer id);

    List<Order> findBySalesManIdAndStatus(Integer id, String status);

    List<Order> findByRegisterDayAndSalesManId(Date registerDay, Integer id);

}
