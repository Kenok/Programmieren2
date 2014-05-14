/**
 * Interface List:
 * 
 * Schnittstelle zur Verwendung mit Listen.
 */

public interface List {
	boolean isEmpty();
	int length();
	Termin firstTermin();
	List insert(Termin x);
	List delete(Termin x);
}
