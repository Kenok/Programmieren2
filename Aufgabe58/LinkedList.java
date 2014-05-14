/**
 * Class LinkedList
 * 
 * Diese Klasse stellt die Funktionen fuer die verkettete Liste zur Verfuegung.
 * Implementiert das Interface List.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class LinkedList<T> implements List<T>{

    private int length = 0;
    private LinkedList<T> next = null;
    private T item = null;
    
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
    public T firstTermin() {
        if(this.isEmpty()) {
            return null;
        }
        return this.next.item;	//geht aber nur, wenn diese funktion nur von der root-liste (in main) aufgerufen wird!
    }

    @Override
    public List<T> insert(T x) {
    	//sortierung ergaenzen!
    	LinkedList<T> tempList = new LinkedList<T>();
    	tempList.item = x;
    	tempList.next = next;
    	next = tempList;
    	this.length++;
    	return this;
    }

    @Override
    public List<T> delete(T x) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
