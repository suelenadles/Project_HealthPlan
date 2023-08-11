package Project_HealthPlan.healthPlan.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import Project_HealthPlan.healthPlan.model.DoctorModel;

public interface DoctorRepository extends MongoRepository<DoctorModel, String> {

}
