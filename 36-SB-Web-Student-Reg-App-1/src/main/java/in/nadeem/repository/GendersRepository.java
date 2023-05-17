package in.nadeem.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nadeem.entity.Genders;

public interface GendersRepository extends JpaRepository<Genders, Serializable> {

}
 