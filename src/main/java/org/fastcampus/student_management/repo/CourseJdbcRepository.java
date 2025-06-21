package org.fastcampus.student_management.repo;

import java.util.Collections;
import java.util.List;
import org.fastcampus.student_management.application.course.CourseRepository;
import org.fastcampus.student_management.domain.Course;
import org.fastcampus.student_management.domain.DayOfWeek;

public class CourseJdbcRepository implements CourseRepository {

    @Override
    public void save(Course course) {

    }

    @Override
    public List<Course> getCourseDayOfWeek(DayOfWeek dayOfWeek) {
        return Collections.emptyList();
    }

    @Override
    public List<Course> getCourseListByStudent(String studentName) {
        return Collections.emptyList();
    }
}
