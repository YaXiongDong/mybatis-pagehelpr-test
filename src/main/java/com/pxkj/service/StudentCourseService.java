package com.pxkj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pxkj.dao.StudentCourseDao;
import com.pxkj.entity.StudentCourseList;
import com.pxkj.entity.User;

@Service
public class StudentCourseService {

	@Autowired
	private StudentCourseDao studentCourseDao;

	public PageInfo<StudentCourseList> getStudentCourses(int page, int pageSize) {
		PageHelper.startPage(page, pageSize);
		List<StudentCourseList> students = studentCourseDao.getStudentCourses();
		PageInfo<StudentCourseList> pageInfo = new PageInfo<>(students);
		return pageInfo;
	}

	public PageInfo<User> getUsers(int page, int pageSize) {
		PageHelper.startPage(page, pageSize);
		List<User> students = studentCourseDao.getUsers();
		PageInfo<User> pageInfo = new PageInfo<>(students);
		return pageInfo;
	}

}
