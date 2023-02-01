package com.snascimento.parkingcontrol.repositories;

import com.snascimento.parkingcontrol.models.ParkingSpotModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ParkingSpotRepository extends MongoRepository<ParkingSpotModel, String> {

  boolean existsByLicensePlateCar(String licensePlateCar);

  boolean existsByParkingSpotNumber(String parkingSpotNumber);

  boolean existsByApartmentAndBlock(String apartment, String block);
}
