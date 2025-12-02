package PROVA;

import java.util.ArrayList;

public class EX_3 {
    public static void main(String[] args) {
        int[] array;  // 'array' de 10 posicions amb valors aleatoris entre 0 i 9
        ArrayList<Integer> resultat;  // 'arraylist' resultant
        
        array = UtilExamen.generaArray(10, 0, 9);// Genera un array de 10 posicions amb números aleatoris entre 0 i 9
        
        resultat = UtilExamen.ordenaArray(array);// Calcula l''ArrayList' emprant el mètode 'ordenaArray' 
        
        UtilExamen.mostrarArrayListInt(resultat);// Mostra l''ArrayList' resultant
    }
}

