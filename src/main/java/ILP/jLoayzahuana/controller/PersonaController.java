package ILP.jLoayzahuana.controller;

import ILP.jLoayzahuana.dao.IPersonaDao;
import ILP.jLoayzahuana.entity.Persona;
import ILP.jLoayzahuana.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("principalPersona")
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

    @GetMapping("/listaPersonas")
    public List<Persona> listarPersonas(){
        return this.personaService.listarPersonas();
    }


}
