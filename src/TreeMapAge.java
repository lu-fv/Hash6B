/*Escriba un programa que solicite al usuario que ingrese una lista de nombres
de personas y sus edades, y luego ordene la lista por edad. Utilice un
TreeMap para almacenar los nombres y las edades.*/

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapAge {

    private String name;
    private Integer age;

    public TreeMapAge(String name, Integer dni) {
        this.name = name;
        this.age = dni;
    }

    public TreeMapAge() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDni() {
        return age;
    }

    public void setDni(Integer dni) {
        this.age = dni;
    }

    public TreeMap < Integer, String> Addpeople() {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, String> peopleMap = new TreeMap<>();


        System.out.print("Ingresa el número de personas: ");
        Integer peopleCant = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < peopleCant; i++) {

            System.out.println(" Name: ");
            String name = sc.nextLine();

            System.out.println(" Age: ");
            Integer age = sc.nextInt();
            sc.nextLine();
            peopleMap.put(age, name);
        }
        sc.close();
        return peopleMap;
    }

    public void ShowtreeMap (TreeMap<Integer, String> peopleTreeMap){
        System.out.println( " Order by Age: ");
        for (Map.Entry<Integer, String> entry : peopleTreeMap.entrySet()){
            System.out.println(" Name: " + entry.getValue() + " Age: " + entry.getKey());
        }
    }

}