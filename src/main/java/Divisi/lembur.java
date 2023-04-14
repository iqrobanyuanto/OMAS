/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Divisi;

/**
 *
 * @author Iqro Banyuanto
 */
//Digunakan sebagai tipe data output method requestLembur
public class lembur {
    public String namaEmployee;
    public int waktuLembur;
    public boolean status;
    
    public lembur(String nama, int waktuLembur){
        namaEmployee = nama;
        this.waktuLembur = waktuLembur;
        status = false;
    }
   
}
