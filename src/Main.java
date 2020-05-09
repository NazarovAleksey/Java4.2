public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int bmi = service.calculate(90.5,170);

        System.out.println("Ваш индекс массы тела - " + bmi);
    }
}
