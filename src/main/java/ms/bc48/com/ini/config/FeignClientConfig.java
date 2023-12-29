package ms.bc48.com.ini.config;

import org.springframework.cloud.openfeign.support.SpringMvcContract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Contract;
import feign.Logger;

@Configuration
public class FeignClientConfig {

	Logger.Level feingLoggerLevel(){
		return Logger.Level.FULL;
	}
	
	@Bean
    public Contract feignContract() {
		return new feign.Contract.Default();
    }
}
