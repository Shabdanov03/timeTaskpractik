import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Time time = new Time(23,59,59);
        System.out.println(time);
        while (true){
            System.out.println(" 1.Next Second. 2.Previous second");
            int num=new Scanner(System.in).nextInt();
            if (num==1){
                time.nextSecond();
                System.out.println(time);
            } else if (num==2) {
                time.previoussecond();
                System.out.println(time);
            }
            else {
                System.out.println(" Invalid comand !!!");
            }
        }

    }
}