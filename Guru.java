//Objek class
public class Guru {
    int id;
    String nama;
    String mapel;
    public String alamat;

    /*constructor nama sama dengan nama class */
    public Guru() {
        id = 0;
        nama = "";
        mapel = ""; 
        alamat = ""; 
    }
    
    //constructor parameter
    public Guru(int id, String nama, String mapel, String alamat) {
        this.id = id;
        this.nama = nama;
        this.mapel = mapel;
        this.alamat = alamat;
    }

    //method
    public void print() {
        System.out.println("Ini data dari guru "+ nama);
        System.out.println("ID: "+id);
        System.out.println("Mapel: "+mapel);
        System.out.println("Alamat "+alamat);
    }
}
