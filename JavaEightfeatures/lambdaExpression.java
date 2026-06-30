import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class lambdaExpression {
    public static void main(String[] args) {
        List<Integer> ls =Arrays.asList(7,4,21,4,6,8,3);

        // this is the example ofthe lambda expression with the stream
        ls.stream()
        .filter(n -> n%2==0)
        .forEach(n -> System.out.println(n));

        // now simple the array sort operation if want to sort in descending order 
        Collections.sort(ls,(a,b) -> a.compareTo(b));                    

        // rteals use case 
        // Data filtering and transformation – Used to filter, map, and process data easily.
        // Collection processing – Helps in iterating, sorting, and managing collections like List, Set, and Map.
        // Event handling – Commonly used in GUI applications for handling user actions.
        // Multithreading (Runnable tasks) – Simplifies thread creation using Runnable interface.
        // Stream operations – Works with Stream API for functional-style data processing.
    }
}