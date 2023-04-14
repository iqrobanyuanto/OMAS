    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Divisi;
import java.util.Scanner;
import SIstem_Admin.*;
import java.util.List;

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
    
    //protected attribute
    protected String nama_jabatan;
    protected int standarGaji;
    protected int standarMasuk;
    protected int standarKeluar;

    private lembur currentStatusLembur;
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
        
    public void showIdentity(){
        System.out.println("ID: "+idPegawai);
        System.out.println("Nama: "+nama);
        System.out.println("Umur: "+umur);
        System.out.println("Nomor Telepon: "+nomor_telepon);
        System.out.println("Alamat: "+alamat);
    }
    
    public String getNamaEmployee(){
        return nama;
    }
    public lembur getCurrentLembur(){
        return currentStatusLembur;
    }
    public lembur setCurrentLembur(){
        currentStatusLembur.status = true;
        return currentStatusLembur;
    }
    //Untuk melakukan request lembur
    public void requestLembur(){
        System.out.print("Masukan Lama Lembur: ");
        int waktuLembur = input.nextInt();
        lembur ha = new lembur(nama, waktuLembur);
        System.out.println("Lembur Telah diajukan, menunggu konfirmasi dari Administrator");
        currentStatusLembur = ha; 
    }
    //Untuk perhitungan hasil total gaji, total jam kerja, total waktu terlambat, total lembur
    //Hitung gaji ini dilakukan ketika karyawan telah melakukan tapping masuk dan keluar
    public void hitungGaji(){
        Sistem sis = new Sistem(standarMasuk, standarKeluar, standarGaji, tapping.recordJamMasuk, tapping.recordJamKeluar,currentStatusLembur.waktuLembur);
        totalJamKerja += sis.calculateJam();
        totalTerlambat += sis.calculateTerlambat();
        totalLembur += sis.calculateLembur();
        totalGaji += (totalJamKerja+sis.calculateLembur()-totalTerlambat) * standarGaji;
    }
    
            //setter getter 
    public String getNamaJabatan(){
        return nama_jabatan;
    }
    public int getStandarGaji(){
        return standarGaji;
    }
    public void setStandarGaji(int gaji){
        standarGaji = gaji;
    }
    public int getStandarJamMasuk(){
        return standarMasuk;
    }
    public void setStandarJamMasuk(int masuk){
        standarMasuk = masuk;
    }
    public int getStandarJamKeluar(){
        return standarKeluar;
    }
    public void setStandarJamKeluar(int keluar){
        standarKeluar = keluar;
    }

}
