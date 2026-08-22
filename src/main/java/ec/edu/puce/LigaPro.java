package ec.edu.puce;

public class LigaPro {

    public static void main(String[] args) {

        GrafoLiga liga = new GrafoLiga();

        liga.conectarEquipos("LDU", "BSC");
        liga.conectarEquipos("LDU", "DQuito");
        liga.conectarEquipos("LDU", "Emelec");

        System.out.println("Partidos de LigaPro:");
        liga.mostrarGrafo();

        liga.bfs("LDU");
        liga.dfs("LDU");
    }
}
