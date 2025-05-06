package ru.derendyaev.ideathesis_user_service.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.derendyaev.ideathesis_user_service.department.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
