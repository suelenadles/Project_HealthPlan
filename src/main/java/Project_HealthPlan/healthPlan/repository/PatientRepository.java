package Project_HealthPlan.healthPlan.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import Project_HealthPlan.healthPlan.model.PatientModel;

public interface PatientRepository extends MongoRepository<PatientModel, String> {

}
