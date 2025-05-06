package ru.derendyaev.ideathesis_user_service.staffCategory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.derendyaev.ideathesis_user_service.staffCategory.model.StaffCategory;
import ru.derendyaev.ideathesis_user_service.staffCategory.repository.StaffCategoryRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StaffCategoryService {

    @Autowired
    private StaffCategoryRepository staffCategoryRepository;

    public List<StaffCategory> getAllStaffCategories() {
        return staffCategoryRepository.findAll();
    }

    public Optional<StaffCategory> getStaffCategoryById(Long id) {
        return staffCategoryRepository.findById(id);
    }
}
