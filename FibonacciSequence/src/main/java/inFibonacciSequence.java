/**
 * Interface for fibonacci sequence
 *
 * @author Pavel Dohnalik (pavel.dohnalik@mavenir.com)
 * @since 7.8.18
 */
public interface inFibonacciSequence {

	void init();

	void init(int f0, int f1);

	void reset();

	int getNext();

	int getCurrent();

	int getIndexOf(int fx) throws IllegalArgumentException;

	int getNumber(int index) throws IllegalArgumentException;
}
