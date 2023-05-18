package com.zakia.motors.service;

import java.util.List;

import com.zakia.motors.entities.Motor;
import com.zakia.motors.entities.Type;

public interface MotorService {
	Motor saveMotor(Motor m);
	Motor updateMotor(Motor m);
	void deleteMotor(Motor m);
	void deleteMotorById(Long id);
	Motor getMotor(Long id);
	List <Motor> getAllMotors();
	List<Motor> findByNomMotor(String nom);
	List<Motor> findByNomMotorContains(String nom);
	List<Motor> findByNomPrix (String nom, Double prix);
	List<Motor> findByType (Type type);
	List<Motor> findByTypeIdTyp(Long id);
	List<Motor> findByOrderByNomMotorAsc();
	List<Motor> trierMotorsNomsPrix();

}
