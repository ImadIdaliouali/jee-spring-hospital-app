package ma.enset.jeespringhospitalapp.repository;

import ma.enset.jeespringhospitalapp.entites.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
