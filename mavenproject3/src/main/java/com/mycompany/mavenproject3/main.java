/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;

/**
 *
 * @author Dell
 */
public class main {

    public static void main(String[] args) {
          television television = new television();
        SistemaSonido sonido = new SistemaSonido();
        Luces luces = new Luces();
        ReproductorDVD dvd = new ReproductorDVD();

        // Crear la fachada
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(television, sonido, luces, dvd);

        // Usar la fachada para ver una película
        homeTheater.verPelicula();

        // Usar la fachada para finalizar la película
        homeTheater.finalizarPelicula();
    }
}
