package com.knownt.parkingcontrol.repositories;

import com.knownt.parkingcontrol.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

	boolean existsByParkingSpotNumber(String parkingSpotNumber);

	boolean existsByLicensePlateCar(String licensePlateCar);

	boolean existsByApartmentAndBlock(String apartment, String block);
}
