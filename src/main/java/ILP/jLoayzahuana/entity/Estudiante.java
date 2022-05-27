package ILP.jLoayzahuana.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="estudiante")
@PrimaryKeyJoinColumn(referencedColumnName = "IDPERSONA")
public class Estudiante extends Persona{

    @Column(name = "codigo",length = 10, nullable = false)
    private String codigo;

    @Column(name = "serie",length = 10)
    private String serie;

    public Estudiante() {
    }

    public Estudiante(String codigo, String serie) {
        this.codigo = codigo;
        this.serie = serie;
    }

    public Estudiante(long idpersona, String codigoEstudiante, String serie) {
        super(idpersona);
        this.codigo = codigoEstudiante;
        this.serie = serie;
    }

    public Estudiante(String nombre, int telefono, String email, String codigoEstudiante, String serie) {
        super(nombre, telefono, email);
        this.codigo = codigoEstudiante;
        this.serie = serie;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}
