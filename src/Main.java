
import java.util.ArrayList;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Ejercicio2();
        // Ejercicio1();
        //  Ejercicio3();
        Ejercicio4();

    }

    public static void Ejercicio1() {

        String select;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Add a String: ");
        select = sc.nextLine();
        sc.close();

        CountString countString = new CountString();

        HashMap<Character, Integer> characterCountMap = countString.characterCountMap(select);
        countString.ShowMap(characterCountMap);
    }

    public static void Ejercicio2() {

        List<Integer> aleatoyryNumberList = new ArrayList<>();

        AleatoyryNumber an = new AleatoyryNumber();

        an.AleatoyryNumbers();
        aleatoyryNumberList = an.aleatoyryNumberList;
        System.out.println(" array " + aleatoyryNumberList);

        HashSet<Integer> numberHashSet = new HashSet<>(aleatoyryNumberList);
        List<Integer> listWithoutRepeat = new ArrayList<>(numberHashSet);
        System.out.println(" HASH: " + listWithoutRepeat);


    }

    public static void Ejercicio3() {
        TreeMapAge treeMapAge = new TreeMapAge();
        TreeMap<Integer, String> peopleTreeMap = treeMapAge.Addpeople();
        treeMapAge.ShowtreeMap(peopleTreeMap);

    }

    public static void Ejercicio4() {
        List<Integer> numbers = SumAndAverage.AddNumbers();
        SumAndAverage num = new SumAndAverage();
        Map<Integer, Integer> frecuencyMap = num.Frecuency(numbers);

        num.CalculateSumAndAverage(numbers);

        num.ShowFrecuency(frecuencyMap);


    }

}








