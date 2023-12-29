package ms.bc48.com.ini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class MsBc48MovementsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsBc48MovementsApplication.class, args);
	}

}
