package Interface;

import java.util.List;
import Dominio.VideoJuegos;

public interface Metodos {

	public void Guardar(VideoJuegos juego);

	public List<VideoJuegos> Mostrar();

	public VideoJuegos Buscar(int indice);

	public void Editar(String nombre, String nuevoGenero);

	  public void Eliminar(int indice); 
}