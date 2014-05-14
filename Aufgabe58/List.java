/**
 * Interface List:
 * 
 * Schnittstelle zur Verwendung mit Listen.
 */

public interface List<T> {
	boolean isEmpty();
	int length();
	T firstTermin();
	List<T> insert(T x);
	List<T> delete(T x);
}
