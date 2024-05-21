import java.util.Arrays;
import java.util.ArrayList;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;
import java.util.TreeSet;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //  Ejercicio2();
        // Ejercicio1();
        //  Ejercicio3();
        // Ejercicio4();
        //Ejercicio5();
        Ejercicio6();

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

    public static void Ejercicio5() {
        // OrderAsyDes orderAsyDes = new OrderAsyDes();
        List<Integer> orderToNumbers = OrderAsyDes.getNumbers();
        TreeSet<Integer> orderNumbers = new TreeSet<>(orderToNumbers);
        OrderAsyDes.AscendingOrder(orderNumbers);

        System.out.println("Números en orden ascendente: " + orderNumbers);

        List<Integer> dsNumbers = OrderAsyDes.DescendingOrder(orderNumbers);
        System.out.println("Números en orden descendente: " + dsNumbers);

    }

    public static void Ejercicio6() {

        ABM manejoPersonas = new ABM();

        manejoPersonas.Alta(new Person(" Lucia", 30, 23698444));
        manejoPersonas.Alta(new Person(" Ale", 29, 33584111));
        manejoPersonas.Alta(new Person(" Manu", 23, 36005610));
        manejoPersonas.Alta(new Person(" Sol", 25, 30145338));

        manejoPersonas.Modifica(23698444, "Lucas", 31);


        manejoPersonas.AddPerson(new Person("Franco", 60, 11133346));

        List<Person> list = Arrays.asList(
                new Person("Daniel", 40, 29265162),
                new Person("Ramon", 20, 40899746)
        );
        manejoPersonas.AddPersonList(list);
        manejoPersonas.ShowPeople();

        manejoPersonas.Baja(30145338);

        List<Person> listByAge = manejoPersonas.OrderByAge();
        System.out.println("\n Lista ordenada por edad: ");
        for (Person p : listByAge) {
            System.out.println(p);
        }
    }

}








