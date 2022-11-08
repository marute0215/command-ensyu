import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("1人目の身長：");
        double heigt = s.nextDouble();
        System.out.print("2人目の身長：");
        double heigt2 = s.nextDouble();
        System.out.print("1人目の体重：");
        double weight = s.nextDouble();
        System.out.print("2人目の体重：");
        double weight2 = s.nextDouble();
        String result = String.format("%.2f",weight/(heigt*heigt));
        System.out.println("１人目のBMI:"+result);
        String result2 = String.format("%.2f",weight2/(heigt2*heigt2));
        System.out.println("2人目のBMI:"+result2);
    }
    
}

