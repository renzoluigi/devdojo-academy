package academy.devdojo.javaoneforall.javacore.Minterfaces.test;

import academy.devdojo.javaoneforall.javacore.Minterfaces.domain.DataLoader;
import academy.devdojo.javaoneforall.javacore.Minterfaces.domain.DatabaseLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        databaseLoader.load();
        databaseLoader.remove();
        databaseLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();

        int maxDataSize = DatabaseLoader.MAX_DATA_SIZE;
        System.out.println(maxDataSize);
    }
}
