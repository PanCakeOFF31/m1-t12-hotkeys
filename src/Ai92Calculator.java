public class Ai92Calculator {
    double ai92Price = 42.74;
    double tax = 0.13;
    double fullprice = ai92Price * (1 + tax);

    public double calculate(double razmer) {
        return razmer * fullprice;
    }
}
