/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SIstem_Admin;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Iqro Banyuanto
 */
public class KumpulanAkun {
    private List<AkunAdmin> listAkun = new ArrayList<>();
    public KumpulanAkun(){
        
    }
    public void addAkun(String id, String pass){
        AkunAdmin r = new AkunAdmin(id, pass);
        listAkun.add(r);
    }
    
    public boolean cekAkun(String user){
        boolean a = false;
        for(AkunAdmin m: listAkun){
            a = (m.id.equals(user))?false:true;
        }
        return a;
    }
    
    public List<AkunAdmin> getListAkun(){
        return listAkun;
    }
}
