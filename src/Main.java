import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conversor conversor = new Conversor();


        // Sour con texto guia para usuario
        System.out.println("****************************************************"); //decracion inicio

        System.out.println("=== Conversor de Moneda ===");
        System.out.println("Seleccione una opción:");
        System.out.println("1. COP a USD (Peso Colombiano a Dollar Americano)"); //Peso colombiano a Dollar Americano
        System.out.println("2. MXN a USD (Peso Mexicano a Dollar Americano)"); // Peso Mexicano a Dollar Americano
        System.out.println("3. GBP a USD (Libra esternina a Dolar Americano)"); //Libra esternina a Dolar Americano
        System.out.println("4. USD a CAD (Dollar Americano a Dollar Canadience)"); //Dollar Americano a Dollar Canadience
        System.out.println("5. USD a EUR (Dollar Americano a Euro)"); //Dollar Americano a Euro
        System.out.println("6. EUR a JPY (Euro a Yen Japones)"); // Euro a Yen Japones
        System.out.println("7. Elegir moneda base y objetivo (seleccione segun sea el incicativo de moneda de origen u moneda de destino.)"); //seleccione segun sea el incicativo de moneda de origen.
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // limpiar el buffer

        String monedaBase;
        String monedaObjetivo;
    //Seleccion mediante un switch case
        // posteriormente ver opcion de vrear una clase seleccion para poder hacer llamado en caso de querer volver a seleccionar sin reiniciar el programa
        switch (opcion) {
            case 1:
                monedaBase = "COP";
                monedaObjetivo = "USD";
                break;
            case 2:
                monedaBase = "MXN";
                monedaObjetivo = "USD";
                break;
            case 3:
                monedaBase = "GBP";
                monedaObjetivo = "USD";
                break;
            case 4:
                monedaBase = "USD";
                monedaObjetivo = "CAD";
                break;
            case 5:
                monedaBase = "USD";
                monedaObjetivo = "EUR";
                break;
            case 6:
                monedaBase = "EUR";
                monedaObjetivo = "JPY";
                break;
            case 7:
                System.out.print("Ingresa la moneda base (ej. EUR): ");
                monedaBase = scanner.nextLine().trim().toUpperCase();
                System.out.print("Ingresa la moneda a convertir (ej. GBP): ");
                monedaObjetivo = scanner.nextLine().trim().toUpperCase();
                break;
            default:
                System.out.println("Opción inválida.");
                scanner.close();
                return;
        }
    // aca solicitamos el monto a convertir
        System.out.printf("Ingresa el monto en %s: ", monedaBase);
        double monto = scanner.nextDouble();

        try {
            double tasa = conversor.obtenerTasaCambio(monedaBase, monedaObjetivo);
            double convertido = monto * tasa;

            System.out.printf("Tasa actual: 1 %s = %.4f %s%n", monedaBase, tasa, monedaObjetivo);
            System.out.printf("Monto convertido: %.2f %s = %.2f %s%n", monto, monedaBase, convertido, monedaObjetivo);
        } catch (Exception e) {
            System.out.println("Ocurrió un error al obtener la tasa de cambio: " + e.getMessage());
        }

        scanner.close();
        System.out.println("****************************************************"); //decracion Final
    }
}
