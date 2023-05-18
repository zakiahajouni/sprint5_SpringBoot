package com.zakia.motors;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.Query;

import com.zakia.motors.entities.Motor;
import com.zakia.motors.entities.Type;
import com.zakia.motors.repos.MotorRepository;

@SpringBootTest
class MotorsApplicationTests {

	@Autowired
	private MotorRepository motorRepository;
	@Test
	public void testCreateMotor() {
	Motor moto = new Motor("Tmax",50.000,new Date());
	motorRepository.save(moto);
	}
	@Test
	public void testFindMotor()
	{
	Motor m = motorRepository.findById(1L).get(); 
	System.out.println(m);
	}
	@Test
	public void testUpdateMotor()
	{
	Motor m = motorRepository.findById(1L).get();
	m.setPrixMotors(2000.0);
	motorRepository.save(m);
	System.out.println(m);
	}
	@Test
	public void testDeleteMotor()
	{
	motorRepository.deleteById(1L);;
	}
	@Test
	public void testListerTousMotors()
	{
	List<Motor> motos = motorRepository.findAll();
	for (Motor m : motos)
	{
	System.out.println(m);
	}
	}
	
	@Test
	public void testFindMotorByNom()
	{
		
		List<Motor> motos = motorRepository.findByNomMotors("Tmax");
	for (Motor m : motos)
	{
	System.out.println(m);
	}
	}
	@Test
	public void findByNomMotorsContains()
	{
		
		List<Motor> motos = motorRepository.findByNomMotorsContains("r");
	for (Motor m : motos)
	{
	System.out.println(m);
	}
	}
	@Test
	public void testfindByNomPrix()
	{
	List<Motor> motos = motorRepository.findByNomPrix("Tmax", 50.0);
	for (Motor m : motos)
	{
	System.out.println(m);
	}
	}
	@Test
	public void testfindByType()
	{
	Type typ = new Type();
	typ.setIdTyp(1L);
	List<Motor> motos = motorRepository.findByType(typ);
	for (Motor m : motos)
	{
	System.out.println(m);
	}
	}
	@Test
	public void findByTypeIdTyp()
	{
	List<Motor> motos = motorRepository.findByTypeIdTyp(1L);
	for (Motor m : motos)
	{
	System.out.println(m);
	}
	 }
	@Test
	public void testfindByOrderByNomMotorsAsc()
	{
	List<Motor> motos = motorRepository.findByOrderByNomMotorsAsc();
	for (Motor m : motos)
	{
	System.out.println(m);
	}
	}
	@Test
	public void testTrierMotorsNomsPrix()
	{
	List<Motor> motos = motorRepository.trierMotorsNomsPrix();
	for (Motor m : motos)
	{
	System.out.println(m);
	}
	}

	


	
	}



