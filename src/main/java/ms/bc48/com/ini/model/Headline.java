package ms.bc48.com.ini.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Headline {
	private String id;
	private String idCuenta;
	private String idCustomer;
	private boolean major;
	
}
