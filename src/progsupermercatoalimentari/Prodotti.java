/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progsupermercatoalimentari;
import java.util.Scanner;
/**
 *
 * @author gabriel.ricaldone
 */
public class Prodotti extends Object{
    /* Il gestore di un negozio associa a tutti i suoi Prodotti un codice a barre univoco,
    una descrizione sintetica del prodotto e il suo prezzo unitario. 
    Realizzare una classe Prodotti con le opportune variabili d'istanza e metodi get e set.
    Realizzare un metodo toString che permetta la stampa a video delle caratteristiche del prodotto*/
    
    /*Aggiungere alla classe prodotti un metodo applicaSconta che modifica
      il prezzo del prodotto diminuendolo del 5%*/
    protected String codiceBarre;
    protected String descrizione;
    protected float prezzo;
    protected Scanner in = new Scanner(System.in);
    //Sconto = prezzo pieno / 100 * sconto
    Prodotti(String codiceBarre, String descrizione, float prezzo) {
        this.codiceBarre = codiceBarre;
        this.descrizione = descrizione;
        if (prezzo > 0) {
            this.prezzo = prezzo;
        } else {
            this.prezzo = 0;
        }
    }
    
    Prodotti() {
        System.out.println("Mi dia il codice a barre");
        codiceBarre = in.nextLine();
        System.out.println("Mi dia la descrizione");
        descrizione = in.nextLine();
        System.out.println("Mi dia il prezzo");
        do {
            prezzo = in.nextFloat();
        } while(prezzo < 0);
    }
    public String getCodiceBarre() {
        return codiceBarre;
    }
    
    public String getDescrizione() {
        return descrizione;
    }
    
    public float getPrezzo() {
        return prezzo;
    }
    
    public void setCodicedBarre(String codiceBarre) {
        this.codiceBarre = codiceBarre;
    }
    
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    
    @Override
    public String toString() {
        System.out.println("codice a barre prodotto: " 
                            + codiceBarre);
        System.out.println("descrizione prodotto: "
                            + descrizione);
        System.out.println("prezzo:" 
                            + prezzo);
        return "Stampato";
    }
    
    public void applicaSconto() {
        prezzo -= prezzo / 100 * 5;
    }
}
