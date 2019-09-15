
public class Temperatura {
   public double setConverterParaCelsius (double x)
    {
        double c = (x-32)/ 1.8;
        return c;  
    }
   public double setConverterParaFahrenheit (double x)
    {
        double f = (x * 1.8) +32;
        return f;
    }
    
}   