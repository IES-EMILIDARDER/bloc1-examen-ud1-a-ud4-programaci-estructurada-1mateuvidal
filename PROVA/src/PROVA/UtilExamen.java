package PROVA;

import java.util.ArrayList;

public class UtilExamen {

    // Transforma array list a array.
    public static int[] arrayListToArray(ArrayList<Integer> arrayL) {
        int[] array = new int[arrayL.size()];

        for (int i = 0; i < arrayL.size(); i++) {
            array[i] = arrayL.get(i);
        }

        return array;
    }

    // Genera Array
    /**
     * Genera un array de sencers de la longitud demanada
     *
     * @param longitud La longitud de l'array
     * @param minim, el min valor
     * @param maxim, el max valor
     * @return L'array emplenat de forma aleatÃ²ria.
     */
    public static int[] generaArray(int longitud, int minim, int maxim) {
        int[] array = new int[longitud];

        for (int i = 0; i < array.length; i++) {
            array[i] = minim + (int) (Math.random() * (maxim - minim + 1));
        }
        return array;
    }

    // Genera Matriz
    /**
     * Assigna a cada posicio de
     *
     * @param longitud
     * @param minim
     * @param maxim
     * @return matriu
     */
    public static int[][] generaMatriu(int longitud, int minim, int maxim) {
        int[][] matriu = new int[longitud][longitud];

        for (int i = 0; i < matriu.length; i++) {
            matriu[i] = UtilExamen.generaArray(longitud, minim, maxim);
        }
        return matriu;
    }

    //Muestra ArrayList
    public static void mostrarArrayListInt(ArrayList<Integer> array) {
        System.out.print("[ ");
        for (Integer a : array) {
            System.out.print(a + " ");
        }
        System.out.println("]");
    }

    //Array a ArrayList
    /**
     * Transforma un int[] a un ArrayList<Integer>
     *
     * @param array --> int[]
     * @return ArrayList<Integer>
     */
    public static ArrayList<Integer> arrayToArrayListInt(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int a : array) {
            arrayList.add(a);
        }

        return arrayList;
    }

    //Obte Repetits
    public static ArrayList<Integer> obteRepetits(int[] array1, int[] array2) {
        ArrayList<Integer> resultat = new ArrayList<>();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    if (!resultat.contains(array1[i])) {  // CORRECCIÓ: usas 'contains()' cuando no es necesario
                        resultat.add(array1[i]);          //            además dije que no se podia usar ...
                    }
                }
            }
        }

        return resultat;
    }

    //Obte Repetits Ordenats
    public static ArrayList<Integer> obteRepetitsOrdenats(int[] array1, int[] array2) {
        ArrayList<Integer> resultat1 = new ArrayList<>();
        ArrayList<Integer> resultat2 = new ArrayList<>();

        for (int i = 0; i < array1.length; i++) {  // CORRECCIÓ: por qué no reusas el método anterior ... ?
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    if (!resultat1.contains(array1[i])) {   // CORRECCIÓ
                        resultat1.add(array1[i]);
                    }
                }
            }
        }

        int[] arrayOrdenado = UtilExamen.arrayListToArray(resultat1);
        resultat2 = UtilExamen.ordenaArray(arrayOrdenado);

        return resultat2;
    }

    //Mostra Array
    /**
     * Mostra l'array de sencers que rep com a parÃ metre per pantalla
     *
     * @param array L'array que contÃ© els valors que volem mostrar per
     * pantalla.
     */
    public static void mostraArray(int[] array) {
        String separador = "";
        System.out.print('[');

        for (int i = 0; i < array.length; i++) {
            System.out.print(separador + array[i]);
            separador = ", ";
        }
        System.out.println(']');

    }

    //Ordena Array
    public static ArrayList<Integer> ordenaArray(int[] array) {

        ArrayList<Integer> ordenado = new ArrayList<>();

        ordenado.add(array[0]);  // CORRECCIÓ: alerta, un array buit no es pot ordenar

        for (int i = 1; i < array.length; i++) {
            boolean insertar = false;
            for (int j = 0; j < ordenado.size(); j++) {

                if (array[i] > ordenado.get(j)) {

                    ordenado.add(j, array[i]);
                    insertar = true;
                    break;
                }
            }
            if (!insertar) {
                ordenado.add(array[i]);
            }
        }
        return ordenado;
    }
}
