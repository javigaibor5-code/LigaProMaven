# LigaPro Maven

Proyecto desarrollado en Java utilizando Maven para representar los partidos de la LigaPro mediante un grafo.

## Funcionalidades

- Registro de equipos.
- Conexión entre equipos que han jugado.
- Visualización del grafo.
- Recorrido BFS.
- Recorrido DFS.

## Equipos

- LDU
- BSC
- DQuito
- Emelec

## Ejemplo de salida

```
Partidos de LigaPro:
Emelec jugo contra: [LDU]
BSC jugo contra: [LDU]
DQuito jugo contra: [LDU]
LDU jugo contra: [BSC, DQuito, Emelec]

Recorrido BFS:
LDU BSC DQuito Emelec

Recorrido DFS:
LDU BSC DQuito Emelec
```
