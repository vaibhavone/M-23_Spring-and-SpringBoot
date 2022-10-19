package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
//jpa repository is exsist in spring data jpa dependancies and it contain
//all crud operation of spring jpa 
public interface StudentRepository extends JpaRepository<Student,Integer> 
{

}
