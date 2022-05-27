package ILP.jLoayzahuana.entity;

import javax.persistence.*;

@Entity
@Table(name = "direccion")
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigoDirec;

    @Column(name = "calle", nullable = false, length = 50)
    private String calle;

    @Column(name = "estado", nullable = false, length = 50)
    private String estado;

    @Column(name = "codigo_Postal", nullable = false, length = 50)
    private String codigoPostal;

    @Column(name = "pais", nullable = false, length = 50)
    private String pais;

    @OneToOne
    @JoinColumn(name = "idpersona", referencedColumnName = "idpersona")
    private Persona persona;

    public Direccion() {
    }

    public Direccion(String calle, String estado, String codigoPostal, String pais, Persona persona) {
        this.calle = calle;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
        this.pais = pais;
        this.persona = persona;
    }

    public Direccion(long codigoDirec, String calle, String estado, String codigoPostal, String pais, Persona persona) {
        this.codigoDirec = codigoDirec;
        this.calle = calle;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
        this.pais = pais;
        this.persona = persona;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
