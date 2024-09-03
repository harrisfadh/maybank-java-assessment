package com.maybank.assessment.maybankassessment.repository;

import com.maybank.assessment.maybankassessment.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
