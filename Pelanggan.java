package model;

public class Pelanggan {
    private String idPelanggan;
    private String nama;
    private String noHP;

    // Constructor
    public Pelanggan(String idPelanggan, String nama, String noHP) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.noHP = noHP;
    }

    // Getter dan Setter
    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoHP() {
        return noHP;
    }

    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }

    @Override
    public String toString() {
        return idPelanggan + " - " + nama + " (HP: " + noHP + ")";
    }
}
