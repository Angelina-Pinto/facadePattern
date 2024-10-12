/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author Dell
 */
public class HomeTheaterFacade {
    private television television;
    private SistemaSonido sonido;
    private Luces luces;
    private ReproductorDVD dvd;
    
     public HomeTheaterFacade(television television, SistemaSonido sonido, Luces luces, ReproductorDVD dvd) {
        this.television = television;
        this.sonido = sonido;
        this.luces = luces;
        this.dvd = dvd;
    }
     
     public void verPelicula() {
        System.out.println("Preparando el sistema para ver una película...");
        luces.atenuar(30);
        television.encender();
        television.seleccionarEntradaHDMI();
        sonido.encender();
        sonido.ajustarVolumen(15);
        dvd.encender();
        dvd.reproducir();
        System.out.println("¡Disfruta de la película!");
    }

    public void finalizarPelicula() {
        System.out.println("Apagando el sistema...");
        dvd.encender();
        sonido.encender();
        television.encender();
        luces.atenuar(100);
        System.out.println("Sistema apagado.");
    }
}
