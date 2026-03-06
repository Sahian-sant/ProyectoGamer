package Main;

import java.util.Scanner;
import Dominio.VideoJuegos;
import LogicaMetodos.LogicaVideoJuegos;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        LogicaVideoJuegos imp = new LogicaVideoJuegos();

        do {
            System.out.println("\n----- MENU PRINCIPAL -----");
            System.out.println("1. ALTA");
            System.out.println("2. MOSTRAR");
            System.out.println("3. BUSCAR POR INDICE");
            System.out.println("4. EDITAR GENERO");
            System.out.println("5. ELIMINAR POR INDICE");
            System.out.println("6. BUSCAR POR NOMBRE");
            System.out.println("7. BUSCAR POR GENERO");
            System.out.println("8. CALCULAR EL DINERO INVERTIDO");
            System.out.println("9. ELIMINAR POR NOMBRE");
            System.out.println("10. EDITAR PRECIO");
            System.out.println("11. SALIR");

            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine(); // limpiar buffer

            switch (opcion) {

                case 1:
                    System.out.print("Nombre: ");
                    String nombre = teclado.nextLine();

                    System.out.print("Precio: ");
                    float precio = teclado.nextFloat();  // ← float
                    teclado.nextLine();

                    System.out.print("Genero: ");
                    String genero = teclado.nextLine();

                    System.out.print("Estatus: ");
                    String estatus = teclado.nextLine();

                    VideoJuegos juego = new VideoJuegos(nombre, precio, genero, estatus);
                    imp.Guardar(juego);
                    break;

                case 2:
                    for (VideoJuegos j : imp.Mostrar()) {
                        System.out.println(j);
                    }
                    break;

                case 3:
                    System.out.print("Indice a buscar: ");
                    int indiceBuscar = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println(imp.Buscar(indiceBuscar));
                    break;

                case 4:
                    System.out.print("Nombre del juego a editar: ");
                    String nomEditar = teclado.nextLine();
                    System.out.print("Nuevo genero: ");
                    String nuevoGenero = teclado.nextLine();
                    imp.Editar(nomEditar, nuevoGenero);
                    break;

                case 5:
                    System.out.print("Indice a eliminar: ");
                    int indiceEliminar = teclado.nextInt();
                    teclado.nextLine();
                    imp.Eliminar(indiceEliminar);
                    break;

                case 6:
                    System.out.print("Nombre: ");
                    System.out.println(imp.buscarPorNombre(teclado.nextLine()));
                    break;

                case 7:
                    System.out.print("Genero: ");
                    for (VideoJuegos j : imp.buscarPorGenero(teclado.nextLine())) {
                        System.out.println(j);
                    }
                    break;

                case 8:
                    System.out.println("Total invertido: $" + imp.calcularDineroInvertido());
                    break;

                case 9:
                    System.out.print("Nombre a eliminar: ");
                    imp.eliminarPorNombre(teclado.nextLine());
                    break;

                case 10:
                    System.out.print("Nombre del juego a cambiar precio: ");
                    String nombreEditarPrecio = teclado.nextLine();
                    VideoJuegos juegoEditar = imp.buscarPorNombre(nombreEditarPrecio);

                    if (juegoEditar != null) {
                        System.out.print("Nuevo precio: ");
                        float nuevoPrecio = teclado.nextFloat();  // ← float
                        teclado.nextLine();

                        juegoEditar.setPrecio(nuevoPrecio);
                        imp.editarPrecio(juegoEditar);
                    } else {
                        System.out.println("No existe ese registro.");
                    }
                    break;

                case 11:
                    System.out.println("Saliendo del sistema...");
					   System.out.println("este es un numevo cambio...");
                    break;

                default:
                    System.out.println("Opción inválida.");
					
            }

        } while (opcion != 11);

        teclado.close();
    }
}