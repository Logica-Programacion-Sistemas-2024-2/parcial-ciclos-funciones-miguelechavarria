
package parcial1g1;

public class App {

   public static void main(String[] args) {
  try {
    
  
        Scanner scanner = new Scanner(System.in);
        float totalCombustible = 0;

        System.out.print("¿Cuántos vehículos participaron? ");
        int numVehiculos = scanner.nextInt();

        for (int i = 0; i < numVehiculos; i++) {
                System.out.print("Introduce los metros recorridos por el vehículo " + (i + 1) + ": ");
                    float metros = scanner.nextFloat();

        while (metros <= 0) {
                System.out.println("La distancia debe ser un número positivo.");    

                System.out.print("Introduce los metros recorridos por el vehículo " + (i + 1) + ": ");
                    metros = scanner.nextFloat();
             }

                    float kilometros = convertirMetrosAKilometros(metros);
                    float combustible = calcularConsumoGasolina(kilometros);

            System.out.println("Vehículo " + (i + 1) + ":");
            System.out.println("  Kilómetros recorridos: " + String.format("%.2f", kilometros) + " km");
            System.out.println("  Combustible consumido: " + String.format("%.2f", combustible) + " litros");

            totalCombustible += combustible;
        }

            System.out.println("\nTotal de combustible consumido por todos los vehículos: " + String.format("%.2f", totalCombustible) + " litros");
                scanner.close();
        
    } 


    catch (Exception e) {
        System.out.println("error" + e.getMessage());
        }
    
    } 
    public static float convertirMetrosAKilometros(float metros) {
        return metros / 1000;
    }

    public static float calcularConsumoGasolina(float kmRecorrido) {
        return ((kmRecorrido * 55) / 750);
    
    }
    
}

