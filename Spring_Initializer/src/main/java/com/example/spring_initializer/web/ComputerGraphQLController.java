package com.example.spring_initializer.web;


import com.example.spring_initializer.service.ComputerManager;
import com.example.spring_initializer.service.dtos.ComputerDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ComputerGraphQLController {
    @Autowired
    public ComputerManager computerManager;

    @QueryMapping
    public ComputerDTO getComputerByPrice(@Argument Float Price){
        return computerManager.getComputerByPrice(Price);
    }
    @QueryMapping
    public ComputerDTO getComputerByProce(@Argument String Proce){
        return computerManager.getComputerByProce(Proce);
    }

    //saveCreator(creatorDto: CreatorDTOInput) : CreatorDTO
    @MutationMapping
    public ComputerDTO saveComputer(@Argument ComputerDTO computerDto){

        return computerManager.saveComputer(computerDto);
    }
    // deleteComputer(id: ID):ComputerDTO
    @MutationMapping
    public ComputerDTO deleteComputer(@Argument ComputerDTO computerDto){

        return computerManager.deleteComputer(computerDto);
    }

}
