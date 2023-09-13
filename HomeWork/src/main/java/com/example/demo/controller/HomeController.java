package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.HomeService;
import java.util.*;
@RestController
public class HomeController 
{
@Autowired
HomeService hs;
@PostMapping("/save")
public ResponseEntity<Student> m1(@RequestBody Student s)
{
	Student s1=hs.m1(s);
	return new ResponseEntity<Student>(s1, HttpStatus.OK);
}

@GetMapping("/get")
public ResponseEntity<List<Student>> getalldata()
{
	List<Student>s=hs.getalldata();
	return new ResponseEntity<List<Student>>(s, HttpStatus.OK);
}
@DeleteMapping("/delete/{id}")
public ResponseEntity<String> deleteData(@PathVariable int id)
{
	hs.deleteData(id);
	return new ResponseEntity<String>("deleted", HttpStatus.OK);
}
@PutMapping("/update")
public ResponseEntity<Student> updateData(@RequestBody Student s1){
	
	Student s=hs.m1(s1);
	
	return new ResponseEntity<Student>(s,HttpStatus.OK);
}
}
