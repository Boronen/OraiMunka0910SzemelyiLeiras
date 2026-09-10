/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package szemelystatisztika;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author kovacs.kevin
 */
public class SzemelyStatisztika {

    /**
     * @param args the command line arguments
     */
    static String nev = "Józsi";
    static int szulEv = 1998;

    public static void main(String[] args) throws IOException {
        hibak();
        kiiras(koszontes(nev));
        kiiras("Születési éve: ", szulEv);
        int egyadottevben = evszamolas(szulEv, 2026);
        kiiras("2026 ban ennyi éves lesz: ", egyadottevben);
        kiiras("Nyugdíjáig hátrelévő év: ", nyugdij(egyadottevben, 65));
    }
    
    public static void hibak() throws IOException{
        if(!marnyugdijas(szulEv)){
            throw new IOException("Már nyugdíjas");
        }
    }

    public static void kiiras(String adat) {
        System.out.println(adat);
    }

    public static void kiiras(String szoveg, int adat) {
        System.out.println(szoveg + adat);
    }

    public static String koszontes(String nev) {
        return "Üdvözöllek %s!".formatted(nev);
    }

    public static int evszamolas(int szulEv, int targetEv) {
        return targetEv - szulEv;
    }

    public static int evszamolas(int adat) {
        return adat;
    }

    public static int nyugdij(int adat, int nyugdij) {
        return nyugdij - evszamolas(adat);
    }
    static boolean marnyugdijas(int nyugdij){
        return nyugdij>0;
    }

}
