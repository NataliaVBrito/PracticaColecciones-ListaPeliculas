package utilidad;

import entidad.PeliculaEntidad;
import java.util.Comparator;

public class Comparators {

    //Orden según la duración menor a mayor
    public static Comparator<PeliculaEntidad> compararDuracionMenorAMayor = new Comparator<PeliculaEntidad>() {
        @Override
        public int compare(PeliculaEntidad p1, PeliculaEntidad p2) {
            return Integer.compare(p1.getDuracion(), p2.getDuracion());
        }
    };

    //Orden según la duración mayor a menor
    public static Comparator<PeliculaEntidad> compararDuracionMayorAMenor = new Comparator<PeliculaEntidad>() {
        @Override
        public int compare(PeliculaEntidad p1, PeliculaEntidad p2) {
            return Integer.compare(p2.getDuracion(), p1.getDuracion());
        }
    };

    //Orden alfabetico segun el nombre de la pelicula
    public static Comparator<PeliculaEntidad> ordenAlfabeticoPelicula = new Comparator<PeliculaEntidad>() {
        @Override
        public int compare(PeliculaEntidad p1, PeliculaEntidad p2) {
            return p1.getTitulo().compareTo(p2.getTitulo());
        }
    };

    //Orden alfabetico segun el director
    public static Comparator<PeliculaEntidad> ordenAlfabeticoDirector = new Comparator<PeliculaEntidad>() {
        @Override
        public int compare(PeliculaEntidad p1, PeliculaEntidad p2) {
            return p1.getDirector().compareTo(p2.getDirector());
        }
    };
}
