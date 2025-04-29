package com.revision.control.service;

import com.revision.control.dao.entities.Computer;
import com.revision.control.dao.repositories.ComputerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ComputerManager implements ComputerService {


    @Autowired
    private ComputerRepository computerRepository;


    @Override
    public Computer addComputer(Computer computer) {


        if (computerRepository.findByMacAddress(computer.getMacAddress()) != null) {
            System.out.println("Computer already exists");
        }
        return computerRepository.save(computer);

    }


    @Override
    public Computer getComputer(String macAddress) {
        return computerRepository.findByMacAddress( macAddress );
    }

}
