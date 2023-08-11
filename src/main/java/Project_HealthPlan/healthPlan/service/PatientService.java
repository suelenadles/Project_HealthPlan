package Project_HealthPlan.healthPlan.service;

import org.springframework.stereotype.Service;

import Project_HealthPlan.healthPlan.model.PatientModel;
import Project_HealthPlan.healthPlan.repository.PatientRepository;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public PatientModel createPatient(PatientModel patientModel) {
        return patientRepository.save(patientModel);
    }

    public PatientModel getPatientById(String id) {
        return patientRepository.findById(id)
                .orElseThrow();
    }

    public PatientModel updatePatient(String id, PatientModel patientModel) {
        patientModel.generatedId();
        return patientRepository.save(patientModel);
    }

    public void deletePatient(String id) {
        patientRepository.deleteById(id);
    }
}
