package ILP.jLoayzahuana.entity;

import javax.persistence.*;

@Entity
@Table(name="persona")
@Inheritance( strategy = InheritanceType.JOINED )
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idpersona", length = 10)
    private long idpersona;

    @Column(name="nombre", length = 100, nullable = false)
    private String nombre;

    private int telefono;
    private String email;

    public Persona() {
    }

    public Persona(long idpersona) {
        this.idpersona = idpersona;
    }

    public Persona(String nombre, int telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public long getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(long idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
