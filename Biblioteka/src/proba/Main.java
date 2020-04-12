package proba;

import java.util.LinkedList;

import biblioteka.Autor;
import biblioteka.Biblioteka;
import biblioteka.Knjiga;

public class Main {

	public static void main(String[] args) {

		// punjenje biblioteke
		LinkedList<Autor> autori1 = new LinkedList<Autor>();
		LinkedList<Autor> autori2 = new LinkedList<Autor>();
		Autor a1 = new Autor("Danijel", "Defo");
		Autor a2 = new Autor("Vladimir", "Lazic");
		Autor a3 = new Autor("Miroslav", "Miskovic");
		autori1.add(a1);
		autori1.add(a2);
		autori2.add(a3);
		Knjiga k1 = new Knjiga("Robinzon Kruso", "123", autori1, "Raska", 2020);
		Knjiga k2 = new Knjiga("Ja, tajkun", "111", autori2, "Beograd", 2018);
		Biblioteka b = new Biblioteka();
		b.dodajKnjigu(k1);
		b.dodajKnjigu(k2);

		// testiranje na konzoli
		/*
		 * List<Knjiga> knjige = b.vratiSveKnjige(); for (Knjiga k : knjige)
		 * System.out.println(k);
		 */

		// rad sa fajlovima
		b.sacuvajKnjigeUFajl("biblioteka.json");
		b.obrisiSveKnjige();
		b.ucitajKnjigeIzFajla("biblioteka.json");

	}

}
