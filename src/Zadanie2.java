import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Zadanie2 {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> numbers = new HashSet<>();
        while (numbers.size() < 20){
            numbers.add(random.nextInt(1000));
        }
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            Integer number = iterator.next();
            if (number % 2 == 1){
                iterator.remove();
            }
        }
    }
}
