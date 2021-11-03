package dmacc.beans;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Christian O'Brien - cpobrien3
 * CIS175 - Fall 2021
 * Nov 3, 2021
 */

@Embeddable
@Data
@NoArgsConstructor
public class EstateAgent {
	private String name;
	private String phoneNumber;
	private String email;
}
