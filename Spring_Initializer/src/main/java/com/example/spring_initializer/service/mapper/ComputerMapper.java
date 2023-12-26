package com.example.spring_initializer.service.mapper;

import com.example.spring_initializer.dao.entities.Computer;
import com.example.spring_initializer.service.dtos.ComputerDTO;
import org.modelmapper.ModelMapper;

public class ComputerMapper {
    private final ModelMapper modelMapper = new ModelMapper();

    public ComputerDTO fromComputerToComputerDTO(Computer computer){

        return this.modelMapper.map(computer,ComputerDTO.class);
    }

    public Computer fromComputerDTOToComputer(ComputerDTO computerDTO){
        return this.modelMapper.map(computerDTO,Computer.class);
    }
}
