package ms.bc48.com.ini.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("MovementTypes")
public class MovementType {
	
	@Id
	private String id;
	private String movementTypeCode;
	private String movementTypeName;

}
