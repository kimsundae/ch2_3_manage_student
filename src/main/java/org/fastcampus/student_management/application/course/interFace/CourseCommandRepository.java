package org.fastcampus.student_management.application.course.interFace;

import org.fastcampus.student_management.domain.Course;

public interface CourseCommandRepository {
    void save(Course course);

}
