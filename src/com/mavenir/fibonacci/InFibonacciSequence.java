package com.mavenir.fibonacci;

/**
 * Interface for fibonacci sequence
 *
 * @author Pavel Dohnalik (pavel.dohnalik@mavenir.com)
 * @since 7.8.18
 */
public interface InFibonacciSequence {

    void init();

    void init(int f0, int f1);

    void reset();
}
