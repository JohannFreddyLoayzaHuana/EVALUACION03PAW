package ILP.jLoayzahuana.dao;

import ILP.jLoayzahuana.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstudianteDao extends JpaRepository<Estudiante,Long> {

    //Estudiante findByCodigoEstudiante(String codigo);
}
