
public class Temperatura {
    double converterParaCelsius (double x)
    {
        double c = (x-32)/ 1.8;
        return c;  
    }
    double converterParaFahrenheit (double x)
    {
        double f = (x * 1.8) +32;
        return f;
    }
    
}   