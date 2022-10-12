package servicio;

import entidad.PeliculaEntidad;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import static utilidad.Comparators.compararDuracionMayorAMenor;
import static utilidad.Comparators.compararDuracionMenorAMayor;
import static utilidad.Comparators.ordenAlfabeticoDirector;
import static utilidad.Comparators.ordenAlfabeticoPelicula;

public class PeliculaServicio {

    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    ArrayList<PeliculaEntidad> listaPeliculas = new ArrayList<>();

    /**
     * Se crea e instancia el objeto pelicula
     *
     * @return
     */
    public PeliculaEntidad crearPelicula() {
        PeliculaEntidad pelicula = new PeliculaEntidad();

        System.out.println("Ingresa el titulo de la pelicula");
        pelicula.setTitulo(scanner.next());
        System.out.println("Ingresa el director de la pelicula");
        pelicula.setDirector(scanner.next());
        System.out.println("Ingresa la duracion de la pelicula en horas");
        pelicula.setDuracion(scanner.nextInt());

        return pelicula;
    }

    /**
     * Se crea una lista de peliculas. Se llena el ArrayList listaPeliculas de
     * objeto pelicula. La lista termina cuando el usuario preciona 'n'. Se
     * retorna la lista listaPeliculas e imprime la lista.
     *
     * @return
     */
    public ArrayList<PeliculaEntidad> listaDePeliculas() {

        System.out.println("Carga la lista de peliculas");
        char respuesta = 's';

        do {
            listaPeliculas.add(crearPelicula());
            System.out.println("¡La pelicula fue cargada con exito!");

            System.out.println("¿Quieres cargar otra pelicula? s/n");
            respuesta = scanner.next().charAt(0);
            if (String.valueOf(respuesta).equalsIgnoreCase("s")) {
                System.out.println("Vamos a cargar la siguiente pelicula");
            } else {
                System.out.println("Así quedó tu lista de peliculas");
                mostrarPeliculas();
            }

        } while (String.valueOf(respuesta).equalsIgnoreCase("s"));

        return listaPeliculas;
    }

    /**
     * Imprime la lista de peliculas cargadas
     */
    public void mostrarPeliculas() {
        System.out.println("\tLista De Peliculas");
        System.out.println("Nombre\tDirector\tDuracion(hs)");
        for (PeliculaEntidad pelicula : listaPeliculas) {
            System.out.println(pelicula.toString());
        }
    }

    /**
     * Imprime la lista de peliculas cargadas ordenadas de menor a mayor. Se usa
     * el metodo compararDuracionMenorAMayor de tipo Comparator.
     */
    public void mostrarPeliculasOrdenadaMenorMayor() {
        System.out.println("Lista Ordenada de Menor a Mayor");
        System.out.println("Nombre\tDirector\tDuracion(hs)");

        Collections.sort(listaPeliculas, compararDuracionMenorAMayor);

        for (PeliculaEntidad pelicula : listaPeliculas) {
            System.out.println(pelicula.toString());
        }
    }

    /**
     * Imprime la lista de peliculas cargadas ordenadas de mayor a menor. Se usa
     * el metodo compararDuracionMayorAMenor de tipo Comparator.
     */
    public void mostrarPeliculasOrdenadaMayorMenor() {
        System.out.println("Lista Ordenada de Mayor a Menor");
        System.out.println("Nombre\tDirector\tDuracion(hs)");

        Collections.sort(listaPeliculas, compararDuracionMayorAMenor);

        for (PeliculaEntidad pelicula : listaPeliculas) {
            System.out.println(pelicula.toString());
        }
    }

    /**
     * Imprime la lista de peliculas cargadas ordenadas alfabeticamente según el
     * nombre de la pelicula. Se usa el metodo ordenAlfabeticoPelicula de tipo
     * Comparator.
     */
    public void mostrarPeliculasAlfabeticaTitulo() {
        System.out.println("Lista Ordenada Alfabeticamente por Pelicula");
        System.out.println("Nombre\tDirector\tDuracion(hs)");

        Collections.sort(listaPeliculas, ordenAlfabeticoPelicula);

        for (PeliculaEntidad pelicula : listaPeliculas) {
            System.out.println(pelicula.toString());
        }
    }

    /**
     * Imprime la lista de peliculas cargadas ordenadas alfabeticamente según el
     * director de la pelicula Se usa el metodo ordenAlfabeticoDirector de tipo
     * Comparator.
     */
    public void mostrarPeliculasAlfabeticaDirector() {
        System.out.println("Lista Ordenada Alfabeticamente por Director");
        System.out.println("Nombre\tDirector\tDuracion(hs)");

        Collections.sort(listaPeliculas, ordenAlfabeticoDirector);

        for (PeliculaEntidad pelicula : listaPeliculas) {
            System.out.println(pelicula.toString());
        }
    }

}
