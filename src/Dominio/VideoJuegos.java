package Dominio;

public class VideoJuegos {

//este es otrocambio
	private String nombre;
	private float precio;
	private String genero;
	private String estatus;

	public VideoJuegos(String nombre, float precio, String genero, String estatus) {
		this.nombre = nombre;
		this.precio = precio;
		this.genero = genero;
		this.estatus = estatus;
	}

	@Override
	public String toString() {
		return "VideoJuego [\n" + " Nombre = " + nombre + "\n Precio = $" + precio + "\n Genero = " + genero
				+ "\n Estatus = " + estatus + "\n]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	
}