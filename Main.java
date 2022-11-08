import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double heigt = s.nextDouble();
        double weight = s.nextDouble();
        String result = String.format("%.2f",weight/(heigt*heigt));
        System.out.println("BMI:"+result);
    }
    
}

