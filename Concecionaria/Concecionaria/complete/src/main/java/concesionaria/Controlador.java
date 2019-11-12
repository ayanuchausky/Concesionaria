package concesionaria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class Controlador {
	@Autowired
	Servicio sv;
    @GetMapping("/")
    public String ingresarForm(Model model) {
        model.addAttribute("vendedor", new Usuario());
        return "ingreso";
    }

    @PostMapping("/")
    public String ingresarSubmit(@ModelAttribute Usuario vendedor) {
    	if (sv.validarIngreso(vendedor.getUser(), vendedor.getPassword())) {
    		System.out.println("Ingreso validado!");
    		return "ingresoOK";}
    	else {
    		System.out.println("Ingreso incorrecto");
    		return "ingresoMal";}
    }
    
    @GetMapping("/CargaVehiculo")
    public String cargarForm(Model model) {
    	model.addAttribute("DatosVehiculo", new caracteristicas());
    	return "cargardatos";
    }
    
    @PostMapping("/CargaVehiculo")
    public String cargarSubmit(@ModelAttribute caracteristicas DatosVehiculo) {
    	sv.pasaraDataAutos(DatosVehiculo);
    	return"cargaOK";
    }
    
    @GetMapping("/Buscar")
    public String buscarForm(Model model) {
    	model.addAttribute("search",new Busqueda());
    	return "busqueda";
    }
    
    @PostMapping("/Buscar")
    public String buscarSubmit(@ModelAttribute Busqueda search, Model model) {
    	search.setResultado(sv.buscarAutos(search.getMarca(), search.getMin(), search.getMax()));
    	System.out.println("Datos buscados:");
    	System.out.println(search.getMarca());
    	System.out.println(search.getMin());
    	System.out.println(search.getMax());
    	model.addAttribute("Encontrados", search.getResultado());
    	return "FinBusqueda";
    }
    

}
