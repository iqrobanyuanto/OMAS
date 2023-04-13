/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SIstem_Admin;   
/**
 *
 * @author Iqro Banyuanto
 */
public class Sistem {
    private int standarMasuk;
    private int standarKeluar;
    private int standarGaji;
    private int jamMasuk;
    private int jamKeluar;
    private int totalLembur;
    private int jamLembur;
    public Sistem(int standarMasuk, int standarKeluar, int standarGaji, int jamMasuk, int jamKeluar, int totalLembur, int jamLembur){
        this.standarMasuk = standarMasuk;
        this.standarKeluar = standarKeluar;
        this.standarGaji = standarGaji;
        this.jamMasuk = jamMasuk;
        this.jamKeluar = jamKeluar;
        this.totalLembur = totalLembur;
        this.jamLembur = jamLembur;
    }
    
    public int calculateLembur(){
        return totalLembur += jamLembur;
    }
    public int calculateJam(){
        return jamKeluar-jamMasuk;
    }
    public int calculateTerlambat(){
        int a = (jamMasuk < standarMasuk)?(standarKeluar-standarMasuk)-calculateJam():0;
        return a;
    }
}
