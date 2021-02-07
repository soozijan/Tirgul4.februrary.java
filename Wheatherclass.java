ackage com.company;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString


public class Weather {
  public int temperature = 31;
   public int lahut = 45;
   public Boolean cloudly = false;
   public int rainy = 10;

    public Weather(int temperature, int lahut, Boolean cloudly, int rainy) {
        this.temperature = temperature;
        this.lahut = lahut;
        this.cloudly = cloudly;
        this.rainy = rainy;
    }

    public void changeChanceOfRain(int rainy)   {
        this.rainy = rainy;
}
public void printTempFahrenheit()   {
    System.out.println (temperature*1.8+32);
}
}
