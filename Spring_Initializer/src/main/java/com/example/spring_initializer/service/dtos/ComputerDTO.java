package com.example.spring_initializer.service.dtos;
import lombok.*;
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
@ToString
public class ComputerDTO {
    private String Proce;
    private String ram;
    private String hardDrive;
    private Float price;
}
