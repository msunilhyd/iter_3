package com.sunil.springBootH2.dao;


import com.sunil.springBootH2.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>  {
}
