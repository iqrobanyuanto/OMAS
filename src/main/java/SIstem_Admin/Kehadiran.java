/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SIstem_Admin;
import java.util.Date;
/**
 *
 * @author Iqro Banyuanto
 */
public class Kehadiran {
    private Date dateStandard = new Date();
    //Sebagai record tertulis dengan format tanggal
    public String recordTanggalMasuk;
    public String recordTanggalKeluar;
    //Sebagai record tertulis dengan format jam
    public int recordJamMasuk;
    public int recordJamKeluar;
    //tapping untuk memulai kerja
    public String recordMasuk(){
        System.out.println(dateStandard);
        recordTanggalMasuk = dateStandard.toString();
        recordJamMasuk = dateStandard.getHours();
        return recordTanggalMasuk;
    }
    //tapping untuk selesai kerja
    public String recordKeluar(){
        recordTanggalKeluar =  dateStandard.toString();
        recordJamKeluar = dateStandard.getHours()+5;
        return recordTanggalKeluar;
    }
}
