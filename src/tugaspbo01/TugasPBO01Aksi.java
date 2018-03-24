package tugaspbo01;

/**
 *
 * @author Asus
 */
public class TugasPBO01Aksi {
    public static void main(String[] args) {
        Bangunan Rumah = new Bangunan();
        
        Rumah.nama="Rumah";
        Rumah.lebar="14 Meter";
        Rumah.tinggi="7 Meter";
        Rumah.bahan="Kayu, Semen";
        Rumah.lokasi="Desa";
        Rumah.item="Kasur, TV";
        
        Rumah.cetakInfo();
        
        Bangunan Hotel = new Bangunan();
        
        Hotel.nama="Hotel";
        Hotel.lebar="23 Meter";
        Hotel.tinggi="35 Meter";
        Hotel.bahan="Semen";
        Hotel.lokasi="Kota";
        Hotel.item="Kasur, TV";
                
        Hotel.cetakInfo();
        
        Bangunan Kantor = new Bangunan();
        
        Kantor.nama="Kantor";
        Kantor.lebar="18 Meter";
        Kantor.tinggi="7 Meter";
        Kantor.bahan="Kayu, Semen";
        Kantor.lokasi="Desa/Kota";
        Kantor.item="Meja, Kursi, Panan Tulis";
        
        Kantor.cetakInfo();
    }
}
