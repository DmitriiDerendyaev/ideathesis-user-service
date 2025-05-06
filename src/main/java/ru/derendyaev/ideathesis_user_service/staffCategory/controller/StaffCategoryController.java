package ru.derendyaev.ideathesis_user_service.staffCategory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.derendyaev.ideathesis_user_service.staffCategory.service.StaffCategoryService;
import ru.derendyaev.ideathesis_user_service.staffCategory.model.StaffCategory;

import java.util.List;

@RestController
@RequestMapping("/api/staff-categories")
public class StaffCategoryController {

    @Autowired
    private StaffCategoryService staffCategoryService;

    @GetMapping
    public List<StaffCategory> getAllStaffCategories() {
        return staffCategoryService.getAllStaffCategories();
    }

    @GetMapping("/{id}")
    public ResponseEntity<StaffCategory> getStaffCategoryById(@PathVariable Long id) {
        return staffCategoryService.getStaffCategoryById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
