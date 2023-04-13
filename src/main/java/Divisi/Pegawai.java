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
    private String nama_jabatan;
    private int gaji;
    private Date durasiMasuk;
    private Date durasiKeluar;
    
    protected Pegawai(String idPegawai, String nama, int umur, String nomor_telepon,String alamat){
        super(idPegawai, nama, umur, nomor_telepon, alamat);
    }
    public String getNamaJabatan(){
        return nama_jabatan;
    }
    public void setNamaJabatan(String nama){
        nama_jabatan = nama;
    }
    public int getGaji(){
        return gaji;
    }
    public void setGaji(int gaji){
        this.gaji = gaji;
    }
    public Date getDurasiMasuk(){
        return durasiMasuk;
    }
    public void setDurasiMasuk(Date masuk){
        durasiMasuk = masuk;
    }
    public Date getDurasiKeluar(){
        return durasiKeluar;
    }
    public void setDurasiKeluar(Date keluar){
        durasiKeluar = keluar;
    }
}
