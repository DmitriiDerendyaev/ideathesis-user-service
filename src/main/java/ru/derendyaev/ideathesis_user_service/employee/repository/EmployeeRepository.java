package ru.derendyaev.ideathesis_user_service.employee.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.derendyaev.ideathesis_user_service.employee.model.Employee;

import java.util.List;
import java.util.UUID;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, UUID> {

    @Query("SELECT e FROM Employee e WHERE LOWER(e.fullName) LIKE LOWER(CONCAT('%', :fullName, '%'))")
    List<Employee> findByFullNameContainingIgnoreCase(@Param("fullName") String fullName, Pageable pageable);
}
