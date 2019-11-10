import java.util.*;
public class juegos{
  private int numerotarjeta;
  private int creditos;
  private int tickets;
  private String nuevojuego;
  public juegos(int numerotarjeta, int creditos, int tickets){
    Random rand = new Random();
    Scanner input = new Scanner(System.in);
    this.numerotarjeta = numerotarjeta;
    this.creditos = creditos;
    this.tickets = tickets;
    while (this.creditos >= 5){
      this.creditos = this.creditos - 5;
      if (this.creditos <= 0){
        this.creditos = 0;
        System.out.println("Comienza juego. ¡Diviertase!");
        System.out.println("Game over.");
        int nuevostickets = rand.nextInt(25);
        this.tickets = this.tickets + nuevostickets;
        System.out.println("Tarjeta: " + this.numerotarjeta);
        System.out.println("Tickets actuales: " + this.tickets);
        System.out.println("Tickets ganados: " + nuevostickets);
        break;
      }
      else{
        System.out.println("Comienza juego. ¡Diviertase!");
        System.out.println("Game over.");
        int nuevostickets = rand.nextInt(25);
        this.tickets = this.tickets + nuevostickets;
        System.out.println("Tarjeta: " + this.numerotarjeta);
        System.out.println("Tickets actuales: " + this.tickets);
        System.out.println("Tickets ganados: " + nuevostickets);
      }
      System.out.println("¿Quiere volver a jugar?");
      this.nuevojuego = input.next();
      boolean si = this.nuevojuego.equals("si");
      if (si == true){
        continue;
      }
      else {
        break;
      }
    }
  }
  //GETTER
  public int getCreditos() {
      return this.creditos;
  }
  public int getTickets() {
      return this.tickets;
  }
  public int getNumerotarjeta() {
      return this.numerotarjeta;
  }
}
