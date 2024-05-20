/*2. Escriba un programa que genere una lista de números aleatorios, la ordene y
luego elimine los duplicados. Utilice un HashSet para almacenar los números
únicos y un ArrayList para la lista original.*/

import java.util.HashSet;
import java.util.*;
import java.util.Random;

public class AleatoyryNumber {

    List<Integer> aleatoyryNumberList = new ArrayList<>();

    public void AleatoyryNumbers() {

        Random aleatorio = new Random();
        for (int i = 0; i < 10; i++) {
            aleatoyryNumberList.add(aleatorio.nextInt(10));
        }


    }

}
