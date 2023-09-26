/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entity.Electrodomestico;
import Entity.Televisor;

public class TelevisorService extends ElectrodomesticoService {

    public Televisor crearTelevisor() {
        Electrodomestico electro = super.crearElectrodomestico();
        Televisor televisor = new Televisor();
        System.out.println("Ingrese la resolucion del televisor en pulgadas");
        int resol = read.nextInt();
        televisor.setResolucion(resol);
        System.out.println("Ingrese (1) si posee sintonizador o (0) si no");
        int opcion;
        opcion = read.nextInt();
        if (opcion == 1) {
            televisor.setSintonizador(true);
        } else {
            televisor.setSintonizador(false);
        }
        televisor.setColor(electro.getColor());
        televisor.setConsumoEnergetico(electro.getConsumoEnergetico());
        televisor.setPeso(electro.getConsumoEnergetico());
        televisor.setPrecio(electro.getPrecio());
        return televisor;
    }
    
    public void precioFinal(Televisor televisor){
        super.precioFinal(televisor);
        if (televisor.getResolucion()>40) {
            televisor.setPrecio((double)televisor.getPrecio()*1.3);
        }
        if (televisor.isSintonizador()==true) {
            televisor.setPrecio(televisor.getPrecio()+500);
        }
        System.out.println("El precio del televisor es de :" + televisor.getPrecio());
    }
    
}
