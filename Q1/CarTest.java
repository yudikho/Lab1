
import java.util.Scanner;
public class CarTest{
    public static void main(String[] arg){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter car's model > ");
        String model1 = sc.nextLine();
        System.out.print("Enter car's maximum speed > ");
        int speed1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter car's model > ");
        String model2 = sc.nextLine();
        System.out.print("Enter car's maximum speed > ");
        int speed2 = sc.nextInt();

        Car a= new Car(model1,speed1);
        Car b= new Car(model2,speed2);

        if (a.isFasterThan(b)){
            System.out.println("The "+model1+" is faster.");
        }else{
            System.out.println("The "+model2+" is faster.");
        }
        
    }
}
//IGNORE THIS
// to compile: javac -classpath ../Q1 CarTest.java 
// to run: java -classpath ".;../Q1" CarTest
//isit possible to import the packages outside the root file