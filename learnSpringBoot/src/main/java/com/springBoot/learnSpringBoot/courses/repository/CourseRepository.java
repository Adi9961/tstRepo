package com.springBoot.learnSpringBoot.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.learnSpringBoot.courses.bean.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
