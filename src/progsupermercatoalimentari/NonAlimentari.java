/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progsupermercatoalimentari;
/*ESERCIZIO 2 (data da non fare)
Il gestore del negozio vuole fare una distinzione tra i prodotti Alimentari e quelli Non Alimentari. 
Ai prodotti Alimentari viene infatti associata una data di scadenza (si veda la classe Data),
mentre a quelli Non Alimentari il materiale principale di cui sono fatti. 
Realizzare le sottoclassi Alimentari e NonAlimentari estendendo opportunamente la classe Prodotti.
Realizzare un metodo toString che permetta la stampa a video delle caratteristiche del prodotto*/
/**
 *
 * @author gabriel.ricaldone
 */
public class NonAlimentari extends Prodotti{
    protected String materialePrincipale;
    /* ESERCIZIO 3
    Modificare le due sottoclassi dell'esercizio 2 
    specializzando il metodo applicaSconto in modo che nel caso dei prodotti Alimentari 
    venga applicato uno sconto del 20% se la data di scadenza 
    è a meno di 10 giorni dalla data attuale (si usi il metodo getDifference della classe Data),
    mentre nel caso dei prodotti Non Alimentari venga applicato uno sconto del 10% se 
    il prodotto è composto da un materiale riciclabile (carta, vetro o plastica).*/
    NonAlimentari(String codiceBarre, String descrizione, float prezzo, String materialePrincipale) {
        super(codiceBarre, descrizione, prezzo);
        this.materialePrincipale = materialePrincipale;
        
    }
    
    NonAlimentari() {
        super();
        System.out.println("Mi dia il materiale principale");
        materialePrincipale = in.nextLine();
        
    }
    
    @Override
    public String toString() {
        String output;
        output = super.toString();
        output += "\n-Materiale principale: " + materialePrincipale;
        return output;
    }
    
    @Override
    public void applicaSconto() {
        String tempMateriale = materialePrincipale.toLowerCase();
        switch(tempMateriale) {
            case "vetro":
                    prezzo -= prezzo / 100 * 10;
                break;
            case "carta":
                    prezzo -= prezzo / 100 * 10;
                break;
            case "plastica":
                    prezzo -= prezzo / 100 * 10;
                break;
        }
    }
}
