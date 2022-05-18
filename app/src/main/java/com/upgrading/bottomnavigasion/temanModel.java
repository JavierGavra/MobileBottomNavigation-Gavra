package com.upgrading.bottomnavigasion;

public class temanModel {
    private String namaOrang, nomorTelpon;
    private int foto;

    public temanModel (String namaOrang, String nomorTelpon, int foto) {
        this.namaOrang = namaOrang;
        this.nomorTelpon = nomorTelpon;
        this.foto = foto;
    }


    // Get variable
    public String getNamaOrang() {
        return namaOrang;
    }
    public String getNomorTelpon() {
        return nomorTelpon;
    }
    public int getFoto() {
        return foto;
    }

    // Set variable
    public void setNamaOrang(String namaOrang) {
        this.namaOrang = namaOrang;
    }
    public void setNomorTelpon(String nomorTelpon) {
        this.nomorTelpon = nomorTelpon;
    }
    public void setFoto(int foto) {
        this.foto = foto;
    }
}
