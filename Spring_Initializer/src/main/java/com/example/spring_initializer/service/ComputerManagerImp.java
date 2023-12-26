package com.example.spring_initializer.service;

import com.example.spring_initializer.service.dtos.ComputerDTO;
import com.example.spring_initializer.service.mapper.ComputerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComputerManagerImp implements ComputerManager{

    @Autowired
    public ComputerManager computerManager;
    @Autowired
    public ComputerMapper computerMapper;
    @Override
    public ComputerDTO getComputerByProce(String Proce) {
        return computerMapper.fromComputerToComputerDTO(computerManager.getComputerByProce(Proce).getProce();
    }

    @Override
    public ComputerDTO getComputerByPrice(Float Price) {
        return null;
    }

    @Override
    public ComputerDTO saveComputer(ComputerDTO computerDTO) {
        return null;
    }

    @Override
    public ComputerDTO deleteComputer(ComputerDTO computerDTO) {
        return null;
    }
}
