package ru.derendyaev.ideathesis_user_service.degreeForm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.derendyaev.ideathesis_user_service.degreeForm.model.DegreeForm;

@Repository
public interface DegreeFormRepository extends JpaRepository<DegreeForm, Long> {
}
