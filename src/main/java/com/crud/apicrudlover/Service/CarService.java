package com.crud.apicrudlover.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.crud.apicrudlover.Dto.CarDTO;
import com.crud.apicrudlover.Model.Car;
import com.crud.apicrudlover.Repository.CarRepository;

@Service
public class CarService {
  @Autowired
  private CarRepository repository;

  public List<Car> findAll(){
    return repository.findAll();
  }

  public void save(@RequestBody CarDTO req) {
    repository.save(new Car(req));
  }

  public void deleteById(Long id){
    repository.deleteById(id);
  }

  public void update(Long id, CarDTO req){
    repository.findById(id).map(car -> {
      car.setModelo(req.modelo());
      car.setFabricante(req.fabricante());
      car.setDataFabricacao(req.dataFabricacao());
      car.setValor(req.valor());
      car.setAnoModelo(req.anoModelo());

      return repository.save(car);
    });
  }

}
