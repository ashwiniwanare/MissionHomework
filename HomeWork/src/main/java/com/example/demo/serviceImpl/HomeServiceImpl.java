package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.HomeRepository;
import com.example.demo.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService
{
@Autowired
HomeRepository hr;
	@Override
	public Student m1(Student s)
	{ 
		
		return hr.save(s);
	}
	@Override
	public List<Student> getalldata() {
		
		return hr.findAll();
	}

}
