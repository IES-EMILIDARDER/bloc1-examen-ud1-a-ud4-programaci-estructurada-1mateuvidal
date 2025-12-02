package PROVA;

import java.util.ArrayList;

public class EX_2 {

    public static void main(String[] args) {
        int[] array1;  // 'array' de 5 posicions amb valors aleatoris entre 0 i 9
        int[] array2;  // 'array' de 5 posicions amb valors aleatoris entre 0 i 9
        ArrayList<Integer> resultat;  // 'arraylist' resultant

        array1 = UtilExamen.generaArray(10, 0, 9);// Crea 2 'Array' de 10 posicions amb números aleatoris entre 0 i 9
        array2 = UtilExamen.generaArray(10, 0, 9);
        resultat = UtilExamen.obteRepetits(array1,array2);// Calcula l''ArrayList' emprant el mètode 'obteRepetits' 
        
        UtilExamen.mostraArray(array1);// Mostra els 2 'Array' i l''ArrayList' resultant
        UtilExamen.mostraArray(array2);
        UtilExamen.mostrarArrayListInt(resultat);
    }
}
