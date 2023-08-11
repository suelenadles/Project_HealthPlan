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

import Project_HealthPlan.healthPlan.model.DoctorModel;
import Project_HealthPlan.healthPlan.service.DoctorService;

@RestController
@RequestMapping("/HealthPlan")
public class DoctorController {

    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @PostMapping("/registrationDoctor")
    public ResponseEntity<DoctorModel> createDoctorModel(@RequestBody DoctorModel doctorModel) {
        DoctorModel createdDoctorModel = doctorService.createDoctor(doctorModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdDoctorModel);
    }

    @GetMapping("/{id}")
    public DoctorModel getDoctorModel(@PathVariable String id) {
        return doctorService.getDoctorById(id);
    }

    @PutMapping("/editDataDoctor/{id}")
    public DoctorModel updateDoctorModel(@PathVariable String id, @RequestBody DoctorModel doctorModel) {
        return doctorService.updateDoctor(id, doctorModel);
    }

    @DeleteMapping("/deleteDoctor/{id}")
    public void deleteDoctor(@PathVariable String id) {
        doctorService.deleteDoctor(id);
    }

}
