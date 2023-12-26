package com.example.spring_initializer.dao.repositories;

import com.example.spring_initializer.dao.entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerRepositorie extends JpaRepository<Computer, Long> {
}
