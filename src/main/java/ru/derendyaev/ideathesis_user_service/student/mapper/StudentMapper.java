package ru.derendyaev.ideathesis_user_service.student.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.derendyaev.ideathesis_user_service.degreeForm.model.DegreeForm;
import ru.derendyaev.ideathesis_user_service.degreeForm.repository.DegreeFormRepository;
import ru.derendyaev.ideathesis_user_service.degreeLevel.model.DegreeLevel;
import ru.derendyaev.ideathesis_user_service.degreeLevel.repository.DegreeLevelRepository;
import ru.derendyaev.ideathesis_user_service.department.Department;
import ru.derendyaev.ideathesis_user_service.department.DepartmentRepository;
import ru.derendyaev.ideathesis_user_service.student.dto.StudentAllDto;
import ru.derendyaev.ideathesis_user_service.student.model.Student;
import ru.derendyaev.ideathesis_user_service.studentGroup.model.StudentGroup;
import ru.derendyaev.ideathesis_user_service.studentGroup.repository.StudentGroupRepository;
import ru.derendyaev.ideathesis_user_service.user.model.User;

@Component
public class StudentMapper {

    @Autowired
    private StudentGroupRepository studentGroupRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private DegreeLevelRepository degreeLevelRepository;

    @Autowired
    private DegreeFormRepository degreeFormRepository;

    public StudentAllDto toStudentAllDto(Student student) {
        User user = student.getUser();
        StudentGroup group = student.getGroup();
        Department department = student.getDepartment();
        DegreeLevel degreeLevel = student.getDegreeLevel();
        DegreeForm degreeForm = student.getDegreeForm();

        return StudentAllDto.builder()
                .guid(student.getGuid())
                .fullName(user.getFullName())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .middleName(user.getMiddleName())
                .email(user.getEmail())
                .phone(user.getPhone())
                .userType(user.getUserType())
                .version(user.getVersion())
                .createdAt(user.getCreatedAt())
                .updatedAt(user.getUpdatedAt())
                .course(student.getCourse())
                .startYear(student.getStartYear())
                .studentGroup(group)
                .department(department)
                .degreeLevel(degreeLevel)
                .degreeForm(degreeForm)
                .build();
    }
}