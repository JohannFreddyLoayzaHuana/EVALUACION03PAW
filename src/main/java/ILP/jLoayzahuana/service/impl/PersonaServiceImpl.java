package ILP.jLoayzahuana.service.impl;

import ILP.jLoayzahuana.dao.IPersonaDao;
import ILP.jLoayzahuana.entity.Persona;
import ILP.jLoayzahuana.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements IPersonaService {

    @Autowired
    private IPersonaDao personaDao;

    @Override
    public List<Persona> listarPersonas() {
        return this.personaDao.findAll();
    }
}
