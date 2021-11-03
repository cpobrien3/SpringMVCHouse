package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;


/**
 * @author Christian O'Brien - cpobrien3
 * CIS175 - Fall 2021
 * Oct 21, 2021
 */

@Entity
@Data
public class House {
	@Id
	@GeneratedValue
	private long id;
	private int numOfBedrooms;
	private int numOfBathrooms;
	private String address;
	private double price;
	@Autowired
	private HomeOwner owner;
	
	@Autowired 
	private EstateAgent agent;
	


	
}

