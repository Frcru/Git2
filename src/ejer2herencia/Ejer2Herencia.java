/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer2herencia;

import Entity.Lavadora;
import Entity.Televisor;
import Service.LavadoraService;
import Service.TelevisorService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Ejer2Herencia {

    public static void main(String[] args) {
        LavadoraService ls= new LavadoraService();
        Lavadora lavadora = ls.crearLavadora();
        
        TelevisorService ts=new TelevisorService();
        Televisor tele = ts.crearTelevisor();
                
                
        ls.precioFinal(lavadora);
        ts.precioFinal(tele);
        
        
    
    }
    
}
