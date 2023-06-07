package metodos.de.ordenamiento;

public class Insercion {

    public static void insercion(int[] arreglo) {
        int tamaño = arreglo.length;
        for (int i = 0; i < tamaño; i++) {
            int minina = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j] > minina) {
                arreglo[j + 1] = arreglo[j];
                j--;

            }
            arreglo[j + 1] = minina;
        }
    }
}
