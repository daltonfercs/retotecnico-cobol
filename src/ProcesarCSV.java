import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class ProcesarCSV {
    public void CVS(String archivo) {
        String filePath = archivo; // Ruta del archivo CSV
        double totalCredito = 0;
        int Credito = 0;
        double totalDebito = 0;
        int Debito = 0;
        String maxTransaccionId = "";
        double maxMonto = Double.MIN_VALUE;
        final String ANSI_WHITE = "\u001B[37m";
        final String ANSI_CYAN = "\u001B[36m";

        try (BufferedReader br = Files.newBufferedReader(Paths.get(filePath))) {
            String line;
            br.readLine(); // Saltar la primera línea (encabezado)

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    String tipo = data[1].trim();
                    double monto = Double.parseDouble(data[2].trim());
                    String id = data[0].trim();

                    if (tipo.equalsIgnoreCase("Crédito")) {
                        totalCredito += monto;
                        Credito++;
                    }
                    if (tipo.equalsIgnoreCase("Débito")) {
                        totalDebito += monto;
                        Debito++;
                    }
                    if (monto > maxMonto) {
                        maxMonto = monto;
                        maxTransaccionId = id;
                    }
                }
            }

            System.out.println(ANSI_WHITE+"Reporte de Transacciones");
            System.out.println(ANSI_CYAN+"---------------------------------------------");
            System.out.println(ANSI_CYAN+"Balance Final: " + (totalCredito - totalDebito));
            System.out.println(ANSI_CYAN+"Transacción con el monto más alto: ID "
                    + maxTransaccionId + " - " + maxMonto);
            System.out.printf(ANSI_CYAN+"Conteo de Transacciones: Crédito: %d Débito: %d \n", Credito, Debito);

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error en el formato de los datos: " + e.getMessage());
        }
    }
}
