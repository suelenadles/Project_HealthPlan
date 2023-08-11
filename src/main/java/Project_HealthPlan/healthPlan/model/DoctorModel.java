package Project_HealthPlan.healthPlan.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class DoctorModel {
    @Id
    private String id;
    private String name;
    private String email;
    private String telefone;
    private String especialidade;

    public DoctorModel(String id, String name, String email, String telefone, String especialidade) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.telefone = telefone;
        this.especialidade = especialidade;
    }

    public void generatedId() {
        this.id = new ObjectId().toString();
    }
}
