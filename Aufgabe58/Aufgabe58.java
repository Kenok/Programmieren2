/**
 * Erste Hausaufgabe, Nummer 58:
 * -beschreibung-
 * 
 * @author Jake...
 * @author Kevin...
 */

import java.io.IOException;


public class Aufgabe58 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList DateList = new LinkedList();
		try {
			DateList.readCSV("progtermine.csv");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
