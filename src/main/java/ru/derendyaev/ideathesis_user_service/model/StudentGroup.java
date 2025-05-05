package ru.derendyaev.ideathesis_user_service.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student_groups")
@Data
@Builder
@NoArgsConstructor // Для JPA
@AllArgsConstructor // Для Builder
public class StudentGroup {

    public StudentGroup(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;
}