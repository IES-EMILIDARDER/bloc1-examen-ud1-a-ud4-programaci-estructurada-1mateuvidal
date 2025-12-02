package PROVA;

import java.util.ArrayList;

public class EX_4 {

    public static void main(String[] args) {
        int[] array1;  // 'array' de 5 posicions amb valors aleatoris entre 0 i 9
        int[] array2;
        ArrayList<Integer> resultat;  // 'arraylist' resultant

        array1 = UtilExamen.generaArray(10, 0, 9);// Genera un array de 10 posicions amb números aleatoris entre 0 i 9
        array2 = UtilExamen.generaArray(10, 0, 9);
        resultat = UtilExamen.obteRepetitsOrdenats(array1, array2);// Calcula l''ArrayList' emprant el mètode 'obteRepetitsOrdenat'
        //   NOTA: el mètode 'obteRepetitsOrdenat' pot servir-se dels mètodes anteriors:
        //         'obteRepetits' -> 'arrayListToArray' -> 'ordenaArray'
        UtilExamen.mostraArray(array1);
        UtilExamen.mostraArray(array2);
        UtilExamen.mostrarArrayListInt(resultat);// Mostra l''ArrayList' resultant
    }
}
