package ru.derendyaev.ideathesis_user_service.employee.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import ru.derendyaev.ideathesis_user_service.employmentType.model.EmploymentType;
import ru.derendyaev.ideathesis_user_service.jobTitle.model.JobTitle;
import ru.derendyaev.ideathesis_user_service.staffCategory.model.StaffCategory;
import ru.derendyaev.ideathesis_user_service.subdivision.model.Subdivision;

@Entity
@Table(name = "employee_employments")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class EmployeeEmployment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_guid")
    @ToString.Exclude
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "job_title_id")
    private JobTitle jobTitle;

    @ManyToOne
    @JoinColumn(name = "staff_category_id")
    private StaffCategory staffCategory;

    @ManyToOne
    @JoinColumn(name = "employment_type_id")
    private EmploymentType employmentType;

    @ManyToOne
    @JoinColumn(name = "subdivision_id")
    private Subdivision subdivision;

    @Column(name = "job_state")
    private String jobState;
}