/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SIstem_Admin;
import Divisi.*;
import java.util.Scanner;
import java.util.List;

/**
 *
 * @author Iqro Banyuanto
 */
public class Administrator {
    Scanner input = new Scanner(System.in);
    KumpulanAkun list = new KumpulanAkun();
    KumpulanEmployee listemp = new KumpulanEmployee();
    private String ID_administrator;
    private String password;
    private boolean login;
    private Akun akun;
    
    public Administrator(String id, String password){
        ID_administrator = id;
        this.password = password;
        login();
        if(login == false){
            System.out.println("Password Salah!");
        }else{
            System.out.println(akun.id+" telah melakukan login");
        }
    }
    
    private boolean login(){
        System.out.println("Masukan Username/ID: ");
        ID_administrator = input.nextLine();
        System.out.println("Masukan Password: ");
        password = input.nextLine();
        akun.id = ID_administrator;
        akun.password = password;
        login = list.cekAkun(akun);
        return login;
    }
    
    public void cekIdentitasPegawai(){
        List<Manager> m = listemp.listManager;
        List<Supervisor> s = listemp.listSupervisor;
        List<Pegawai> p = listemp.listPegawai;
        System.out.println("Manager");
        for(Manager elm: m){
            elm.showIdentity();
            System.out.println("");
        }
        System.out.println("Supervisor");
        for(Supervisor sup: s){
            sup.showIdentity();
            System.out.println("");

        }
        System.out.println("Pegawai");
        for(Pegawai peg: p){
            peg.showIdentity();
            System.out.println("");          
        }
    }
    
    public void tambahPegawai(){
        String jabatan = input.nextLine();
        if(jabatan.equals("Manager")){
            String id = input.nextLine();
            String nama = input.nextLine();
            int umur = input.nextInt();
            String nomor_telepon = input.nextLine();
            String alamat = input.nextLine();
            Manager r = new Manager(id, nama, umur, nomor_telepon, alamat);
            listemp.addManager(r);
        }else if(jabatan.equals("Supervisor")){
            String id = input.nextLine();
            String nama = input.nextLine();
            int umur = input.nextInt();
            String nomor_telepon = input.nextLine();
            String alamat = input.nextLine();
            Supervisor r = new Supervisor(id, nama, umur, nomor_telepon, alamat);
            listemp.addSupervisor(r);
        }else if(jabatan.equals("Pegawai")){
            String id = input.nextLine();
            String nama = input.nextLine();
            int umur = input.nextInt();
            String nomor_telepon = input.nextLine();
            String alamat = input.nextLine();
            Pegawai r = new Pegawai(id, nama, umur, nomor_telepon, alamat);
            listemp.addPegawai(r);
        }else{
            System.out.println("Jabatan Tidak Ada");
        }
    }
    public void hapusPegawai(){
        System.out.print("Masukan jabatan: ");
        String jabatan = input.nextLine();
        System.out.print("Masukan nama karyawan: ");
        String employee = input.nextLine();
        
        if(jabatan.equals("Manager")){
            for(Manager m : listemp.listManager){
                if(m.getNamaEmployee().equals(employee)){
                    listemp.hapusManager(m);
                    break;
                }
            }
        }else if(jabatan.equals("Supervisor")){
            for(Supervisor m : listemp.listSupervisor){
                if(m.getNamaEmployee().equals(employee)){
                    listemp.hapusSupervisor(m);
                    break;
                }
            }
        }else if(jabatan.equals("Pegawai")){
            for(Pegawai m : listemp.listPegawai){
                if(m.getNamaEmployee().equals(employee)){
                    listemp.hapusPegawai(m);
                    break;
                }
            }
        }else{
            System.out.println("Jabatan tidak ada");
        }   
    }
    
    public void assignLembur(){
        
    }
    public void cekGajiEmployee(){
        String jabatan = input.nextLine();
        String employee = input.nextLine();
        
        if(jabatan.equals("Manager")){
            for(Manager m : listemp.listManager){
                if(m.getNamaEmployee().equals(employee)){
                    System.out.println(m.totalGaji);
                    break;
                }
            }
        }else if(jabatan.equals("Supervisor")){
            for(Supervisor m : listemp.listSupervisor){
                if(m.getNamaEmployee().equals(employee)){
                    System.out.println(m.totalGaji);
                    break;
                }
            }
        }else if(jabatan.equals("Pegawai")){
            for(Pegawai m : listemp.listPegawai){
                if(m.getNamaEmployee().equals(employee)){
                    System.out.println(m.totalGaji);
                    break;
                }
            }
        }else{
            System.out.println("Jabatan tidak ada");
        }
        
    }
    
    public void cekKeterlambatan(){
        String jabatan = input.nextLine();
        String employee = input.nextLine();
        
        if(jabatan.equals("Manager")){
            for(Manager m : listemp.listManager){
                if(m.getNamaEmployee().equals(employee)){
                    System.out.println(m.totalTerlambat);
                    break;
                }
            }
        }else if(jabatan.equals("Supervisor")){
            for(Supervisor m : listemp.listSupervisor){
                if(m.getNamaEmployee().equals(employee)){
                    System.out.println(m.totalTerlambat);
                    break;
                }
            }
        }else if(jabatan.equals("Pegawai")){
            for(Pegawai m : listemp.listPegawai){
                if(m.getNamaEmployee().equals(employee)){
                    System.out.println(m.totalTerlambat);
                    break;
                }
            }
        }else{
            System.out.println("Jabatan tidak ada");
        }
    }
    public void cetakLaporanKehadiran(){
        
        String jabatan = input.nextLine();
        String employee = input.nextLine();
        
        if(jabatan.equals("Manager")){
            for(Manager m : listemp.listManager){
                if(m.getNamaEmployee().equals(employee)){
                    System.out.println(m.totalJamKerja);
                    break;
                }
            }
        }else if(jabatan.equals("Supervisor")){
            for(Supervisor m : listemp.listSupervisor){
                if(m.getNamaEmployee().equals(employee)){
                    System.out.println(m.totalJamKerja);
                    break;
                }
            }
        }else if(jabatan.equals("Pegawai")){
            for(Pegawai m : listemp.listPegawai){
                if(m.getNamaEmployee().equals(employee)){
                    System.out.println(m.totalJamKerja);
                    break;
                }
            }
        }else{
            System.out.println("Jabatan tidak ada");
        }
    }
    
}
