package ejercicio4;

import servicio.PeliculaServicio;

public class Ejercicio4 {

    public static void main(String[] args) {
        PeliculaServicio peliculaServicio = new PeliculaServicio();

        peliculaServicio.listaDePeliculas();
        peliculaServicio.mostrarPeliculasOrdenadaMenorMayor();
        peliculaServicio.mostrarPeliculasOrdenadaMayorMenor();
        peliculaServicio.mostrarPeliculasAlfabeticaTitulo();
        peliculaServicio.mostrarPeliculasAlfabeticaDirector();
    }

}
