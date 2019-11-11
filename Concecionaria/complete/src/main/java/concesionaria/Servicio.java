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
			String key1=llave;
			if((marca.equals(DataAutos.autos.get(key1).getMarca()))&&(DataAutos.autos.get(key1).getPrecio()>=valorMin)&&(DataAutos.autos.get(key1).getPrecio()<=valorMax)) {
				respuesta=respuesta+DataAutos.autos.get(key1).getMarca()+" "+DataAutos.autos.get(key1).getModelo()+" "+DataAutos.autos.get(key1).getColores()+" "+DataAutos.autos.get(key1).getPrecio()+"\n";
			}
		}
		return respuesta;
	}

}
