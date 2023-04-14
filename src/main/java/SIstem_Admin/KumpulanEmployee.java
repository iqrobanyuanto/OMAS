/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SIstem_Admin;
import Divisi.*;
import java.util.List;
/**
 *
 * @author Iqro Banyuanto
 */
public class KumpulanEmployee {
    public List<Manager> listManager; 
    public List<Pegawai> listPegawai;
    public List<Supervisor> listSupervisor;
    
    public void addManager(Manager baru){
        listManager.add(baru);
    }
    
    public void addSupervisor(Supervisor baru){
        listSupervisor.add(baru);
    }
    
    public void addPegawai(Pegawai baru){
        listPegawai.add(baru);
    }
    
    public void hapusManager(Manager emp){
            listManager.remove(emp);
    }
    public void hapusSupervisor(Supervisor emp){
            listSupervisor.remove(emp);
    }
    public void hapusPegawai(Pegawai emp){
            listPegawai.remove(emp);
    }
    
}
