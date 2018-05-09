import java.util.Random;
import java.awt.Color;

public final class Dadu {
  public static final int DEFAULT_SISI = 6;
  private static Random randGenerator = new Random();
  private final int jumSisi;
  private final Color[] warna;
  private int hasil;
  public Dadu(){
    this(DEFAULT_SISI);
  }
  public Dadu(int numSides){
    this.jumSisi = numSides;
    warna=new Color[jumSisi];
    int red,green,blue;
    for(int i=0;i<this.jumSisi;i++){
      red=randGenerator.nextInt(256);
      green=randGenerator.nextInt(256);
      blue=randGenerator.nextInt(256);
      warna[i]=new Color(red,green,blue);
    }
  }
  public int lempar(){
    hasil = randGenerator.nextInt(jumSisi) + 1;
    return hasil;
  }
  public int getJumSisi(){
    return jumSisi;
  }
  public int getHasil(){
    return hasil;
  }
  public Color getWarnaSisi(){
    return warna[hasil-1];
  }
  @Override
  public String toString(){
    return "Jumlah sisi dadu: " + getJumSisi() + ", hasil: " + getHasil() + ", warna (R, G, B): " + getWarnaSisi().getRed() + ", " + getWarnaSisi().getGreen() + ", " + getWarnaSisi().getBlue();
  }
}
