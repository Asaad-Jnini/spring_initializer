package com.example.spring_initializer.service;

import com.example.spring_initializer.dao.entities.Computer;
import com.example.spring_initializer.service.dtos.ComputerDTO;

public interface ComputerManager {

    public ComputerDTO getComputerByProce(String Proce);


    public ComputerDTO getComputerByPrice(Float Price);


    public ComputerDTO saveComputer(Computer computerDTO);


    ComputerDTO saveComputer(ComputerDTO computerDTO);

    public ComputerDTO deleteComputer(ComputerDTO computerDTO);
}
