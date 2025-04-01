import java.util.Scanner;

public class Menu {
    public void opcionMenu(){
        System.out.println("Hello, menu!");
        Scanner teclado = new Scanner(System.in);
        boolean programaActivo = true;
        System.out.println("Hola Cual es tu Nombre?");
        String nombreUsuario = teclado.nextLine();
        System.out.printf("Bienvenido %s, Haremos el Reporte de Transacciones\n",
                nombreUsuario);

       /* while(programaActivo) {
            System.out.printf("%s, Ingrese entre , adivinalo\n"
                    , nombreUsuario);
            int numeroJugador;

            do {
                System.out.println("Escoge un numero");
                numeroJugador = teclado.nextInt();
               if (numeroJuego<numeroJugador) {
                    System.out.println("Muy Alto, adivina otra vez");

                } else if(numeroJuego>numeroJugador) {
                    System.out.println("Muy Bajo, adivina otra vez");
                }
                intentos ++;
            }while(numeroJuego != numeroJugador);
            System.out.printf("Has ganado, intentos %d\n",intentos);*/

                programaActivo = false;

        }
    }



