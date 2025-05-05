package ru.derendyaev.ideathesis_user_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.derendyaev.ideathesis_user_service.model.Subdivision;

@Repository
public interface SubdivisionRepository extends JpaRepository<Subdivision, Long> {
}
