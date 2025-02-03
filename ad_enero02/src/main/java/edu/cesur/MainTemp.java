package edu.cesur;

import java.util.Arrays;
import java.util.Date;

public class MainTemp {
    public static void main(String[] args) {
        Cliente miCliente = new Cliente();

        miCliente.insertarVisita(null);
        miCliente.ordenarVisitas();
        /*
         * casos de prueba:
         * 1. array fuese null (solucionado por el constructor)
         * 2. array vacío.
         * 3. array con 1 elemento
         * 4. array con MAX_VISITAS -2
         * 5. array con MAX_VISITAS -1
         * 6. array lleno.
         */

        /*
         * 2. array vacío.
         * System.out.println("ANTES: " + Arrays.toString(miCliente.getVisitas()));
         * miCliente.ordenarVisitas();
         * System.out.println("DESPUES: " + Arrays.toString(miCliente.getVisitas()));
         * 
         * 3. array con 1 elemento
         * miCliente.insertarVisita(new Date("2025/01/03"));
         * 
         * System.out.println("ANTES: " + Arrays.toString(miCliente.getVisitas()));
         * miCliente.ordenarVisitas();
         * System.out.println("DESPUES: " + Arrays.toString(miCliente.getVisitas()));
         * 
         * 4. array con MAX_VISITAS -2
         * miCliente.insertarVisita(new Date("2025/01/05"));
         * miCliente.insertarVisita(new Date("2025/01/03"));
         * miCliente.insertarVisita(new Date("2025/01/04"));
         * 
         * System.out.println("ANTES: " + Arrays.toString(miCliente.getVisitas()));
         * miCliente.ordenarVisitas();
         * System.out.println("DESPUES: " + Arrays.toString(miCliente.getVisitas()));
         * 
         * 5. array con MAX_VISITAS -1
         * miCliente.insertarVisita(new Date("2025/01/05"));
         * miCliente.insertarVisita(new Date("2025/01/03"));
         * miCliente.insertarVisita(new Date("2025/01/04"));
         * miCliente.insertarVisita(new Date("2025/01/08"));
         * 
         * System.out.println("ANTES: " + Arrays.toString(miCliente.getVisitas()));
         * miCliente.ordenarVisitas();
         * System.out.println("DESPUES: " + Arrays.toString(miCliente.getVisitas()));
         * 
         * 6. array lleno.
         * miCliente.insertarVisita(new Date("2025/01/05"));
         * miCliente.insertarVisita(new Date("2025/01/03"));
         * miCliente.insertarVisita(new Date("2025/01/04"));
         * miCliente.insertarVisita(new Date("2025/01/08"));
         * miCliente.insertarVisita(new Date("2025/01/01"));
         * 
         * System.out.println("ANTES: " + Arrays.toString(miCliente.getVisitas()));
         * miCliente.ordenarVisitas();
         * System.out.println("DESPUES: " + Arrays.toString(miCliente.getVisitas()));
         */


    }
}
