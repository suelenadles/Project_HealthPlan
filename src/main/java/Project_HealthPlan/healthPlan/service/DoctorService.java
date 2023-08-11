package Project_HealthPlan.healthPlan.service;

import org.springframework.stereotype.Service;

import Project_HealthPlan.healthPlan.model.DoctorModel;
import Project_HealthPlan.healthPlan.repository.DoctorRepository;

@Service
public class DoctorService {

    private final DoctorRepository doctorRepository;

    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public DoctorModel createDoctor(DoctorModel doctorModel) {
        return doctorRepository.save(doctorModel);
    }

    public DoctorModel getDoctorById(String id) {
        return doctorRepository.findById(id)
                .orElseThrow();
    }

    public DoctorModel updateDoctor(String id, DoctorModel doctorModel) {
        doctorModel.generatedId();
        return doctorRepository.save(doctorModel);
    }

    public void deleteDoctor(String id) {
        doctorRepository.deleteById(id);
    }

}
