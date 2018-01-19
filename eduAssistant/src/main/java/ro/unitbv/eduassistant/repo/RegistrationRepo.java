package ro.unitbv.eduassistant.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ro.unitbv.eduassistant.model.Lesson;
import ro.unitbv.eduassistant.model.Registration;

public interface RegistrationRepo extends JpaRepository<Registration, Long>{
	
	Optional<Lesson> findById(Long id);

}