package Project_HealthPlan.healthPlan.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Project_HealthPlan.healthPlan.model.PatientModel;
import Project_HealthPlan.healthPlan.service.PatientService;

@RestController
@RequestMapping("/HealthPlan")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping("/registrationPatient")
    public ResponseEntity<PatientModel> createDoctorModel(@RequestBody PatientModel patientModel) {
        PatientModel createdPatientModel = patientService.createPatient(patientModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPatientModel);
    }

    @GetMapping("/{id}")
    public PatientModel getPatient(@PathVariable String id) {
        return patientService.getPatientById(id);
    }

    @PutMapping("/editDataPatient/{id}")
    public PatientModel updatePatient(@PathVariable String id, @RequestBody PatientModel patientModel) {
        return patientService.updatePatient(id, patientModel);
    }

    @DeleteMapping("/deletePatient/{id}")
    public void deleteDoctor(@PathVariable String id) {
        patientService.deletePatient(id);
    }

}
