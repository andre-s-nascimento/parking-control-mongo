package com.snascimento.parkingcontrol.models;

import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("parking-spot-tb")
public class ParkingSpotModel  {
  @Id
  private String id;
  private String parkingSpotNumber;
  private String licensePlateCar;
  private String brandCar;
  private String modelCar;
  private String colorCar;
  private LocalDateTime registrationDate;
  private String responsibleName;
  private String apartment;
  private String block;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getParkingSpotNumber() {
    return parkingSpotNumber;
  }

  public void setParkingSpotNumber(String parkingSpotNumber) {
    this.parkingSpotNumber = parkingSpotNumber;
  }

  public String getLicensePlateCar() {
    return licensePlateCar;
  }

  public void setLicensePlateCar(String licensePlateCar) {
    this.licensePlateCar = licensePlateCar;
  }

  public String getBrandCar() {
    return brandCar;
  }

  public void setBrandCar(String brandCar) {
    this.brandCar = brandCar;
  }

  public String getModelCar() {
    return modelCar;
  }

  public void setModelCar(String modelCar) {
    this.modelCar = modelCar;
  }

  public String getColorCar() {
    return colorCar;
  }

  public void setColorCar(String colorCar) {
    this.colorCar = colorCar;
  }

  public LocalDateTime getRegistrationDate() {
    return registrationDate;
  }

  public void setRegistrationDate(LocalDateTime registrationDate) {
    this.registrationDate = registrationDate;
  }

  public String getResponsibleName() {
    return responsibleName;
  }

  public void setResponsibleName(String responsibleName) {
    this.responsibleName = responsibleName;
  }

  public String getApartment() {
    return apartment;
  }

  public void setApartment(String apartment) {
    this.apartment = apartment;
  }

  public String getBlock() {
    return block;
  }

  public void setBlock(String block) {
    this.block = block;
  }
}