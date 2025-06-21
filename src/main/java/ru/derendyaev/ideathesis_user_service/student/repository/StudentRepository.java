package ru.derendyaev.ideathesis_user_service.student.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.derendyaev.ideathesis_user_service.student.model.Student;

import java.util.List;
import java.util.UUID;

@Repository
public interface StudentRepository extends JpaRepository<Student, UUID> {

//    @Query("SELECT s FROM Student s WHERE " +
//            "( :groupName IS NULL OR (s.group IS NOT NULL AND LOWER(FUNCTION('convert_from', s.group.name, 'UTF8')) LIKE LOWER(CONCAT('%', :groupName, '%'))) ) " +
//            "AND ( :departmentName IS NULL OR (s.department IS NOT NULL AND LOWER(FUNCTION('convert_from', s.department.name, 'UTF8')) LIKE LOWER(CONCAT('%', :departmentName, '%'))) ) " +
//            "AND LOWER(FUNCTION('convert_from', s.user.fullName, 'UTF8')) LIKE LOWER(CONCAT('%', CASE WHEN :fullName IS NULL THEN '' ELSE :fullName END, '%'))")
//    List<Student> findStudentsByGroupDepartmentAndFullName(
//            @Param("groupName") String groupName,
//            @Param("departmentName") String departmentName,
//            @Param("fullName") String fullName,
//            Pageable pageable);

    @Query("""
            SELECT s
            FROM   Student s
            WHERE  (:groupName      IS NULL OR LOWER(s.group.name)      LIKE LOWER(CONCAT('%', :groupName, '%')))
              AND  (:departmentName IS NULL OR LOWER(s.department.name) LIKE LOWER(CONCAT('%', :departmentName, '%')))
              AND  (:fullName       IS NULL OR LOWER(s.user.fullName)   LIKE LOWER(CONCAT('%', :fullName, '%')))
            """)
    List<Student> findStudentsByGroupDepartmentAndFullName(
            @Param("groupName") String groupName,
            @Param("departmentName") String departmentName,
            @Param("fullName") String fullName,
            Pageable pageable);
}