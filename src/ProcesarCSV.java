import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class ProcesarCSV {
    public static void main(String[] args) {
        String filePath = "transacciones.csv"; // Ruta del archivo CSV
        double totalCredito = 0;
        double totalDebito = 0;

        try (BufferedReader br = Files.newBufferedReader(Paths.get(filePath))) {
            String line;
            br.readLine(); // Saltar la primera línea (encabezado)

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    String tipo = data[1].trim();
                    double monto = Double.parseDouble(data[2].trim());

                    if (tipo.equalsIgnoreCase("Crédito")) {
                        totalCredito += monto;
                    } else if (tipo.equalsIgnoreCase("Débito")) {
                        totalDebito += monto;
                    }
                }
            }

            System.out.println("Total Crédito: " + totalCredito);
            System.out.println("Total Débito: " + totalDebito);
            System.out.println("Balance Final: " + (totalCredito - totalDebito));

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error en el formato de los datos: " + e.getMessage());
        }
    }
}
