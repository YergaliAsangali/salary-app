package com.project.employee.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Employee {

    @Id
    @GeneratedValue
    private Long employeeId;

    private String first_name;

    private String last_name;

    @CreatedDate
    private LocalDateTime create_at;

    private Long hourOfWorkingSinceLastSalary;

    private Long position_id;
}
