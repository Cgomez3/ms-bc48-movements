package ms.bc48.com.ini.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import io.reactivex.rxjava3.core.Maybe;
import ms.bc48.com.ini.config.FeignClientConfig;
import ms.bc48.com.ini.model.Account;
import ms.bc48.com.ini.model.ParamRequest;


@FeignClient(value="MS-ACCOUNT",configuration = FeignClientConfig.class )
public interface AccountRest {

	
	@PostMapping("/get-account")
	public Maybe<Account> getAccount(@RequestBody ParamRequest paramRequest);
	
	@GetMapping(value="/pru",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String getdata();
}
