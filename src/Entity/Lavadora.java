/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

public class Lavadora extends Electrodomestico {

    //Atributos intrínsicos de Lavadora
    private int carga;
    private String hoa;
    public Lavadora() {

    }

    //Atributo propio (this) y atributos  heredados (super())

    public Lavadora(int carga, String hoa, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
        this.hoa = hoa;
    }
    

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + '}';
    }

}
