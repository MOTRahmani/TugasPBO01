/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo01;

/**
 *
 * @author Asus
 */
public class Bangunan {
    String nama;
    String lebar;
    String tinggi;
    String bahan;
    String lokasi;
    String item;
    
    void cetakInfo(){
        System.out.println("Objeck   :"+nama);
        System.out.println("Lebar    :"+lebar);
        System.out.println("tinggi   :"+tinggi);
        System.out.println("Bahan    :"+bahan);
        System.out.println("Lokasi   :"+lokasi);
        System.out.println("Item     :"+item);
        System.out.println();
    }
}
