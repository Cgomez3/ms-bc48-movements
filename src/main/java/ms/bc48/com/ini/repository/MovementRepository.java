package ms.bc48.com.ini.repository;

import org.springframework.data.repository.reactive.RxJava3CrudRepository;

import ms.bc48.com.ini.model.Movement;

public interface MovementRepository  extends RxJava3CrudRepository<Movement, String>{

}
