import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CompareSets {

    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>(Arrays.asList(3, 6, 43, 8, 11, 7, 33, 3, 4, 8));
        //hashSet.add(2);
        System.out.println(hashSet);

        Set<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(3, 6, 43, 8, 11, 7, 33, 3, 4, 8));
        System.out.println(linkedHashSet);

        Set<Integer> treeSet = new TreeSet<>(Arrays.asList(3, 6, 43, 8, 11, 7, 33, 3, 4, 8));
        System.out.println(treeSet);


    }
}

