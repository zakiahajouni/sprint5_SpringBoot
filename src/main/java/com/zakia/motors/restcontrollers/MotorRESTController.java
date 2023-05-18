package com.zakia.motors.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zakia.motors.entities.Motor;
import com.zakia.motors.service.MotorService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class MotorRESTController {
	
	@Autowired

MotorService motorService ;
	
	@RequestMapping(path="all",method = RequestMethod.GET)
	public List<Motor> getAllMotors()
	{
		
		return motorService.getAllMotors();
	}

	@RequestMapping(value="/getbyid/{id}",method = RequestMethod.GET)
	public Motor getMotorById(@PathVariable("id") Long id) 
	{
	return motorService.getMotor(id);
	
	}
	@RequestMapping(path="/addmotor",method = RequestMethod.POST)
	public Motor createMotor(@RequestBody Motor motor) {
	return motorService.saveMotor(motor);
	}

	@RequestMapping(path="/updatemotor",method = RequestMethod.PUT)
	public Motor updateMotor(@RequestBody Motor motor) {
	return motorService.updateMotor(motor);
	}
	@RequestMapping(value="/delmotor/{id}",method = RequestMethod.DELETE)
	public void deleteMotor(@PathVariable("id") Long id)
	{
	motorService.deleteMotorById(id);
	}
	@RequestMapping(value="/motostyp/{idTyp}",method = RequestMethod.GET)
	public List<Motor> getMotorsByTypId(@PathVariable("idTyp") Long idTyp) {
	return motorService.findByTypeIdTyp(idTyp);
	}


}
