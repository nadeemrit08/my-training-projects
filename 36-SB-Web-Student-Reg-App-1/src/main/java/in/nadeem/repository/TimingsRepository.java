package in.nadeem.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nadeem.entity.Timings;

public interface TimingsRepository extends JpaRepository<Timings, Serializable> {

}
