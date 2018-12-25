package com.pxkj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.pxkj.entity.StudentCourseList;
import com.pxkj.entity.User;
import com.pxkj.service.StudentCourseService;

@RestController
public class TestController {

	@Autowired
	private StudentCourseService studentCourseService;

	@GetMapping("/getUsers")
	public PageInfo<User> getUsers() {
		PageInfo<User> pageInfo = studentCourseService.getUsers(1, 10);
		return pageInfo;
	}

	@GetMapping("/getStudentCourses")
	public PageInfo<StudentCourseList> getStudentCourses() {
		PageInfo<StudentCourseList> pageInfo = studentCourseService.getStudentCourses(1, 10);
		return pageInfo;
	}

}
