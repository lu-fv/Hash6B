import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SumAndAverage {

    private List<Integer> numbers = new ArrayList<>();

    public static List<Integer> AddNumbers() {
        List<Integer> numbers = new ArrayList<>();

        Integer number1 = new Integer(3);
        Integer number2 = new Integer(7);
        Integer number3 = new Integer(7);
        Integer number4 = new Integer(4);

        numbers.add(number1);
        numbers.add(number2);
        numbers.add(number3);
        numbers.add(number4);

        return numbers;

    }

    public void CalculateSumAndAverage(List<Integer> numbers) {
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        double prom = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);

        System.out.println(" Suma: " + sum);
        System.out.println(" Average: " + prom);
    }

    public Map<Integer, Integer> Frecuency(List<Integer> numbers) {
        return numbers.stream().collect(Collectors.toMap(num -> num, num -> 1, Integer::sum));
    }

    public void ShowFrecuency(Map<Integer, Integer> frecuencyMap) {
        for (Map.Entry<Integer, Integer> entry : frecuencyMap.entrySet()) {
            System.out.println(" Number " + entry.getKey() + " frecuency: " + entry.getValue());
        }
    }

}
