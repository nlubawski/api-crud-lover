package com.crud.apicrudlover.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.apicrudlover.Dto.CarDTO;
import com.crud.apicrudlover.Model.Car;
import com.crud.apicrudlover.Repository.CarRepository;

@RestController
@RequestMapping("/api/cars")
public class CarController {

  @Autowired
  private CarRepository repository;

  @GetMapping
  public List<Car> listAll(){
    return repository.findAll();
  }

  @PostMapping
  public void create(@RequestBody CarDTO req) {
    repository.save(new Car(req));
  }
}