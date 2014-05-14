/**
 * Erste Hausaufgabe, Nummer 58:
 * -beschreibung-
 * 
 * @author Jake...
 * @author Kevin...
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Aufgabe58 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<Termin> DateList = new LinkedList<Termin>();
		try {
			LinkedList<Termin> dateList = new LinkedList<Termin>();
			
			dateList = readCSV("progtermine.csv");
			System.out.println("Done!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static LinkedList<Termin> readCSV(String file) throws IOException {
        //fehler abgefangen?
        BufferedReader br = new BufferedReader(new FileReader(file));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            
            LinkedList<Termin> tempList = new LinkedList<Termin>();
            
            while (line != null) {
                sb.append(line);
                //
                String[] s = line.split(";");
                
                Termin date = new Termin(Integer.parseInt(s[0]),Integer.parseInt(s[1]),Integer.parseInt(s[2]),
                        s[3],s[4],s[5]);
                tempList.insert(date);
                //
                line = br.readLine();
                System.out.println("read new date");
            }
            return tempList;
            //String everything = sb.toString();
            //System.out.println("Test");
        } finally {
            //?? wie funktioniert das?
            System.out.println("Fehler!");
            
        }
    }

}
