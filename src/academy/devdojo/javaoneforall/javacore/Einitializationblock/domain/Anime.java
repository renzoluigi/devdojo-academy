package academy.devdojo.javaoneforall.javacore.Einitializationblock.domain;

import java.util.Arrays;

/*
 The order of JVM initialization is:
 1 - The memory is allocated
 2 - Each class attribute is initialized
 3 - The initialization block is executed
 4 - The constructor is executed
*/
public class Anime {
    private String name;
    private int[] episodes; //if = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}; The initialization of the object is happening before the constructor
    {
        episodes = new int[1000];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
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

    public int[] getEpisodes() {
        return episodes;
    }
}
