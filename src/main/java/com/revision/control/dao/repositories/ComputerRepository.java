package com.revision.control.dao.repositories;

import com.revision.control.dao.entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerRepository extends JpaRepository {

    Computer save(Computer computer);
    Computer findByMacAddress(String macAddress);


}
