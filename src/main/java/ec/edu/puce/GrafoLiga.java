package ec.edu.puce;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class GrafoLiga {

    private Map<String, List<String>> grafo = new HashMap<>();

    public void agregarEquipo(String equipo) {
        grafo.putIfAbsent(equipo, new ArrayList<>());
    }

    public void conectarEquipos(String equipo1, String equipo2) {

        agregarEquipo(equipo1);
        agregarEquipo(equipo2);

        grafo.get(equipo1).add(equipo2);
        grafo.get(equipo2).add(equipo1);
    }

    public void mostrarGrafo() {

        for (String equipo : grafo.keySet()) {
            System.out.println(equipo + " jugo contra: " + grafo.get(equipo));
        }
    }

    public void bfs(String inicio) {

        Set<String> visitados = new HashSet<>();
        Queue<String> cola = new LinkedList<>();

        visitados.add(inicio);
        cola.add(inicio);

        System.out.println("\nRecorrido BFS:");

        while (!cola.isEmpty()) {

            String actual = cola.poll();

            System.out.print(actual + " ");

            for (String vecino : grafo.get(actual)) {

                if (!visitados.contains(vecino)) {

                    visitados.add(vecino);
                    cola.add(vecino);
                }
            }
        }

        System.out.println();
    }

    public void dfs(String inicio) {

        Set<String> visitados = new HashSet<>();

        System.out.println("\nRecorrido DFS:");

        dfsRecursivo(inicio, visitados);

        System.out.println();
    }

    private void dfsRecursivo(String actual, Set<String> visitados) {

        visitados.add(actual);

        System.out.print(actual + " ");

        for (String vecino : grafo.get(actual)) {

            if (!visitados.contains(vecino)) {
                dfsRecursivo(vecino, visitados);
            }
        }
    }
}
