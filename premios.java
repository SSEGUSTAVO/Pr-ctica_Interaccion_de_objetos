public class premios{
  private int Peluche = 10;
  private int Carrito = 15;
  private int Botella = 30;
  private int Papeleria = 80;
  private String premio;
  public int getPeluche(){
    return Peluche;
  }
  public int getCarrito(){
    return Carrito;
  }
  public int getBotella(){
    return Botella;
  }
  public int getPapeleria(){
    return Papeleria;
  }
  public void setPeluche(){
    this.Peluche--;
  }
  public void setCarrito(){
    this.Carrito--;
  }
  public void setBotella(){
    this.Botella--;
  }
  public void setPapeleria(){
    this.Peluche--;
  }
}
