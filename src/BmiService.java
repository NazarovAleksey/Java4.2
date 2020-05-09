public class BmiService {
    public int calculate (double weight, double height){
        height = height / 100;
        double bmi = weight / (height*height);

        return (int) bmi;
    }
}
