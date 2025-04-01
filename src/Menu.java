import java.util.Scanner;

public class Menu {
    public void opcionMenu(){
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_RED = "\u001B[31m";

        System.out.println(ANSI_GREEN+"BIENVENIDO");
        Scanner teclado = new Scanner(System.in);
        boolean programaActivo = true;
        System.out.println(ANSI_GREEN+"Hola Cual es tu Nombre?");
        String nombreUsuario = teclado.nextLine();
        System.out.printf(ANSI_BLUE+"Bienvenido %s, Haremos el Reporte de Transacciones\n",
                nombreUsuario);
        ProcesarCSV procesarCSV = new ProcesarCSV();

       while(programaActivo) {

           String nombreArchivo;
           String seguirDeNuevo;
           do {
               System.out.println(ANSI_YELLOW+"Copie el archivo CSV a la carpeta del programa porfavor");
               System.out.printf(ANSI_GREEN+"%s, Ingrese el nombre del archivo sin la extencion CSV\n"
                       , nombreUsuario);

               nombreArchivo = teclado.nextLine();
               procesarCSV.CVS(nombreArchivo+".csv");

               System.out.println(ANSI_YELLOW+"Si Desea Seguie precione S " +
                       "Terminar proceso preciones cualquier LETRA");
               seguirDeNuevo = teclado.nextLine();

           } while (seguirDeNuevo.equalsIgnoreCase("s"));
           System.out.println(ANSI_RED+"Gracias Por utilizar");

           programaActivo = false;
        }
       }
    }



