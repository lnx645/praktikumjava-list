package com.dadandev.mengolahdata.models;

public class Mahasiswa {
    String nama;
    String nim;
    int nilai;

    public Mahasiswa(String nama, String nim, int nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    public int getNilai() {
        return nilai;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }
    @Override
    public String toString() {
        return String.format("Nama:%s Nim:%s Nilai: %s", this.nama, this.nim, this.nilai);
    }
}
