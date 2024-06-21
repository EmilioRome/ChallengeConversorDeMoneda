import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        ConsultarValorCambio consulta = new ConsultarValorCambio();
        Conversor nuevaCotizacion = new Conversor(0);

        String monedaOrigen,
                monedaDestino;
        double monto;
        int option;

        Scanner readKeyboard = new Scanner(System.in);

        System.out.println("****************************************");
        System.out.println("***Bienvenid@ al Conversor de Monedas***");
        System.out.println("****************************************\n");

        while( true ) {
            option = 0;
            System.out.println("1) Dólar =>> Peso Argentino");
            System.out.println("2) Peso Argentino =>> Dólar");
            System.out.println("3) Dólar =>> Real Brasileño");
            System.out.println("4) Real Brasileño =>> Dólar");
            System.out.println("5) Dólar =>> Peso Colombiano");
            System.out.println("6) Peso Colombiano =>> Dólar");
            System.out.println("7) Dólar =>> Colon Costa Rica");
            System.out.println("8) Colon Costa Rica =>> Dólar");
            System.out.println("9) Salir");
            System.out.println("\n****************************************");

            System.out.print("Elija una opción: ");

            try{
                option = Integer.parseInt(readKeyboard.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Número no encontrado " + e.getMessage());
            }

            if (option == 9) {
                System.out.println("\n\n****************************************");
                System.out.println("**********SALIENDO DEL SISTEMA**********");
                System.out.println("************Muchas gracias!!***********\n\n");
                break;
            }

            switch (option) {
                case 1:
                    monedaOrigen = "USD";
                    monedaDestino = "ARS";
                    System.out.print("Ingrese el monto que desea cambiar: ");
                    try{
                        monto = Integer.parseInt(readKeyboard.nextLine());
                        nuevaCotizacion = consulta.buscarCotizacion(monedaOrigen, monedaDestino, monto);
                        System.out.println("\n\nConversion resultado: " + String.format("%.2f", nuevaCotizacion.conversion_result()) + "\n\n" );
                    } catch (NumberFormatException e) {
                        System.out.println("Debe ingresar un valor numerico " + e.getMessage());
                    }
                    break;
                case 2:
                    monedaOrigen = "ARS";
                    monedaDestino = "USD";
                    System.out.print("Ingrese el monto que desea cambiar: ");
                    try{
                        monto = Integer.parseInt(readKeyboard.nextLine());
                        nuevaCotizacion = consulta.buscarCotizacion(monedaOrigen, monedaDestino, monto);
                        System.out.println("\n\nConversion resultado: " + String.format("%.2f", nuevaCotizacion.conversion_result()) + "\n\n" );
                    } catch (NumberFormatException e) {
                        System.out.println("Debe ingresar un valor numerico " + e.getMessage());
                    }
                    break;
                case 3:
                    monedaOrigen = "USD";
                    monedaDestino = "BRL";
                    System.out.print("Ingrese el monto que desea cambiar: ");
                    try{
                        monto = Integer.parseInt(readKeyboard.nextLine());
                        nuevaCotizacion = consulta.buscarCotizacion(monedaOrigen, monedaDestino, monto);
                        System.out.println("\n\nConversion resultado: " + String.format("%.2f", nuevaCotizacion.conversion_result()) + "\n\n" );
                    } catch (NumberFormatException e) {
                        System.out.println("Debe ingresar un valor numerico " + e.getMessage());
                    }
                    break;
                case 4:
                    monedaOrigen = "BRL";
                    monedaDestino = "USD";
                    System.out.print("Ingrese el monto que desea cambiar: ");
                    try{
                        monto = Integer.parseInt(readKeyboard.nextLine());
                        nuevaCotizacion = consulta.buscarCotizacion(monedaOrigen, monedaDestino, monto);
                        System.out.println("\n\nConversion resultado: " + String.format("%.2f", nuevaCotizacion.conversion_result()) + "\n\n" );
                    } catch (NumberFormatException e) {
                        System.out.println("Debe ingresar un valor numerico " + e.getMessage());
                    }
                    break;
                case 5:
                    monedaOrigen = "USD";
                    monedaDestino = "COP";
                    System.out.print("Ingrese el monto que desea cambiar: ");
                    try{
                        monto = Integer.parseInt(readKeyboard.nextLine());
                        nuevaCotizacion = consulta.buscarCotizacion(monedaOrigen, monedaDestino, monto);
                        System.out.println("\n\nConversion resultado: " + String.format("%.2f", nuevaCotizacion.conversion_result()) + "\n\n" );
                    } catch (NumberFormatException e) {
                        System.out.println("Debe ingresar un valor numerico " + e.getMessage());
                    }
                    break;
                case 6:
                    monedaOrigen = "COP";
                    monedaDestino = "USD";
                    System.out.print("Ingrese el monto que desea cambiar: ");
                    try{
                        monto = Integer.parseInt(readKeyboard.nextLine());
                        nuevaCotizacion = consulta.buscarCotizacion(monedaOrigen, monedaDestino, monto);
                        System.out.println("\n\nConversion resultado: " + String.format("%.2f", nuevaCotizacion.conversion_result()) + "\n\n" );
                    } catch (NumberFormatException e) {
                        System.out.println("Debe ingresar un valor numerico " + e.getMessage());
                    }
                    break;
                case 7:
                    monedaOrigen = "USD";
                    monedaDestino = "CRC";
                    System.out.print("Ingrese el monto que desea cambiar: ");
                    try{
                        monto = Integer.parseInt(readKeyboard.nextLine());
                        nuevaCotizacion = consulta.buscarCotizacion(monedaOrigen, monedaDestino, monto);
                        System.out.println("\n\nConversion resultado: " + String.format("%.2f", nuevaCotizacion.conversion_result()) + "\n\n" );
                    } catch (NumberFormatException e) {
                        System.out.println("Debe ingresar un valor numerico " + e.getMessage());
                    }
                    break;
                case 8:
                    monedaOrigen = "CRC";
                    monedaDestino = "USD";
                    System.out.print("Ingrese el monto que desea cambiar: ");
                    try{
                        monto = Integer.parseInt(readKeyboard.nextLine());
                        nuevaCotizacion = consulta.buscarCotizacion(monedaOrigen, monedaDestino, monto);
                        System.out.println("\n\nConversion resultado: " + String.format("%.2f", nuevaCotizacion.conversion_result()) + "\n\n" );
                    } catch (NumberFormatException e) {
                        System.out.println("Debe ingresar un valor numerico " + e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Opción no valida." + "\n\n");
                    break;
            }
        }
    }
}
