/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Divisi;
import java.util.Scanner;
import java.util.Date;
import SIstem_Admin.*;

/**
 *
 * @author Iqro Banyuanto
 */
public class Employee {
    // Identitas
    Scanner input = new Scanner(System.in);
    private String idPegawai;
    private String nama;
    private int umur;
    private String nomor_telepon;
    private String alamat;
    private StatusLembur statuslembur;
    
    //protected attribute
    //public List<Kehadiran> list_kehadiran;
    protected String nama_jabatan;
    protected int standarGaji;
    protected int standarMasuk;
    protected int standarKeluar;
    //Untuk kebutuhan sistem
    public Kehadiran tapping = new Kehadiran();
    public int totalLembur = 0;
    public int totalTerlambat = 0;
    public int totalJamKerja = 0;
    public int totalGaji = 0;
    
    
    protected Employee(String idPegawai, String nama, int umur, String nomor_telepon,String alamat){
        this.idPegawai = idPegawai;
        this.nama = nama;
        this.umur = umur;
        this.nomor_telepon = nomor_telepon;
        this.alamat = alamat;
    }
    
    public StatusLembur requestLembur(){
        System.out.print("Masukan Lama Lembur: ");
        int waktuLembur = input.nextInt();
        StatusLembur ha = new StatusLembur(nama, waktuLembur);
        statuslembur = ha;
        return statuslembur;
    }
    
    public void hitungGaji(){
        Sistem sis = new Sistem(standarMasuk, standarKeluar, standarGaji, tapping.recordJamMasuk, tapping.recordJamKeluar, totalLembur, statuslembur.waktuLembur);
        totalJamKerja += sis.calculateJam();
        totalTerlambat += sis.calculateTerlambat();
        totalGaji += (totalJamKerja+sis.calculateLembur()-totalTerlambat) * standarGaji;
    }

}
