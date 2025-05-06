package ru.derendyaev.ideathesis_user_service.degreeLevel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.derendyaev.ideathesis_user_service.degreeLevel.model.DegreeLevel;

@Repository
public interface DegreeLevelRepository extends JpaRepository<DegreeLevel, Long> {
}
