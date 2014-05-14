/**
 * Class LinkedList
 * 
 * Diese Klasse stellt die Funktionen fuer die verkettete Liste zur Verfuegung.
 * Implementiert das Interface List.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class LinkedList implements List{

    private int length = 0;
    Termin first = new Termin();
    
    @Override
    public boolean isEmpty() {
        if(this.length == 0) {
            return true;
        }
        return false;
    }

    @Override
    public int length() {
        return this.length;
    }

    @Override
    public Termin firstTermin() {
        if(this.isEmpty()) {
            return null;
        }
        return this.first;
    }

    @Override
    public List insert(Termin x) {
        if(this.isEmpty() == true) {
            this.first = x;
            System.out.println("new first?!");
            this.length++;
        } else {
            Termin last = this.first;
            while(last.getNextTermin() != null) {
                last = last.getNextTermin();
            }
            last.setNextTermin(x);
            this.length++;
        }
        return null;
    }

    @Override
    public List delete(Termin x) {
        // TODO Auto-generated method stub
        return null;
    }
    
    public void readCSV(String file) throws IOException {
        //fehler abgefangen?
        BufferedReader br = new BufferedReader(new FileReader(file));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            
            while (line != null) {
                sb.append(line);
                //hier
                String[] s = line.split(";");
                Termin date = new Termin(Integer.parseInt(s[0]),Integer.parseInt(s[1]),Integer.parseInt(s[2]),
                        s[3],s[4],s[5]);
                this.insert(date);
                //
                line = br.readLine();
                System.out.println("read new date");
            }
            //String everything = sb.toString();
            //System.out.println("Test");
        } finally {
            //??
            System.out.println("Fehler!");
        }
    }
    
}
