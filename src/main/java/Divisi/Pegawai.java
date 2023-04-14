/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Divisi;

import java.util.Date;

/**
 *
 * @author Iqro Banyuanto
 */
public class Pegawai extends Employee{
    public Pegawai(String idPegawai, String nama, int umur, String nomor_telepon,String alamat){
        super(idPegawai, nama, umur, nomor_telepon, alamat);
        this.nama_jabatan = "Pegawai";
    }
}
