import java.util.*;
public class maquinitas{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    tarjetas tarjeta1 = new tarjetas();
    tarjeta1.setCreditos(200);
    tarjeta1.setTickets(0);
    tarjeta1.setNumero(12345);
    tarjetas tarjeta2 = new tarjetas();
    tarjeta2.setCreditos(10);
    tarjeta2.setTickets(0);
    tarjeta2.setNumero(45678);
    System.out.print("Tarjeta "+tarjeta1.getNumerotarjeta());
    System.out.print(" tiene "+tarjeta1.getCreditos()+" creditos y ");
    System.out.println(tarjeta1.getTickets()+" tickets.");
    System.out.print("Tarjeta "+tarjeta2.getNumerotarjeta());
    System.out.print(" tiene "+tarjeta2.getCreditos()+" creditos y ");
    System.out.println(tarjeta2.getTickets()+" tickets.");
    juegos nuevojuego = new juegos(tarjeta1.getNumerotarjeta(), tarjeta1.getCreditos(), tarjeta1.getTickets());
    tarjeta1.setCreditos(nuevojuego.getCreditos());
    tarjeta1.setTickets(nuevojuego.getTickets());
    terminales terminal = new terminales();
    terminal.recarga(tarjeta1.getNumerotarjeta(), tarjeta1.getCreditos());
    tarjeta1.setCreditos(terminal.getCreditos());
    terminal.compra("Papeleria", tarjeta1.getNumerotarjeta(), tarjeta1.getTickets());
    tarjeta1.setTickets(terminal.getTickets());
    terminal.transferencia(tarjeta1.getNumerotarjeta(), tarjeta1.getCreditos(), tarjeta2.getNumerotarjeta(), tarjeta2.getCreditos());
    tarjeta2.setCreditos(terminal.getCreditos1());
  }
}
