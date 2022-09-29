package com.example.SpringBootProcess.repo;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootProcess.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Id>{

}
