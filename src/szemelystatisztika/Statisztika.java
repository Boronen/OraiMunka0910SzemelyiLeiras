/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package szemelystatisztika;

import static szemelystatisztika.SzemelyStatisztika.rnd;

/**
 *
 * @author kovacs.kevin
 */
public class Statisztika {

    static private Szemely sz;

    public Statisztika(Szemely sz) {
        this.sz = sz;
    }

    public Szemely getSz() {
        return sz;
    }

    public static int evszamolas(int szulEv, int targetEv) {
        return targetEv - sz.getSzEv();
    }

    public static int evszamolas(int adat) {
        return adat;
    }

    public static int nyugdij(int adat, int nyugdij) {
        return nyugdij - evszamolas(adat);
    }

    static boolean marnyugdijas(int nyugdij) {
        return nyugdij > 0;
    }

}
