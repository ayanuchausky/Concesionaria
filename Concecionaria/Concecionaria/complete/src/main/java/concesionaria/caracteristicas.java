package concesionaria;

public class caracteristicas {
	private String marca, modelo,colores;
	
	private int precio;
	
	public caracteristicas() {}
	
	public caracteristicas(String marca, String modelo, String colores, int precio){
		this.marca=marca;
		this.modelo=modelo;
		this.colores=colores;
		this.precio=precio;
	}

public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public String getColores() {
	return colores;
}
public void setColores(String colores) {
	this.colores = colores;
}
public int getPrecio() {
	return precio;
}
public void setPrecio(int precio) {
	this.precio = precio;
}

}
