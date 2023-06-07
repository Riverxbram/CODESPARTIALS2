package metodos.de.ordenamiento;

public class Seleccion {

    public static void seleccion(int[] arreglo) {
        int tamaño = arreglo.length;
        for (int i = 0; i < tamaño; i++) {
            int min = i;

            for (int j = 0; j < tamaño - 1; j++) {
                if (arreglo[j] > arreglo[min]) {
                    min = j;

                }
            }
            int temp = arreglo[min];
            arreglo[min] = arreglo[i];
            arreglo[i] = temp;

        }

    }

}
