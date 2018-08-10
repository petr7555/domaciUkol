
public class Fibonacci implements inFibonacciSequence {
	int previous;
	int current;

	public void init() {
		previous = 0;
		current = 1;

	}

	public void init(int f0, int f1) {
		previous = f0;
		current = f1;
	}

	// reset fibonacci to state before init()
	public void reset() {
		previous = 0;
		current = 0;

	}

	// print next number, move the sequence by one element
	public int getNext() {
		int next = previous + current;
		previous = current;
		current = next;
		return getCurrent();
	}

	public int getCurrent() {
		return current;
	}

	public int getIndexOf(int fx) throws IllegalArgumentException {
		// for fx == 1 returns 2, which is one of two possible values
		if (fx < 0) {
			throw new IllegalArgumentException("Cannot get index of numbers smaller than 0.");
		} else if (fx == 0) {
			return 0;
		} else {
			float fibo = 2.078087F * (float) Math.log(fx) + 1.672276F;

			return Math.round(fibo);
		}

	}

	public int getNumber(int index) throws IllegalArgumentException {
		if (index < 0) {
			throw new IllegalArgumentException("Cannot get number on index smaller than 0.");
		}
		double a = (1.0 / 2 * (1 + Math.sqrt(5)));
		double b = (1.0 / 2 * (1 - Math.sqrt(5)));
		double Fn = (1 / Math.sqrt(5) * ((Math.pow(a, index) - Math.pow(b, index))));
		return (int) Math.round(Fn);
	}

}
