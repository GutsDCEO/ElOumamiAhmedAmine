package com.revision.control.service;

import com.revision.control.dao.entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerService  {

    Computer addComputer(Computer computer);
    Computer getComputer(String macAddress);


}
