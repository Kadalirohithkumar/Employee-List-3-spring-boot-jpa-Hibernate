package com.example.employee.repository;

import com.example.employee.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface EmployeeJpaRepository extends JpaRepository<Employee, Integer> {

}
