// import java.util.Scanner;
//
// public class Session8proble
// {
// public static void main(String[] args) {
//
// Scanner sc= new Scanner(System.in);
//
// System.out.println("Enter Gender [M/F]");
// String gen=sc.next().toUpperCase();
//
// System.out.println("Enter year of Service");
// int yos=sc.nextInt();
//
// System.out.println("Enter qulification [P/G]");
// String qual =sc.next().toUpperCase();
//
// int salary =0 ;
//
// if(gen.equals("M") && yos>=10 && qual.equals("P"))
// salary=15000;
// else if(gen.equals("F") && yos>=10 && qual.equals("P"))
// salary=12000;
//
// else if ((gen.equals("M") && yos >= 10 && qual.equals("G")) ||
// (gen.equals("M") && yos < 10 && qual.equals("P")) ||
// (gen.equals("F") && yos < 10 && qual.equals("P"))) {
// salary = 12000;
//
//
// }
//
// System.out.println("sal "+salary);
// }
// }
//
//
// import java.util.Scanner;
//
// public class Session8proble
// {
// public static void main(String[] args) {
//
// Scanner sc= new Scanner(System.in);
// System.out.println("Enter Math mark ");
// int math=sc.nextInt();
//
// System.out.println("Enter biology mark ");
// int bio=sc.nextInt();
//
// System.out.println("Enter English mark ");
// int english=sc.nextInt();
//
// System.out.println("Enter Hindi mark ");
// int hindi=sc.nextInt();
//
// System.out.println("Enter Social study mark ");
// int social=sc.nextInt();
//
// float total_marks=500;
// float per =((math+bio+english+hindi+social)/total_marks)*100;
//
// System.out.println(per);
// if(math<30 || bio<30 || english<30 || hindi<30 || social<30)
// System.out.println("Fail");
// else if ((math>=90 && bio>=70 && per>80) && (bio>=90 && per>60))
// System.out.println("Jee,medical");
// else if (math>=90 && bio>=900 && per>80)
// System.out.println("Jee");
//
// else if(bio>=90 && per>60)
// System.out.println("medical");
// else System.out.println("fail");
// }
// }

//