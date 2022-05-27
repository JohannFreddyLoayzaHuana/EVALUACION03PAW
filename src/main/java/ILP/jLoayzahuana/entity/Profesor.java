package ILP.jLoayzahuana.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Profesor")
@PrimaryKeyJoinColumn(referencedColumnName = "IDPERSONA")
public class Profesor extends Persona{

    private int salario;

    public Profesor() {
    }

    public Profesor(int salario) {
        this.salario = salario;
    }

    public Profesor(String nombre, int telefono, String email, int salario) {
        super(nombre, telefono, email);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
