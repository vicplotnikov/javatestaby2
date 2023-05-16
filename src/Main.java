public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double a = 98; // вес в килограммах
        double b = 1.87; // рост в метрах
        double d = service.calculate(a, b);
        int bmi = (int) d;
        System.out.println("Bmi-индекс:" + bmi);
    }
}
