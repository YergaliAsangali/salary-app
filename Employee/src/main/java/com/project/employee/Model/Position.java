package com.project.employee.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Position {

    @Id
    @GeneratedValue
    private Long positionId;

    private String title;

    private byte working_hour_per_week;

    private String description;

    private Long insurance_id;
}
