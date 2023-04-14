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
        Manager man = new Manager("1", "Agung", 10, "08132293213", "jalan batu");
        man.setDurasiMasuk(0);
        man.setGaji(3000);
        man.setDurasiKeluar(9);
        man.tapping.recordMasuk();
        man.tapping.recordKeluar();
        man.requestLembur();
        man.hitungGaji();
        System.out.println(man.totalGaji);
        System.out.println(man.totalJamKerja);
        System.out.println(man.totalTerlambat);
        System.out.println(man.totalLembur);
        Administrator adm = new Administrator("agus","hehe");
        lembur r = man.getCurrentLembur();
        man.setCurrentLembur();
        System.out.println(r.namaEmployee);
        System.out.println(r.waktuLembur);
        System.out.println(r.status);
        KumpulanEmployee a = adm.getkumpulanEmployee();
        for(Manager t:a.listManager){
            System.out.println(t.getNamaEmployee());
        }
        
    }
}
