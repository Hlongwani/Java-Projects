
package javaapplication31;




import java.util.*;

public class SneakyOutcomes {
    public static void main(String[] args) {
        int[] outcomes = {123456, 234567, 123347, 456789, 567890, 678901, 789012, 890123, 901234, 112233, 223344, 334455, 789012, 222234, 123347};
        int[] duplicates = findDuplicates(outcomes);
        System.out.println(Arrays.toString(duplicates));
    }

    public static int[] findDuplicates(int[] outcomes) {
        Set<Integer> seen = new HashSet<>();
        int[] duplicates = new int[2];
        int index = 0;

        for (int outcome : outcomes) {
            if (seen.contains(outcome)) {
                duplicates[index++] = outcome;
            } else {
                seen.add(outcome);
            }
        }
        return duplicates;
    }
}

