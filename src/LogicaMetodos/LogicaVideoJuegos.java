package LogicaMetodos;

import java.util.ArrayList;
import java.util.List;

import Dominio.VideoJuegos;
import Interface.Metodos;
import Interface.NuevosMetodos;

public class LogicaVideoJuegos implements Metodos, NuevosMetodos {

    private List<VideoJuegos> lista = new ArrayList<>();

    @Override
    public void Guardar(VideoJuegos juego) {
        boolean existe = false;
        for (VideoJuegos j : lista) {
            if (j.getNombre().equalsIgnoreCase(juego.getNombre())) {
                existe = true;
                System.out.println("Ese nombre ya existe.");
                break;
            }
        }
        if (!existe) {
            lista.add(juego);
            System.out.println("Videojuego guardado correctamente.");
        }
    }

    @Override
    public List<VideoJuegos> Mostrar() {
        return lista;
    }

    @Override
    public VideoJuegos Buscar(int indice) {
        if (indice >= 0 && indice < lista.size()) {
            return lista.get(indice);
        }
        return null;
    }

    @Override
    public void Editar(String nombre, String nuevoGenero) {
        for (VideoJuegos j : lista) {
            if (j.getNombre().equalsIgnoreCase(nombre)) {
                j.setGenero(nuevoGenero);
                System.out.println("Genero actualizado correctamente.");
                return;
            }
        }
        System.out.println("Videojuego no encontrado.");
    }

    @Override
    public float editarPrecio(VideoJuegos juego) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().equalsIgnoreCase(juego.getNombre())) {
                lista.get(i).setPrecio(juego.getPrecio());
                System.out.println("Precio editado correctamente.");
                return lista.get(i).getPrecio();
            }
        }
        return -1; // No encontrado
    }

    @Override
    public void Eliminar(int indice) {
        if (indice >= 0 && indice < lista.size()) {
            lista.remove(indice);
            System.out.println("Videojuego eliminado correctamente.");
        } else {
            System.out.println("Indice no válido.");
        }
    }

    // NUEVOS MÉTODOS

    @Override
    public VideoJuegos buscarPorNombre(String nombre) {
        for (VideoJuegos j : lista) {
            if (j.getNombre().equalsIgnoreCase(nombre)) {
                return j;
            }
        }
        return null;
    }

    @Override
    public List<VideoJuegos> buscarPorGenero(String genero) {
        List<VideoJuegos> listaGenero = new ArrayList<>();
        for (VideoJuegos j : lista) {
            if (j.getGenero().equalsIgnoreCase(genero)) {
                listaGenero.add(j);
            }
        }
        return listaGenero;
    }

    @Override
    public double calcularDineroInvertido() {
        double total = 0;
        for (VideoJuegos j : lista) {
            total += j.getPrecio();
        }
        return total;
    }

    @Override
    public void eliminarPorNombre(String nombre) {
        VideoJuegos juego = buscarPorNombre(nombre);
        if (juego != null) {
            lista.remove(juego);
            System.out.println("Videojuego eliminado correctamente.");
        } else {
            System.out.println("Videojuego no encontrado.");
        }
    }
}