package concesionaria;
import org.springframework.stereotype.Service;
@Service
public class Servicio {
	String user="Agustin";
	String password="123";
	public boolean validarIngreso(String user, String password) {
		return((this.user.equals(user)&&(this.password.equals(password))));
	}
	public void pasaraDataAutos(caracteristicas datos) {
		DataAutos.autos.put(datos.getModelo(),datos);
	}
	public String buscarAutos(String marca, int valorMin, int valorMax) {
		String respuesta="";
		for(String llave:DataAutos.autos.keySet()) {
			if((marca.equals(DataAutos.autos.get(llave).getMarca()))&&(DataAutos.autos.get(llave).getPrecio()>=valorMin)&&(DataAutos.autos.get(llave).getPrecio()<=valorMax)) {
				respuesta=respuesta+"Marca: "+DataAutos.autos.get(llave).getMarca()+"\nModelo: "+DataAutos.autos.get(llave).getModelo()+"\nColores disponibles: "+DataAutos.autos.get(llave).getColores()+"\n Precio: $"+DataAutos.autos.get(llave).getPrecio()+"\n";
			}
		}
		return respuesta;
	}

}
