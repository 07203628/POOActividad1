import java.util.ArrayList;
import java.util.Scanner;

public class Actividad_1 {
    public static void main(String[] args) {
        try (Scanner lector = new Scanner(System.in)) {
            ArrayList<Caballo> establo = new ArrayList<>();
            
            Caballo f1 = new Caballo("Lázaro", "Español", 10);
            establo.add(f1);
            
            System.out.println("Búsqueda de caballos");
            System.out.println("\n1. Nombre");
            System.out.println("\n2. Raza");
            System.out.println("\n3. Edad");
            System.out.println("Ingrese la opción que desee: ");
            
            int opcion = lector.nextInt();
            lector.nextLine();

            System.out.println("Ingrese el nombre, edad o raza: ");
            String busqueda = lector.nextLine();
            
            boolean encontrado = false;
            
            for (Caballo c : establo) {
                boolean coincidencia = false;
                if(opcion == 1 && c.getNombre().equalsIgnoreCase(busqueda)) coincidencia = true;
                else if(opcion == 2 && c.getRaza().equalsIgnoreCase(busqueda)) coincidencia = true;
                else if(opcion == 3 && String.valueOf(c.getEdad()).equals(busqueda)) coincidencia = true;
                
                if (coincidencia) {
                    c.mostrarDatos();
                    encontrado = true;
                } 
            }
            
            if (!encontrado) {
                System.out.println("No se encontro ningún caballo.");
            }
        }

    }
}