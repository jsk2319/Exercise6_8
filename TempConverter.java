public class TempConverter {

    public static void main(String[] args) {

        System.out.printf("%-20s%-13s|   %-20s%-20s\n","Celsius","Fahrenheit","Fahrenheit","Celsius");
        System.out.println( String.format("%75s"," ").replace(' ', '-') );

        for (int c = 40, f = 120  ; c >=31; c--, f-=10) {

            System.out.printf("%-20.1f%-13.1f|    %-20.1f%-20.2f\n",(double)c,celsiusToFahrenheit(c),(double)f, fahrenheitToCelsius(f));

        }

    }

    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5.0) * celsius + 32.0;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9.0) * (fahrenheit - 32.0);
    }

}