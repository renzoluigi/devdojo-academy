package academy.devdojo.javaoneforall.javacore.Fstaticmodifier.domain;

import java.util.Arrays;

/*
 The order of JVM initialization is:
 0 - Static initialization block is executed when the JVM loads the class and only once
 1 - The memory is allocated
 2 - Each class attribute is initialized
 3 - The initialization block is executed
 4 - The constructor is executed
*/
public class Anime {
    private String name;
    private static int[] episodes;
    static { // The initialization block is executed only once for all objects of this class
        System.out.println("Inside init block");
        episodes = new int[1000];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }
    static { // They are executed in the order they appear in the class
        System.out.println("Inside init block 2");
        // this.name cannot be referenced from a static context, because he is not yet initialized
    }
    static {
        System.out.println("Inside init block 3");
    }
    {
        System.out.println("Inside non-static init block");
    }
    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        System.out.println(Arrays.toString(episodes));
    }

    public String getName() {
        return name;
    }

    public static int[] getEpisodes() {
        return episodes;
    }
}
