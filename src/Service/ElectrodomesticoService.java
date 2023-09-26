/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entity.Electrodomestico;
import java.util.Scanner;

public class ElectrodomesticoService {
    
    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Electrodomestico crearElectrodomestico() {
        //Instanciamos para crear el objeto electrodomestico
        Electrodomestico electro = new Electrodomestico();

        System.out.println("Ingrese color");
        String color = read.next();
        electro.setColor(color);

        System.out.println("Ingrese el tipo de consumo");
        char consumo = read.next().charAt(0);
        electro.setConsumoEnergetico(consumo);

        System.out.println("El precio base asignado será de 1000");
        electro.setPrecio(1000);

        System.out.println("Ingrese el peso del electrodomestico");
        double peso = read.nextDouble();
        electro.setPeso(peso);

        return electro;
    }

    public char comprobarConsumoEnergetico(char consumo) {
        if (consumo >= 'A' && consumo <= 'F') {
            return consumo;
        } else {
            return 'F';
        }
    }

    public String comprobarColor(String color) {
        if (color.equalsIgnoreCase("Blanco") || color.equalsIgnoreCase("NEGRO") || color.equalsIgnoreCase("Rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
            return color.toLowerCase();
        } else {
            return "blanco";
        }

    }

    public void precioFinal(Electrodomestico electro) {
        switch (electro.getConsumoEnergetico()) {
            case 'A':
                electro.setPrecio(electro.getPrecio() + 1000);
                break;
            case 'B':
                electro.setPrecio(electro.getPrecio() + 800);
                break;
            case 'C':
                electro.setPrecio(electro.getPrecio() + 600);
                break;
            case 'D':
                electro.setPrecio(electro.getPrecio() + 500);
                break;
            case 'E':
                electro.setPrecio(electro.getPrecio() + 300);
                break;
            case 'F':
                electro.setPrecio(electro.getPrecio() + 100);
                break;
        }
        if (electro.getPeso() >= 1 && electro.getPeso() < 20) {
            electro.setPrecio(electro.getPrecio() + 100);
        } else if (electro.getPeso() >= 20 && electro.getPeso() < 50) {
            electro.setPrecio(electro.getPrecio() + 500);
        } else if (electro.getPeso() >= 50 && electro.getPeso() < 80) {
            electro.setPrecio(electro.getPrecio() + 800);
        } else if (electro.getPeso() >= 80) {
            electro.setPrecio(electro.getPrecio() + 1000);
        }
    }

    double suma = (double)0;
}
