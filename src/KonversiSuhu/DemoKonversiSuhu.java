package KonversiSuhu;

public class DemoKonversiSuhu {
    public static void main (String[] args){
        KonversiSuhu2 knvrs = new KonversiSuhu2();
        
        double celcius = 30;
        double fahrenheit = 68;
        
        System.out.println("Celcius to Fahrenheit: " +knvrs.celciusToFahrenheit(celcius));
        System.out.println("Celcius to Reamur: " +knvrs.celciusToReamur(celcius));
        System.out.println("Fahrenheit to Reamur: "+knvrs.fahrenheitToReamur(fahrenheit));
        
    }
}
