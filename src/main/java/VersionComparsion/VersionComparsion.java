package VersionComparsion;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class VersionComparsion {


    public static class sort_collection {

        public static void main(String[] args) {
            SortedSet<String> Versions = new TreeSet();
            Versions.addAll(Arrays.asList("4.2", "4.4", "5.0", "5.0.1", "6.0", "7.0", "8.0", "5.0", "4.4", "6.0", "4.1", "8.0", "5.0"));
            System.out.println("Sorted Set: " + Versions);
        }
    }
}
