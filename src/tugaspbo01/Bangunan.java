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
    double lebar;
    double tinggi;
    String properti;
    String bahan;
    String lokasi;
    
    void cetakInfo(){
        System.out.println("Lebar    :"+lebar);
        System.out.println("tinggi   :"+tinggi);
        System.out.println("Properti :"+properti);
        System.out.println("Bahan    :"+bahan);
        System.out.println("Lokasi   :"+lokasi);
    }
}
