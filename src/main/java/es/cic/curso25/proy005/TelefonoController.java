package es.cic.curso25.proy005;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/telefono")
public class TelefonoController {

    @Autowired
    private TelefonoService telefonoService;

    private int contador = 0;
    // C R U D

    @PostMapping
    public long create(@RequestBody Telefono telefono) {
        long id = telefonoService.create(telefono);

        return id;
    }

    @GetMapping
    public List<Telefono> get(){
        List<Telefono> resultado = new ArrayList<>();

        Telefono telefono1 = new Telefono();
        telefono1.setId(1);
        telefono1.setNumero("5555555");
        telefono1.setTipoContrato(3);
        telefono1.setTitular("Hugo");

        resultado.add(telefono1);

        Telefono telefono2 = new Telefono();
        telefono2.setId(2);
        telefono2.setNumero("5555556");
        telefono2.setTipoContrato(1);
        telefono2.setTitular("Pepe");
        
        resultado.add(telefono2);

        return resultado;
    }

    @GetMapping("/{id}")
    public Telefono get(@PathVariable long id){

        Telefono telefono1 = new Telefono();
        telefono1.setId(id);
        telefono1.setNumero("5555555");
        telefono1.setTipoContrato(3);
        telefono1.setTitular("Fran");

        return telefono1;
    }

    @PutMapping
    public void update(@RequestBody Telefono telefono) {

    }

    @DeleteMapping ("/{id}")
    public void delete(@PathVariable long id) {
        contador = contador;
    }

}
