/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SIstem_Admin;   
/**
 *
 * @author Iqro Banyuanto
 */

//Untuk melakukan perhitungan waktu lembur, waktu kerja normal, waktu terlambat dalam 1 hari.
public class Sistem {
    private int standarMasuk;
    private int standarKeluar;
    private int standarGaji;
    private int jamMasuk;
    private int jamKeluar;
    private int jamLembur;
    
    public Sistem(int standarMasuk, int standarKeluar, int standarGaji, int jamMasuk, int jamKeluar, int jamLembur){
        this.standarMasuk = standarMasuk;
        this.standarKeluar = standarKeluar;
        this.standarGaji = standarGaji;
        this.jamMasuk = jamMasuk;
        this.jamKeluar = jamKeluar;
        this.jamLembur = jamLembur;
    }
    // kalkulasi waktu lembur yang dilakukan dalam 1 hari
    public int calculateLembur(){
        return jamLembur;
    }
    // kalkulasi waktu kerja normal yang dilakukan dalam 1 hari
    public int calculateJam(){
        return jamKeluar-jamMasuk;
    }
    // kalkulasi waktu terlambat yang dilakukan dalam 1 hari
    public int calculateTerlambat(){
        int a = (jamMasuk < standarMasuk)?0:(standarKeluar-standarMasuk)-calculateJam();
        return a;
    }
}
