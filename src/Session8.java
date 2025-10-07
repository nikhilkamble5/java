import java.util.Scanner;

//Ms-m-ip
//Ms-u Gen-m Age>30=>ip
//ms-u Gen -f AGe>25=>ip
public class Session8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ms;
        while (true) {
            System.out.println("Enter marital Status");
            ms = sc.next().toUpperCase();

            if ((ms.equals("M") || ms.equals("U"))) {
                break;
            } else {
                System.out.println("Invalid amrtial status");
            }
        }
        System.out.println("Enter Gender [M/F]");
        String gen = sc.next().toUpperCase();

        System.out.println("Enter Age");
        int age = sc.nextInt();

        // if(ms.equals("M"))
        // System.out.println("IP");
        // else
        // {
        // if (gen.equals("M"))
        // {
        // if (age>30)
        // System.out.println("male -ip");
        // else
        // System.out.println("male in not provide");
        // System.out.println("R1");
        // }
        // else
        // {
        // if (age>25)
        // System.out.println("Female Ip");
        // else
        // System.out.println("Female inp");
        // System.out.println("r2");
        // }
        // System.out.println("R3");
        // }
        // System.out.println("r4");

        // 2nd metho
        // if (ms.equals("M"))
        // System.out.println("IP");
        // else if (gen.equals("M") && age>=30)
        // System.out.println("Male-IP");
        // else if(gen.equals("F") && age>=25)
        // System.out.println("Female_ip");
        // else
        // System.out.println("INP ");
        // System.out.println("r1");

        if ((ms.equals("M")) && age > 18 || (gen.equals("M")) && age >= 30 || (gen.equals("F")) && age >= 25)
            System.out.println("Ip");
        else
            System.out.println("INp");
    }
}
