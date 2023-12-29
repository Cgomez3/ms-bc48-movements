package ms.bc48.com.ini.clients;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "MS-CUSTOMER")
public interface CustomerRest {

}
