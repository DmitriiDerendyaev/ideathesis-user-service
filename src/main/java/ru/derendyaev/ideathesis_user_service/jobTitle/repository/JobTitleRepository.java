package ru.derendyaev.ideathesis_user_service.jobTitle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.derendyaev.ideathesis_user_service.jobTitle.model.JobTitle;

@Repository
public interface JobTitleRepository extends JpaRepository<JobTitle, Long> {
}
