package com.pxkj.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.pxkj.entity.StudentCourseList;
import com.pxkj.entity.User;
@Mapper
public interface StudentCourseDao {
	
	@Select("select * from student_course_list")
	List<StudentCourseList> getStudentCourses();
	
	@Select("select * from user")
	List<User> getUsers();

}
