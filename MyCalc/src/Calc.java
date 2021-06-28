import java.util.Scanner;

public class Calc {

       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           System.out.println("Введите число х:");
           double x = 0;
           double y = 0;
           String d = scanner.next();
           try{
               x = Double.valueOf(d);

           }catch(Exception e){
               System.out.println("not number");
               return;
           }

         System.out.println("Введите число y:");
           d = scanner.next();
           try{
               y = Double.valueOf(d);

           }catch(Exception e){
               System.out.println("not number");
               return;
           }
           System.out.println("Введите оператор для вычисления");
           String c = scanner.next();

           System.out.println(calculate(x,y,c));
    }

    public static double calculate(double a, double b, String c){

           System.out.print("Результат выполнения программы = ");
           double res = 0;


           switch(c) {
               case "+":
                   res = a+b;
               break;
               case "-":
                   res = a-b;
                   break;
               case "*":
                   res = a*b;
                   break;
               case "/":
                       if(b==0) {
                           System.out.println("На ноль делить нельзя!");
                           res = 0;
                       }
                       else{
                           res = a / b;
                       }
                   break;

               default:
                 System.out.println("Unknown operation");
           }
        return res;
    }

}

