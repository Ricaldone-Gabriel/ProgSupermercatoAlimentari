/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progsupermercatoalimentari;

import java.util.GregorianCalendar;

/**
 *
 * @author gabriel.ricaldone
 */

/*CLASSE PRODOTTI-ALIMENTARI E NON ALIMENTARI
ESERCIZIO 1
Il gestore di un negozio associa a tutti i suoi Prodotti un codice a barre univoco, una descrizione sintetica del prodotto e il suo prezzo unitario. Realizzare una classe Prodotti con le opportune variabili d'istanza e metodi get e set.
Realizzare un metodo toString che permetta la stampa a video delle caratteristiche del prodotto

ESERCIZIO 1b
Aggiungere alla classe Prodotti un metodo applicaSconto che modifica il prezzo del prodotto diminuendolo del 5%.

ESERCIZIO 2 (data da non fare)
Il gestore del negozio vuole fare una distinzione tra i prodotti Alimentari e quelli Non Alimentari . Ai prodotti Alimentari viene infatti associata una data di scadenza (si veda la classe Data), mentre a quelli Non Alimentari il materiale principale di cui sono fatti. Realizzare le sottoclassi Alimentari e NonAlimentari estendendo opportunamente la classe Prodotti.
Realizzare un metodo toString che permetta la stampa a video delle caratteristiche del prodotto

ESERCIZIO 3
Modificare le due sottoclassi dell'esercizio 2 specializzando il metodo applicaSconto in modo che nel caso dei prodotti Alimentari venga applicato uno sconto del 20% se la data di scadenza è a meno di 10 giorni dalla data attuale (si usi il metodo getDifference della classe Data), mentre nel caso dei prodotti Non Alimentari venga applicato uno sconto del 10% se il prodotto è composto da un materiale riciclabile (carta, vetro o plastica).

ESERCIZIO 4 
Gestire una classe test per verificare il corretto funzionamento delle classi*/
public class ProgSupermercatoAlimentari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alimentari cibo = new Alimentari("AA","AA",100,new GregorianCalendar(2022,10,30));
        cibo.applicaSconto();
        System.out.println(cibo.getPrezzo());
    }
    
}
