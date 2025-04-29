package com.revision.control;

import com.revision.control.dao.entities.Computer;
import com.revision.control.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ControlApplication implements CommandLineRunner {

	@Autowired
	private ComputerService computerService;



	public static void main(String[] args) {
		SpringApplication.run(ControlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		computerService.addComputer(new Computer(1,"i5 13eme gen","16RAM","500GB SSD",13000,"17f 44s fs4fc1"));
		computerService.addComputer(new Computer(2,"i5 12eme gen","16RAM","700GB SSD",13000,"17f 44s fsdsfc1"));

		computerService.getComputer("17f 44s fs4fc1");
		computerService.getComputer("17f 44s fs4fc1");
	}
}
