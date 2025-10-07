import java.util.Scanner;

public class Session7 {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter percentage");
//        int per=sc.nextInt();
//
//        if(per>=60)
//            System.out.println("FC");
//        else
//        {
//            if(per>=50)
//              System.out.println("sc");
//            else
//            {
//                if (per>=40)
//                    System.out.println("pc");
//                else
//                    System.out.println("fail");
//                System.out.println("R1");
//            }
//            System.out.println("r2");
//        }
//        System.out.println("r3");

    // logival +if else

        Scanner sc= new Scanner(System.in);
        System.out.println("Emter percentage");
        int per=sc.nextInt();

        if(per>=60)
            System.out.println("FC");
        else if(per>=50 && per<60)
            System.out.println("sc");
        else if (per>=40 && per<50)
            System.out.println("pc");
        else
            System.out.println("Fail");
        System.out.println("you got "+per);
    }
}
