/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;
import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
/**
 *
 * @author maarchyl
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] tab = new int[100];
        int k;
        Random r = new Random();
        /*for(int i=0;i<100;i++){
            tab[i]=r.nextInt(100);
        }
        int pom;
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                if(tab[i]>tab[j]){
                    pom=tab[i];
                    tab[i]=tab[j];
                    tab[j]=pom;
                }
            }
        }
        for(int i=0;i<100;i++){
            System.out.println(tab[i]);
        }*/
        TreeSet ts = new TreeSet<>();
        for(int i=0;i<100;i++){
            k=r.nextInt(101);
            ts.add(k);
        }
        
       Iterator it = ts.iterator();
        
       	while (it.hasNext()) {
		System.out.print(it.next() + " ");
	}
        List<Samochody> lista = new ArrayList<>();
       
        Samochody ford = new Samochody("Ford", "Mustang", 290,700000);
        Samochody fiat = new Samochody("Fiat", "126p", 14,35000);
        Samochody seat = new Samochody("Seat", "Toledo", 190, 23500);
        Samochody opel = new Samochody("Opel", "Zafira", 225, 80000);
        Samochody peugeot = new Samochody("Peugeot", "Partner", 145, 7000);
        lista.add(ford);
        lista.add(fiat);
        lista.add(seat);
        lista.add(opel);
        lista.add(peugeot);
        
        System.out.println(lista.get(3).toString());
    }
    
}
