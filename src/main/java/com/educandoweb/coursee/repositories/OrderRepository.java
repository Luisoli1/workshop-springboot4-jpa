package com.educandoweb.coursee.repositories;

import com.educandoweb.coursee.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
