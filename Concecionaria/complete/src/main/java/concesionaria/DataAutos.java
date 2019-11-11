package concesionaria;
import java.util.HashMap;

import org.springframework.stereotype.Service;
@Service
public class DataAutos {
public static HashMap<String,caracteristicas> autos = new HashMap<String,caracteristicas>();
static {
	caracteristicas datos = new caracteristicas("Peugeot","208","Rojo y Blanco",8000);
	caracteristicas datos1 = new caracteristicas("Fiat","Argo","Azul, Blanco y Rojo",10000);
	caracteristicas datos2 = new caracteristicas("Fiat","Mobi","Amarillo y Negro",7000);
	caracteristicas datos3 = new caracteristicas("Fiat","Uno","Blanco y Negro",6500);
	caracteristicas datos4 = new caracteristicas("Peugeot","Traveller","Blanco, Negro y Gris",47000);
	caracteristicas datos5 = new caracteristicas("Peugeot","Partner","Verde y Azul",22000);
	caracteristicas datos6 = new caracteristicas("Audi","A1","Negro",11000);
	caracteristicas datos7 = new caracteristicas("Audi","A2","Blanco, Gris Oscuro y Gris Claro",17000);
	caracteristicas datos8 = new caracteristicas("Audi","A3","Blanco",26000);
	caracteristicas datos9 = new caracteristicas("Audi","TT","Rojo, Azul y Blanco",30000);
	autos.put(datos.getModelo(),datos);
	autos.put(datos1.getModelo(),datos1);
	autos.put(datos2.getModelo(),datos2);
	autos.put(datos3.getModelo(),datos3);
	autos.put(datos4.getModelo(),datos4);
	autos.put(datos5.getModelo(),datos5);
	autos.put(datos6.getModelo(),datos6);//SOY UN IDIOTA!!!
	autos.put(datos7.getModelo(),datos7);
	autos.put(datos8.getModelo(),datos8);
	autos.put(datos9.getModelo(),datos9);
	
}
}
