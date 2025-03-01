package com.example.redis_practice.order;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<ItemOrder, String> {
  ItemOrder item(String item);

  ItemOrder findByid(String id);
}
