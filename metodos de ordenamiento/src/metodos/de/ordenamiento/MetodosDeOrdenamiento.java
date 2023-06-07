package metodos.de.ordenamiento;

import java.util.Random;
import java.util.Scanner;

public class MetodosDeOrdenamiento {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Defina el tamaño del arreglo: ");
        int tamaño = leer.nextInt();

        int arreglo[] = new int[tamaño];

        Random rand = new Random();

        for (int i = 0; i < tamaño; i++) {
            arreglo[i] = rand.nextInt(10);
        }
        for (int i = 0; i < tamaño; i++) {
            System.out.print(arreglo[i] + " ");
        }

        burbuja metodo1 = new burbuja();
        burbuja.burbuja(arreglo);
        
       Seleccion metodo2 = new Seleccion();
      Seleccion.seleccion(arreglo);
        
        Insercion metodo3= new Insercion();
        Insercion.insercion(arreglo);
        
        Shell metodo4= new Shell();
        Shell.shell(arreglo);
        
        QuickSort metodo5 = new QuickSort();
        QuickSort.quickSort(arreglo, 0, 1);

        
        
        System.out.println("   ");
        System.out.println("arreglo ordenado: ");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(arreglo[i] + " ");
        }

    }

}
