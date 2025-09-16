package model;

public class Reservasi {
    private String idReservasi;
    private Pelanggan pelanggan;
    private Lapangan lapangan;
    private String tanggal;  // Bisa disimpan sebagai String untuk sederhana
    private int durasiJam;

    // Constructor
    public Reservasi(String idReservasi, Pelanggan pelanggan, Lapangan lapangan, String tanggal, int durasiJam) {
        this.idReservasi = idReservasi;
        this.pelanggan = pelanggan;
        this.lapangan = lapangan;
        this.tanggal = tanggal;
        this.durasiJam = durasiJam;
    }

    // Getter dan Setter
    public String getIdReservasi() {
        return idReservasi;
    }

    public void setIdReservasi(String idReservasi) {
        this.idReservasi = idReservasi;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public Lapangan getLapangan() {
        return lapangan;
    }

    public void setLapangan(Lapangan lapangan) {
        this.lapangan = lapangan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getDurasiJam() {
        return durasiJam;
    }

    public void setDurasiJam(int durasiJam) {
        this.durasiJam = durasiJam;
    }

    // Hitung total harga
    public double hitungTotalHarga() {
        return durasiJam * lapangan.getHargaPerJam();
    }

    @Override
    public String toString() {
        return "Reservasi ID: " + idReservasi + " | " +
               pelanggan.getNama() + " -> " + lapangan.getNamaLapangan() +
               " (" + tanggal + ", " + durasiJam + " jam) Total: Rp" + hitungTotalHarga();
    }
}
