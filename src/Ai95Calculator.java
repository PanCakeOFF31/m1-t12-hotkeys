public class Ai95Calculator {
    double ai95Price = 46.35;
    double tax = 0.14;
    double fullprice = ai95Price * (1 + tax);

    public double calculate(double razmer) {
        return razmer * fullprice;
    }
}
