package ru.derendyaev.ideathesis_user_service.student.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;
import ru.derendyaev.ideathesis_user_service.degreeForm.model.DegreeForm;
import ru.derendyaev.ideathesis_user_service.degreeLevel.model.DegreeLevel;
import ru.derendyaev.ideathesis_user_service.department.Department;
import ru.derendyaev.ideathesis_user_service.studentGroup.model.StudentGroup;
import ru.derendyaev.ideathesis_user_service.user.model.User;

import java.util.UUID;

@Entity
@Table(name = "students")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@DynamicUpdate
public class Student {
    @Id
    private UUID guid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id")
    private StudentGroup group;

    private Integer course;
    private Integer startYear;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "degree_level_id")
    private DegreeLevel degreeLevel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "degree_form_id")
    private DegreeForm degreeForm;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "guid")
    private User user;

    @Version
    private Long version;
}