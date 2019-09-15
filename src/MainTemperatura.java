public class MainTemperatura {
    public static void main (String[] args)
    {
        Temperatura celsius= new Temperatura ();
        Temperatura fahrenheit= new Temperatura();
        
        double val= 125.7;
        double result;
        result= celsius.setConverterParaCelsius(val);
        
        System.out.println("A temperatura em graus Celsius é:"+result);
        
        double val1= 10.7;
        double result1;
        result1= fahrenheit.setConverterParaFahrenheit(val);
        
        System.out.println("A temperatura em graus Fahrenheit é:"+result1);
    }
    
}