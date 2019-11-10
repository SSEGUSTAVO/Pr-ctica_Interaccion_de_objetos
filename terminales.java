import java.util.*;
public class terminales{
  private int numerotarjeta;
  private int creditos;
  private int tickets;
  private int numerotarjeta1;
  private int creditos1;
  private int existencia;
  public void recarga(int numerotarjeta, int creditos){
    Scanner input = new Scanner(System.in);
    this.creditos = creditos;
    this.numerotarjeta = numerotarjeta;
    System.out.println("La tarjeta " + this.numerotarjeta + " tiene " + this.creditos + " creditos.");
    System.out.println("¿Cuanto desea recargar? (1 peso = 2 creditos)");
    int valor = input.nextInt()*2;
    if (valor > 0){
      this.creditos = this.creditos + valor;
      System.out.println("Recarga exitosa.");
      System.out.println("Saldo actual: " + this.creditos);
    }
  }
  public void compra(String premio, int numerotarjeta, int tickets){
    premios recompensa = new premios();
    this.numerotarjeta = numerotarjeta;
    this.tickets = tickets;
    switch (premio) {
      case "Peluche":
        existencia = recompensa.getPeluche();
        if (existencia > 0){
          if (this.tickets >= 400){
            this.tickets = this.tickets - 400;
            recompensa.setPeluche();
            System.out.println("Felicidades tienes un Peluche.");
          }
          else{
            System.out.println("Tickets insuficientes.");
          }
        }
        else{
          System.out.println("No hay en existencia.");
        }
      break;
      case "Carrito":
        existencia = recompensa.getCarrito();
        if (existencia > 0){
          if (this.tickets >= 250){
            this.tickets = this.tickets - 250;
            recompensa.setCarrito();
            System.out.println("Felicidades tienes un Carrito.");
          }
          else{
            System.out.println("Tickets insuficientes.");
          }
        }
        else{
          System.out.println("No hay en existencia.");
        }
      break;
      case "Botella":
        existencia = recompensa.getBotella();
        if (existencia > 0){
          if (this.tickets >= 120){
            this.tickets = this.tickets - 120;
            recompensa.setBotella();
            System.out.println("Felicidades tienes una Botella artesanica.");
          }
          else{
            System.out.println("Tickets insuficientes.");
          }
        }
        else{
          System.out.println("No hay en existencia.");
        }
      break;
      case "Papeleria":
        existencia = recompensa.getPapeleria();
          if (existencia > 0){
            if (this.tickets >= 25){
              this.tickets = this.tickets - 25;
              recompensa.setPapeleria();
              System.out.println("Felicidades tienes un articulo de Papeleria.");
            }
            else{
              System.out.println("Tickets insuficientes.");
            }
          }
          else{
            System.out.println("No hay en existencia.");
          }
      break;
    }
  }
  public void transferencia(int numerotarjeta, int creditos, int numerotarjeta1, int creditos1){
    Scanner input = new Scanner(System.in);
    this.numerotarjeta = numerotarjeta;
    this.numerotarjeta1 = numerotarjeta1;
    this.creditos = creditos;
    this.creditos1 = creditos1;
    System.out.println("Tarjeta " + this.numerotarjeta + " tiene " + this.creditos + " creditos.");
    System.out.println("¿Cuanto desea transferir?");
    int transfiere = input.nextInt();
    if (this.creditos >= transfiere){
      this.creditos = this.creditos - transfiere;
      System.out.println("El credito disponible en la tarjeta " + this.numerotarjeta + " es: " + this.creditos);
      System.out.println("Pase su tarjeta para transferir los creditos.");
      this.creditos1 = this.creditos1 + transfiere;
      System.out.println("El credito disponible en la tarjeta " + this.numerotarjeta1 + " es: " + this.creditos1);
    }
    else{
      System.out.println("Creditos insuficientes.");
    }
  }
  public void consulta(int numerotarjeta, int creditos, int tickets){
    this.numerotarjeta = numerotarjeta;
    this.creditos = creditos;
    this.tickets = tickets;
    System.out.println("La tarjeta " + this.numerotarjeta + " tiene " + this.creditos + " creditos y " + this.tickets + " tickets.");
  }
  //GETTER
  public int getCreditos() {
      return this.creditos;
  }
  public int getTickets() {
      return this.tickets;
  }
  public int getCreditos1() {
      return this.creditos1;
  }
}
