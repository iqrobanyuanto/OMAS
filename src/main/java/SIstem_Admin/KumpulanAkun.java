/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SIstem_Admin;
import java.util.List;
/**
 *
 * @author Iqro Banyuanto
 */
public class KumpulanAkun {
    private List<Akun> listAkun;
    public void addAkun(Akun input){
        listAkun.add(input);
    }
    
    public boolean cekAkun(Akun input){
        boolean a = (listAkun.contains(input))?false:true;
        return a;
    }
}
