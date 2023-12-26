package com.example.spring_initializer.dao.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @Builder
@NoArgsConstructor
@AllArgsConstructor @ToString
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id_Pc;
    private String Proce;
    private String ram;
    private String hardDrive;
    private Float price;
    private String macAddress;
}
