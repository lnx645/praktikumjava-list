package com.dadandev.mengolahdata;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.dadandev.mengolahdata.models.Mahasiswa;

public class Main {
    public static void main(String[] args) {

        ArrayList<Mahasiswa> mahasiswa = new ArrayList<>();
        mahasiswa.add(new Mahasiswa("Dadan Hidayat", "2300192", 90));
        mahasiswa.add(new Mahasiswa("Anita", "2300292", 100));
        mahasiswa.add(new Mahasiswa("Tokoku ABAH", "2302192", 90));
        mahasiswa.add(new Mahasiswa("Budi Budianto", "22302192", 27));
        mahasiswa.add(new Mahasiswa("Marjinal", "2302192", 20));
        mahasiswa.add(new Mahasiswa("Marjinal", "2302192", 21));
        mahasiswa.forEach(e -> {
            System.out.println(e);
        });

        Set<String> namaUnik = new HashSet<>();
        for (Mahasiswa mhs : mahasiswa) {
            namaUnik.add(mhs.getNama());
        }
        namaUnik.forEach(e -> {
            System.out.println(e);
        });

        Map<String, String> namaNim = new HashMap<>();

        for (Mahasiswa mhs : mahasiswa) {
            namaNim.put(mhs.getNim(), mhs.getNama());
        }
        System.out.println("====MAP NIM / NAMA ==== ");
        namaNim.forEach((nim, nama) -> {
            System.out.println(String.format("%s -> %s", nim, nama));
        });
        System.out.println("==== NILAI >= 75 ==== ");
        mahasiswa.stream().filter(e -> e.getNilai() >= 75).forEach(e -> {
            System.out.println(e);
        });
        System.out.println("==== NAMA MAHASISWA HURUF BESAR =====");
        mahasiswa.stream().map(e -> e.getNama().toUpperCase()).forEach(e -> {
            System.out.println(e);
        });

        System.out.println("==== NAMA MAHASISWA HURUF BESAR =====");
        mahasiswa.stream().sorted(Comparator.comparingInt(Mahasiswa::getNilai).reversed()).forEach(e->{
            System.out.println(e);
        });
    }
}