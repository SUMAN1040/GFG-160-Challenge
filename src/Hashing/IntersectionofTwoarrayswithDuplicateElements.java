/*
 * Name: Suman Kumar Dey
 * Github: SUMAN1040
 * Linkedln: www.linkedin.com/in/suman1040
 */

package Hashing;

public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
    // code here
    HashSet<Integer> setA = new HashSet<>();
    for (int num : a) {
        setA.add(num);
    }

    HashSet<Integer> resultSet = new HashSet<>();
    for (int num : b) {
        if (setA.contains(num)) {
            resultSet.add(num);
        }
    }

    return new ArrayList<>(resultSet);
}
}
