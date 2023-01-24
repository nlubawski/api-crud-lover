package com.crud.apicrudlover.Controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.apicrudlover.Dto.CarDTO;
import com.crud.apicrudlover.Model.Car;
import com.crud.apicrudlover.Repository.CarRepository;
import com.crud.apicrudlover.Service.CarService;

@RestController
@RequestMapping("/api/cars")
public class CarController {

  @Autowired
  private CarService service;

  @GetMapping
  public List<Car> listAll() {
    return service.findAll();
  }

  @PostMapping
  public void create(@RequestBody CarDTO req) {
    service.save(req);
  }

  @PutMapping("/{id}")
  public void updateCar(@PathVariable Long id, @RequestBody CarDTO req){
    service.update(id, req);
  }

  @DeleteMapping("/{id}")
  public void deleteCar(@PathVariable Long id) {
    service.deleteById(id);
  }
}