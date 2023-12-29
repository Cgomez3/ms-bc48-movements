package ms.bc48.com.ini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ms.bc48.com.ini.model.ParamRequest;
import ms.bc48.com.ini.services.MovementService;

@RestController
@RequestMapping("/api/movement")
@CrossOrigin(value = {"*"})
public class MovementController {
	
	@Autowired
	private MovementService movementService;

	@PostMapping
	public ResponseEntity<?> makeDeposit(@RequestBody ParamRequest paramRequest){
		movementService.makeDeposit(paramRequest);
		return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(paramRequest.toString());
	}

}
