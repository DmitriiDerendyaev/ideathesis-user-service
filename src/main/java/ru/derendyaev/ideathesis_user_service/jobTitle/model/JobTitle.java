package ru.derendyaev.ideathesis_user_service.jobTitle.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "job_titles")
@Data
@Builder
@NoArgsConstructor // Для JPA
@AllArgsConstructor // Для Builder
public class JobTitle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    public JobTitle(String name) {
        this.name = name;
    }
}