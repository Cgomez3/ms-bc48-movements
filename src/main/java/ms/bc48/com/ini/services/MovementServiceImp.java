package ms.bc48.com.ini.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.reactivex.rxjava3.core.Single;
import ms.bc48.com.ini.clients.AccountRest;
import ms.bc48.com.ini.model.Movement;
import ms.bc48.com.ini.model.ParamRequest;

@Service
public class MovementServiceImp implements MovementService{
	
	@Autowired
	private AccountRest accountRest;

	@Override
	public Single<String> makeDeposit(ParamRequest paramRequest) {
		return Single.just(accountRest.getdata());
	}

}
