/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entity.Electrodomestico;
import Entity.Lavadora;

public class LavadoraService extends ElectrodomesticoService {

       public Lavadora crearLavadora() {
           Lavadora lavadora = new Lavadora();
           //con super invocamos del servicio de electro (clase padre) al servicio de lavadora
           Electrodomestico electro = super.crearElectrodomestico(); 
           
           
           lavadora.setColor(electro.getColor());
           lavadora.setConsumoEnergetico(electro.getConsumoEnergetico());
           lavadora.setPeso(electro.getPeso());
           lavadora.setPrecio(electro.getPrecio());
           
           System.out.println("Ingrese la carga de la lavadora");
           int carga = read.nextInt();
           lavadora.setCarga(carga);
//            lavadora.setCarga(carga); 
//            Lavadora lavadora = (Lavadora) super.crearElectrodomestico();
//            //setear atributos de la lavadora
//            
            return lavadora;
        }
    public void precioFinal(Lavadora lavadora) {
        super.precioFinal(lavadora);
        if (lavadora.getCarga() > 30) {
            lavadora.setPrecio(lavadora.getPrecio() + 500);
        }
        System.out.println("El precio de lavadora es : " + lavadora.getPrecio());
        
    }

}
