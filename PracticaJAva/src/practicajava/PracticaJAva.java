
package practicajava;

        import java.util.Scanner;

public class PracticaJAva {

  
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Empleado empleado = new Empleado("Juan", "Pérez", "12345678", "Desarrollador");
        Cliente cliente = new Cliente("Ana", "Gómez", "87654321", "Empresa XYZ");

        
            System.out.println("Seleccione una opción:");
            System.out.println("1. Solicitar Permiso (Empleado)");
            System.out.println("2. Reportar Horas Extra (Empleado)");
            System.out.println("3. Contactar Representante (Cliente)");
            System.out.println("4. Solicitar Información (Cliente)");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.println(empleado.solicitudPermiso());
                    break;
                case 2:
                    System.out.println(empleado.reporteHorasExtra());
                    break;
                case 3:
                    System.out.println(cliente.contactarRepresentante());
                    break;
                case 4:
                    System.out.println(cliente.solicitarInformacion());
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

        
    
    

