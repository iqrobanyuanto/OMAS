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
    //KumpulanAkun list = new KumpulanAkun();
    private KumpulanEmployee listemp = new KumpulanEmployee();
    private String ID_administrator;
    private String password;
    private boolean login;
    private List<AkunAdmin> kumpadm;
    
    public Administrator(String id, String pass, List<AkunAdmin> kumpadm){
        ID_administrator = id;
        password = pass;
        this.kumpadm = kumpadm;
        login();
        if(login == false){
            System.out.println("Password Salah!");
        }else{
            System.out.println(ID_administrator+" telah melakukan login");
        }
    }

    public boolean login(){
        login = false;
        for(AkunAdmin m: kumpadm){
            if(m.id.equals(ID_administrator)){
                login = true;
            }
        }
        return login;
    }
    //getter kumpulan employee
    public KumpulanEmployee getkumpulanEmployee(){
        return listemp;
    }
    //setter kumpulan employee
    public void setKumpulanEmployee(KumpulanEmployee r){
        listemp = r;
    }
    public void cekIdentitasPegawai(){
        List<Manager> m = listemp.listManager;
        List<Supervisor> s = listemp.listSupervisor;
        List<Pegawai> p = listemp.listPegawai;
        System.out.println("==============");
        System.out.println("======Daftar Pegawai======");
        System.out.println("Manager");
        System.out.println("==============");
        for(Manager elm: m){
            elm.showIdentity();
            System.out.println("");
        }
        System.out.println("==============");
        System.out.println("Supervisor");
        System.out.println("==============");
        for(Supervisor sup: s){
            sup.showIdentity();
            System.out.println("");

        }
        System.out.println("==============");
        System.out.println("Pegawai");
        System.out.println("==============");
        for(Pegawai peg: p){
            peg.showIdentity();
            System.out.println("");          
        }
        System.out.println("==============");
    }
    
    public void tambahPegawai(){
        Scanner input = new Scanner(System.in);
        Scanner forINT = new Scanner(System.in);
        System.out.print("Masukan jabatan: ");
        String jabatan = input.nextLine();
        if(jabatan.equals("Manager")){
            System.out.println("======Manager======");
            System.out.print("Masukan ID Karyawan: ");
            String id = input.nextLine();
            System.out.print("Masukan Nama Karyawan: ");            
            String nama = input.nextLine();
            System.out.print("Masukan Umur Karyawan: ");
            int umur = forINT.nextInt();
            System.out.print("Masukan Nomor Telepon Karyawan: ");
            String nomor_telepon = input.nextLine();
            System.out.print("Masukan Alamat Karyawan: ");
            String alamat = input.nextLine();
            Manager r = new Manager(id, nama, umur, nomor_telepon, alamat);
            listemp.addManager(r);
        }else if(jabatan.equals("Supervisor")){
            System.out.println("======Supervisor======");
            System.out.print("Masukan ID Karyawan: ");
            String id = input.nextLine();
            System.out.print("Masukan Nama Karyawan: ");            
            String nama = input.nextLine();
            System.out.print("Masukan Umur Karyawan: ");
            int umur = forINT.nextInt();
            System.out.print("Masukan Nomor Telepon Karyawan: ");
            String nomor_telepon = input.nextLine();
            System.out.print("Masukan Alamat Karyawan: ");
            String alamat = input.nextLine();
            Supervisor r = new Supervisor(id, nama, umur, nomor_telepon, alamat);
            listemp.addSupervisor(r);
        }else if(jabatan.equals("Pegawai")){
            System.out.println("======Pegawai======");
            System.out.print("Masukan ID Karyawan: ");
            String id = input.nextLine();
            System.out.print("Masukan Nama Karyawan: ");            
            String nama = input.nextLine();
            System.out.print("Masukan Umur Karyawan: ");
            int umur = forINT.nextInt();
            System.out.print("Masukan Nomor Telepon Karyawan: ");
            String nomor_telepon = input.nextLine();
            System.out.print("Masukan Alamat Karyawan: ");
            String alamat = input.nextLine();
            Pegawai r = new Pegawai(id, nama, umur, nomor_telepon, alamat);
            listemp.addPegawai(r);
        }else{
            System.out.println("======Jabatan Tidak Ada======");
        }
        System.out.println("============================");
    }
    public void hapusPegawai(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jabatan: ");
        String jabatan = input.nextLine();
        System.out.print("Masukan nama karyawan: ");
        String employee = input.nextLine();
        
        //Belum dikasih batasan kalo namanya gk ketemu
        if(jabatan.equals("Manager")){
            for(Manager m : listemp.listManager){
                if(m.getNamaEmployee().equals(employee)){
                    listemp.hapusManager(m);
                    break;
                }
            }
            System.out.println("=== "+employee + " dengan jabatan "+ jabatan+" telah dihapus ===");
        }else if(jabatan.equals("Supervisor")){
            for(Supervisor m : listemp.listSupervisor){
                if(m.getNamaEmployee().equals(employee)){
                    listemp.hapusSupervisor(m);
                    break;
                }
            }
            System.out.println("=== "+employee + " dengan jabatan "+ jabatan+" telah dihapus ===");
        }else if(jabatan.equals("Pegawai")){
            for(Pegawai m : listemp.listPegawai){
                if(m.getNamaEmployee().equals(employee)){
                    listemp.hapusPegawai(m);
                    break;
                }
            }
            System.out.println("=== "+employee + " dengan jabatan "+ jabatan+" telah dihapus ===");
        }else{
            System.out.println("=== Jabatan tidak ada, penghapusan gagal ===");
        }   
    }
    public void assignLembur(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jabatan: ");
        String jabatan = input.nextLine();
        System.out.print("Masukan nama karyawan: ");
        String employee = input.nextLine();
        
        if(jabatan.equals("Manager")){
            for(Manager m : listemp.listManager){
                if(m.getNamaEmployee().equals(employee)){
                    m.setCurrentLembur().status = true;
                    System.out.println("Lembur sudah dikonfirmasi kepada "+ m.getNamaEmployee());
                    break;
                }
            }
        }else if(jabatan.equals("Supervisor")){
            for(Supervisor m : listemp.listSupervisor){
                if(m.getNamaEmployee().equals(employee)){
                    m.setCurrentLembur();
                    System.out.println("Lembur sudah dikonfirmasi kepada "+ m.getNamaEmployee());
                    break;
                }
            }
        }else if(jabatan.equals("Pegawai")){
            for(Pegawai m : listemp.listPegawai){
                if(m.getNamaEmployee().equals(employee)){
                    m.setCurrentLembur();
                    System.out.println("Lembur sudah dikonfirmasi kepada "+ m.getNamaEmployee());
                    break;
                }
            }
        }else{
            System.out.println("Jabatan tidak ada");
        }
        
    }
    public void cekGajiEmployee(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jabatan: ");
        String jabatan = input.nextLine();
        System.out.print("Masukan nama karyawan: ");
        String employee = input.nextLine();
        System.out.println("===== Cek Total Gaji Karyawan =====");
        
        if(jabatan.equals("Manager")){
            for(Manager m : listemp.listManager){
                if(m.getNamaEmployee().equals(employee)){
                    System.out.println("Nama Jabatan: "+m.getNamaJabatan());
                    System.out.println("Nama Pegawai: "+m.getNamaEmployee());
                    System.out.println("Total Gaji: "+m.totalGaji);
                    System.out.println("============");
                    break;
                }
            }
        }else if(jabatan.equals("Supervisor")){
            for(Supervisor m : listemp.listSupervisor){
                if(m.getNamaEmployee().equals(employee)){
                    System.out.println("Nama Pegawai: "+m.getNamaEmployee());
                    System.out.println("Total Gaji: "+m.totalGaji);
                    System.out.println("============");
                    break;
                }
            }
        }else if(jabatan.equals("Pegawai")){
            for(Pegawai m : listemp.listPegawai){
                if(m.getNamaEmployee().equals(employee)){
                    System.out.println("Nama Pegawai: "+m.getNamaEmployee());
                    System.out.println("Total Gaji: "+m.totalGaji);
                    System.out.println("============");
                    break;
                }
            }
        }else{
            System.out.println("Jabatan tidak ada");
        }
        
    }
    
    public void cekKeterlambatan(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jabatan: ");
        String jabatan = input.nextLine();
        System.out.print("Masukan nama karyawan: ");
        String employee = input.nextLine();
        System.out.println("===== Cek Total Keterlambatan Karyawan =====");
        
        if(jabatan.equals("Manager")){
            for(Manager m : listemp.listManager){
                if(m.getNamaEmployee().equals(employee)){
                    System.out.println("Nama Jabatan: "+m.getNamaJabatan());
                    System.out.println("Nama Pegawai: "+m.getNamaEmployee());
                    System.out.println(m.totalTerlambat);
                    System.out.println("============");
                    break;
                }
            }
        }else if(jabatan.equals("Supervisor")){
            for(Supervisor m : listemp.listSupervisor){
                if(m.getNamaEmployee().equals(employee)){
                    System.out.println("Nama Jabatan: "+m.getNamaJabatan());
                    System.out.println("Nama Pegawai: "+m.getNamaEmployee());
                    System.out.println(m.totalTerlambat);
                    System.out.println("============");
                    break;
                }
            }
        }else if(jabatan.equals("Pegawai")){
            for(Pegawai m : listemp.listPegawai){
                if(m.getNamaEmployee().equals(employee)){
                    System.out.println("Nama Jabatan: "+m.getNamaJabatan());
                    System.out.println("Nama Pegawai: "+m.getNamaEmployee());
                    System.out.println(m.totalTerlambat);
                    System.out.println("============");
                    break;
                }
            }
        }else{
            System.out.println("Jabatan tidak ada");
        }
    }
    public void cetakLaporanKehadiran(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jabatan: ");
        String jabatan = input.nextLine();
        System.out.print("Masukan nama karyawan: ");
        String employee = input.nextLine();
        System.out.println("===== Cetak Laporan Kehardiran =====");
        
        if(jabatan.equals("Manager")){
            for(Manager m : listemp.listManager){
                if(m.getNamaEmployee().equals(employee)){
                    System.out.println("Nama Jabatan: "+m.getNamaJabatan());
                    System.out.println("Nama Pegawai: "+m.getNamaEmployee());
                    System.out.println(m.totalJamKerja);
                    System.out.println("============");
                    break;
                }
            }
        }else if(jabatan.equals("Supervisor")){
            for(Supervisor m : listemp.listSupervisor){
                if(m.getNamaEmployee().equals(employee)){
                    System.out.println("Nama Jabatan: "+m.getNamaJabatan());
                    System.out.println("Nama Pegawai: "+m.getNamaEmployee());
                    System.out.println(m.totalJamKerja);
                    System.out.println("============");
                    break;
                }
            }
        }else if(jabatan.equals("Pegawai")){
            for(Pegawai m : listemp.listPegawai){
                if(m.getNamaEmployee().equals(employee)){
                    System.out.println("Nama Jabatan: "+m.getNamaJabatan());
                    System.out.println("Nama Pegawai: "+m.getNamaEmployee());
                    System.out.println(m.totalJamKerja);
                    System.out.println("============");
                    break;
                }
            }
        }else{
            System.out.println("Jabatan tidak ada");
        }
    }
    
}
