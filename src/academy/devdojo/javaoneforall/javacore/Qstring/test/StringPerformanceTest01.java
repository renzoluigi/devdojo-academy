package academy.devdojo.javaoneforall.javacore.Qstring.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        concatString(10_000); // 156 ms
        long finish = System.currentTimeMillis();
        System.out.println("Spent time for String: " + ((finish - start)) + "ms");

        start = System.currentTimeMillis();
        concatStringBuilder(10_000_000); // 0 ms
        finish = System.currentTimeMillis();
        System.out.println("Spent time for StringBuilder: " + ((finish - start)) + "ms");

        start = System.currentTimeMillis();
        concatStringBuffer(10_000_000); // 1 ms
        finish = System.currentTimeMillis();
        System.out.println("Spent time for StringBuffer: " + ((finish - start)) + "ms");
    }

    private static void concatString(int length) {
        String text = "";
        for (int i = 0; i < length; i++) {
            text += i; // for each iteration, he creates a new string in the string pool, because strings are immutable
        }
    }

    private static void concatStringBuilder(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int length) {
        StringBuffer sb = new StringBuffer(length); // Great when working with threads
        for (int i = 0; i < length; i++) {
            sb.append(i);
        }
    }
}

// This happens because strings aren't erased from the memory, he continues in the memory