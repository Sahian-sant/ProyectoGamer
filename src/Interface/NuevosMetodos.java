package Interface;

import java.util.List;
import Dominio.VideoJuegos;

public interface NuevosMetodos {

    public VideoJuegos buscarPorNombre(String nombre);

    public List<VideoJuegos> buscarPorGenero(String genero);
    
    public float editarPrecio(VideoJuegos precio);

    public double calcularDineroInvertido();

    public void eliminarPorNombre(String nombre);
}