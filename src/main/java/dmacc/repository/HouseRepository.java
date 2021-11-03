package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dmacc.beans.House;

/**
 * @author Christian O'Brien - cpobrien3
 * CIS175 - Fall 2021
 * Oct 21, 2021
 */
public interface HouseRepository extends JpaRepository<House, Long>{

}
