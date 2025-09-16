package model;

public class Lapangan {
    private String idLapangan;
    private String namaLapangan;
    private double hargaPerJam;

    public Lapangan(String idLapangan, String namaLapangan, double hargaPerJam) {
        this.idLapangan = idLapangan;
        this.namaLapangan = namaLapangan;
        this.hargaPerJam = hargaPerJam;
    }

    public String getIdLapangan() { return idLapangan; }
    public void setIdLapangan(String idLapangan) { this.idLapangan = idLapangan; }

    public String getNamaLapangan() { return namaLapangan; }
    public void setNamaLapangan(String namaLapangan) { this.namaLapangan = namaLapangan; }

    public double getHargaPerJam() { return hargaPerJam; }
    public void setHargaPerJam(double hargaPerJam) { this.hargaPerJam = hargaPerJam; }

    @Override
    public String toString() {
        return idLapangan + " - " + namaLapangan + " (Rp" + hargaPerJam + "/jam)";
    }
}
