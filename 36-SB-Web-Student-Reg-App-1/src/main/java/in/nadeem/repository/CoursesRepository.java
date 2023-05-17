package in.nadeem.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nadeem.entity.Courses;

public interface CoursesRepository extends JpaRepository<Courses, Serializable> {

}
