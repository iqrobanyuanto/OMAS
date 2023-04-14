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
public class Manager extends Employee{

    public Manager(String idPegawai, String nama, int umur, String nomor_telepon,String alamat){
        super(idPegawai, nama, umur, nomor_telepon, alamat);
        this.nama_jabatan = "Manager";
    }
    
        //setter getter 
    public String getNamaJabatan(){
        return nama_jabatan;
    }
    public int getGaji(){
        return standarGaji;
    }
    public void setGaji(int gaji){
        standarGaji = gaji;
    }
    public int getDurasiMasuk(){
        return standarMasuk;
    }
    public void setDurasiMasuk(int masuk){
        standarMasuk = masuk;
    }
    public int getDurasiKeluar(){
        return standarKeluar;
    }
    public void setDurasiKeluar(int keluar){
        standarKeluar = keluar;
    }
}
