package ru.derendyaev.ideathesis_user_service.employmentType.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.derendyaev.ideathesis_user_service.employmentType.model.EmploymentType;

@Repository
public interface EmploymentTypeRepository extends JpaRepository<EmploymentType, Long> {
}
