package org.example.verificacion.service;

import org.example.verificacion.dto.CourseRequest;
import org.example.verificacion.model.Course;

import java.util.List;

public interface CourseService {

    Course create(CourseRequest request);

    List<Course> findAll();

    Course findById(Long id);

    Course update(Long id, CourseRequest request);

    void delete(Long id);
}
