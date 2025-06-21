package org.fastcampus.student_management.application.course;

import java.util.List;
import org.fastcampus.student_management.domain.Course;
import org.fastcampus.student_management.domain.DayOfWeek;

public interface CourseRepository {
    void save(Course course);

    List<Course> getCourseDayOfWeek(DayOfWeek dayOfWeek);

    List<Course> getCourseListByStudent(String studentName);

}
