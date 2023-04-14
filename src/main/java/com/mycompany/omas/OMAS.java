/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.omas;

import SIstem_Admin.*;
import Divisi.*;
/**
 *
 * @author Iqro Banyuanto
 */
public class OMAS {

    public static void main(String[] args) {
        //Create list Akun
        KumpulanAkun listAk = new KumpulanAkun();
        listAk.addAkun("asep", "hehe");
        //Administration Debug
        Administrator adm = new Administrator("asep", "hehe",listAk.getListAkun());
        //adm.tambahPegawai();
        //adm.tambahPegawai();
        adm.cekIdentitasPegawai();
        //adm.tambahPegawai();
        //adm.cekIdentitasPegawai();
        //adm.hapusPegawai();
        //adm.cekIdentitasPegawai();
        //Employee Debug
        KumpulanEmployee s = new KumpulanEmployee();
        Manager a = new Manager("1","Ragil",13,"321321","kuda batu");
        s.addManager(a);
        adm.setKumpulanEmployee(s);
        adm.cekIdentitasPegawai();
        a.requestLembur();
        System.out.println(a.getCurrentLembur().namaEmployee);
        System.out.println(a.getCurrentLembur().status);
        System.out.println(a.getCurrentLembur().waktuLembur);
        adm.assignLembur();
        System.out.println(a.getCurrentLembur().namaEmployee);
        System.out.println(a.getCurrentLembur().status);
        System.out.println(a.getCurrentLembur().waktuLembur);

        
        
        
    }
}
