package ma.enset.jeespringhospitalapp;

import ma.enset.jeespringhospitalapp.entites.Patient;
import ma.enset.jeespringhospitalapp.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class JeeSpringHospitalAppApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(JeeSpringHospitalAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        patientRepository.save(new Patient(null, "Mohamed", new Date(), false, 55));
        patientRepository.save(new Patient(null, "Amina", new Date(), true, 70));
        patientRepository.save(new Patient(null, "Karim", new Date(), false, 80));
        patientRepository.save(new Patient(null, "Sara", new Date(), true, 40));
        patientRepository.save(new Patient(null, "Hassan", new Date(), false, 90));
        patientRepository.save(new Patient(null, "Yasmine", new Date(), true, 60));
        patientRepository.save(new Patient(null, "Omar", new Date(), false, 75));
        patientRepository.save(new Patient(null, "Fatima", new Date(), true, 50));
    }
}
