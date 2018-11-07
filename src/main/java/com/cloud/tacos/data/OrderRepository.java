package com.cloud.tacos.data;

import com.cloud.tacos.Order;
import org.springframework.data.repository.CrudRepository;

//public interface OrderRepository {
//
//    Order save(Order order);
//
//}

public interface OrderRepository extends CrudRepository<Order, Long> {

}
