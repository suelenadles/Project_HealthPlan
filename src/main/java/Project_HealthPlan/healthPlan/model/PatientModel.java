package Project_HealthPlan.healthPlan.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class PatientModel {

    @Id
    private String id;
    private String name;
    private String email;
    private String telefone;
    private String endereco;
    private String carteira_do_plano;

    public PatientModel(String id, String name, String email, String telefone, String endereco,
            String carteira_do_pano) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.carteira_do_plano = carteira_do_pano;
    }

    public void generatedId() {
        this.id = new ObjectId().toString();
    }
}
