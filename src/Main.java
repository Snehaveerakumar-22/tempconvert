import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        double c,f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose type of convertion \n 1.Fahrenheit to Celsius \n 2.Celsius to Fahrenheit");
        int ch=sc.nextInt();
        switch (ch)
        {
            case 1:
                System.out.println("Enter Fahrenheit temperature");
                f=sc.nextDouble();
                c=((f-32)*5)/9;
                System.out.println("Celsius temperature is="+c);
                break;
            case 2:
                System.out.println("Enter Celsius temperature");
                c=sc.nextDouble();
                f=((9*c)/5)+32;
                System.out.println("Fahrenheit temperature is="+c);
                break;
            default:System.out.println("Choose valid choice!!!");
        }

    }
}