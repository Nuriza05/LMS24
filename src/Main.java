import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer>numbers1 = new HashSet<>();
        numbers1.add(2);
        numbers1.add(2);
        numbers1.add(5);
        numbers1.add(3);
        Set<Integer>numbers2 = new HashSet<>();
        numbers2.add(5);
        numbers2.add(4);
        numbers2.add(9);


        symmetricDifference(numbers1,numbers2);

    }
    public static void symmetricDifference(Set<Integer>n1,Set<Integer>n2){
        Set<Integer> numbers3 = new HashSet<>(n1);
        numbers3.addAll(n2);
        Set<Integer> v = new HashSet<>(n1);
        v.retainAll(n2);
        numbers3.removeAll(v);
        System.out.println(numbers3);










    }
}