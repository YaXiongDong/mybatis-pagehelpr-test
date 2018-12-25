package com.pxkj;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.pxkj.entity.StudentCourseList;
import com.pxkj.entity.User;
import com.pxkj.service.StudentCourseService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMybatisPagehelperApplicationTests {

	@Autowired
	private StudentCourseService studentCourseService;

	@Test
	public void contextLoads() {
		PageInfo<StudentCourseList> pageInfo = studentCourseService.getStudentCourses(1, 10);
		System.out.println(JSON.toJSONString(pageInfo));
	}

	@Test
	public void test1() {
		new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10000; i++) {
					PageInfo<User> pageInfo = studentCourseService.getUsers(1, 10);
					System.out.println("线程 " + i + ": " + JSON.toJSONString(pageInfo));
				}
			}
		}).start();
		
	}

}
