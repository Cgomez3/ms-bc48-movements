package ms.bc48.com.ini.services;

import io.reactivex.rxjava3.core.Single;
import ms.bc48.com.ini.model.Movement;
import ms.bc48.com.ini.model.ParamRequest;

public interface MovementService {
     Single<String> makeDeposit(ParamRequest paramRequest);
}
