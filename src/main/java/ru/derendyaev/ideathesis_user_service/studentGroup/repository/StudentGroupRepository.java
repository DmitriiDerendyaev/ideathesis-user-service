package ru.derendyaev.ideathesis_user_service.studentGroup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.derendyaev.ideathesis_user_service.studentGroup.model.StudentGroup;

@Repository
public interface StudentGroupRepository extends JpaRepository<StudentGroup, Long> {
}
