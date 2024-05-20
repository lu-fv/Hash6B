/*Escriba un programa que lea una lista de números enteros y luego ordene la
lista en orden ascendente y descendente. Utilice un TreeSet para almacenar
los números y mostrarlos en orden ascendente y descendente.*/
import java.util.*;

public class OrderAsyDes {
  //  private List<Integer> orderNumbers = new ArrayList<>();

    public static List<Integer> getNumbers(){

        List<Integer> orderNumbers = new ArrayList<>();

        Integer numberOne = new Integer(7);
        Integer numberTwo = new Integer(20);
        Integer numberThree = new Integer(11);
        Integer numberFour = new Integer(1);
        Integer numberFive = new Integer(15);

        orderNumbers.add(numberOne);
        orderNumbers.add(numberTwo);
        orderNumbers.add(numberThree);
        orderNumbers.add(numberFour);
        orderNumbers.add(numberFive);

        return orderNumbers;
    }
    public static TreeSet <Integer> AscendingOrder(TreeSet <Integer> asNumbers){
        return new  TreeSet<>(asNumbers);
    }
    public static List <Integer> DescendingOrder ( TreeSet<Integer> dsNumbers){
        List <Integer> descendingNumbersList = Arrays.asList(dsNumbers.toArray(new Integer[0]));
        Collections.reverse(descendingNumbersList);
        return descendingNumbersList;
    }

}
