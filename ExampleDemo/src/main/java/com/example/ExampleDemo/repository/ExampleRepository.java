package com.example.ExampleDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ExampleDemo.entity.Employee;

public interface ExampleRepository extends JpaRepository<Employee, Integer> {

}
