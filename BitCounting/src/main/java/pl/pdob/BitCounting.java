package pl.pdob;

import java.lang.invoke.MethodHandles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BitCounting {

    private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    private BitCounting() {
        throw new IllegalStateException("Utility class");

    }

    public static void main(String[] args) {
        BitCounting.countBits(5);
    }

    public static int countBits(int n) {
        // Show me the code!

        int bitCount = Integer.bitCount(n);

        String msg = String.format("Number of bits for number %d is equal %d",n,bitCount);
        log.info(msg);

        return bitCount;
    }

}