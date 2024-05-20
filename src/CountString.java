import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

/* Cree un programa que solicite al usuario que ingrese una cadena de texto y
luego cuente el número de veces que cada carácter aparece en la cadena.
Utilice un HashMap para almacenar los resultados y muestre el mapa al
usuario al final.*/
public class CountString {

    public HashMap<Character, Integer> characterCountMap(String select) {
        HashMap<Character, Integer> characterCountMap = new HashMap<>();

        for (char ch : select.toCharArray()) {
            characterCountMap.put(ch, characterCountMap.getOrDefault(ch, 0) +1);

        }
        return characterCountMap;


    }

    public void ShowMap(HashMap<Character, Integer> characterIntegerHashMap){
        for (Map.Entry<Character, Integer>entry: characterIntegerHashMap.entrySet()){
            System.out.println(entry.getKey() + " Aparece " + entry.getValue() + " veces ");

        }

    }
}
