package com.crud.apicrudlover.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.apicrudlover.Model.Car;


public interface CarRepository extends JpaRepository<Car, Long> {
  


}
