public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 98; // вес в килограммах
        double height = 1.87; // рост в метрах
        double index = service.calculate(weight, height);
        int bmi = (int) index;
        System.out.println("Bmi-индекс:" + bmi);
    }
}
