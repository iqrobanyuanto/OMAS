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
    public List<Akun> listAkun = new List<Akun>();
    public KumpulanAkun(){
        String id = "agus";
        String pass = "hehe";
        Akun n = new Akun(id, pass);
        listAkun.add(n);
    }
    public boolean cekAkun(Akun input){
        boolean a = (listAkun.contains(input))?false:true;
        return a;
    }
}
