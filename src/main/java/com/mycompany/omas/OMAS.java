/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.omas;
import java.util.Date;
import java.sql.Time;
import SIstem_Admin.*;
import Divisi.*;
/**
 *
 * @author Iqro Banyuanto
 */
public class OMAS {

    public static void main(String[] args) {
        Manager man = new Manager("1", "Agus", 10, "08132293213", "jalan batu");
        man.setDurasiMasuk(0);
        man.setGaji(3000);
        man.setDurasiKeluar(9);
        man.tapping.recordMasuk();
        man.tapping.recordKeluar();
        man.requestLembur();
        man.hitungGaji();
        System.out.println(man.totalGaji);
        
        
        
    }
}
