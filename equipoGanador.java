package Semana3;

/**
 * Nombre del programa: 
 * Descripcion: Hugo, Paco y Luis son tres hermanos a los que les gusta jugar al fútbol. Como Hugo es
el mayor, él debe jugar contra Paco y Luis. Haga un programa que reciba la cantidad
de goles que anotó Hugo, la cantidad de goles que anotó Paco y la cantidad que anotó
Luis, e indique cuál equipo ganó.
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ejp1w3 {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{ 
        int equipoHugo;
        int equipoPacoyLuis;
        int golesPaco;
        int golesLuis;
        String ganador;

        escribir.println("Goles que anoto Hugo:");
        equipoHugo = Integer.parseInt(leer.readLine());

        escribir.println("Goles que anoto Paco:");
        golesPaco = Integer.parseInt(leer.readLine());

        escribir.println("Goles que anoto Luis:");
        golesLuis = Integer.parseInt(leer.readLine());

        equipoPacoyLuis = golesLuis + golesPaco;

        if (equipoHugo == equipoPacoyLuis){
            ganador = "El juego termino empate";
        } else if (equipoHugo > equipoPacoyLuis){
            ganador = "El ganador fue el equipo de Hugo con " +equipoHugo+ " goles";
        } else {
            ganador = "El ganador fue el equipo de Paco y Luis con " +equipoPacoyLuis+ " goles";
        }
        escribir.println(ganador);
    }
}