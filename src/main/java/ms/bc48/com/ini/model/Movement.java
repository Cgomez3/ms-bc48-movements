package ms.bc48.com.ini.model;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("Movements")
public class Movement {
	
	@Id
	private String id;
	private String movementNumber;
	private Account account;
	private Customer customer;
	private MovementType movementType;
	private BigDecimal movementAmount;
	private Date movementDate;
	
}
