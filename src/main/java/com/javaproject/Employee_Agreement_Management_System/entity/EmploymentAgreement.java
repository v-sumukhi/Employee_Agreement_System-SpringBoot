package com.javaproject.Employee_Agreement_Management_System.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
public class EmploymentAgreement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String employeeName;
    private String role;
    private LocalDate startDate;
    private LocalDate endDate;
    private Double salary;
    private String terms;
}
