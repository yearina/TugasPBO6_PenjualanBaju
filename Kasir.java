public class Kasir {
    public int id_kasir;
    public String nama;

    public int getId_kasir() {
        return id_kasir;
    }

    public void setId_kasir(int id_kasir) {
        this.id_kasir = id_kasir;
    }

    public String getNama() {return nama;}

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void display(int id, String nama){
        setId_kasir(id);
        setNama(nama);
        System.out.println("Id kasir: "+getId_kasir());
        System.out.println("Nama: "+getNama());
    }
}