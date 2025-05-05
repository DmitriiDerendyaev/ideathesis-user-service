package ru.derendyaev.ideathesis_user_service.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.derendyaev.ideathesis_user_service.employee.model.EmployeeEmployment;

@Repository
public interface EmployeeEmploymentRepository extends JpaRepository<EmployeeEmployment, Long> {
}
