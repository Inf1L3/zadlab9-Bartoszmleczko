/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

/**
 *
 * @author student
 */
public class Samochody  {
       private String marka;
    private String nazwa_samochodu;
    private double v_max;
    private double cena;

    public Samochody(String marka, String nazwa_samochodu, double v_max, double cena) {
        this.marka = marka;
        this.nazwa_samochodu = nazwa_samochodu;
        this.v_max = v_max;
        this.cena = cena;
    }

    public String getMarka() {
        return marka;
    }

    public String getNazwa_samochodu() {
        return nazwa_samochodu;
    }

    public double getV_max() {
        return v_max;
    }

    public double getCena() {
        return cena;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setNazwa_samochodu(String nazwa_samochodu) {
        this.nazwa_samochodu = nazwa_samochodu;
    }

    public void setV_max(double v_max) {
        this.v_max = v_max;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
    
     @Override
    public String toString() {
        return  "Marka: " + marka + ", Nazwa: " + nazwa_samochodu + ", Predkoscmax: " + v_max + ", Cena: " + cena ;
    }
    
}
