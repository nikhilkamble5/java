//public class Session1 {
//    int data=100;
//
//    void show(){
//        System.out.println("Show all!");
//    }
//
//    public static void main(String[] args) {
//        Session1 s1= new Session1();
//        System.out.println("data is "+ s1.data);
//        s1.show();
//    }
//}

// Static Data Member  & Static funtiona
//call -No need to create object (object create karaychi garaj nahi)
//classname.SDM ClassName.SF() (static data ,member statid data funtion)
//tyach call madhi sattic dat ahe mhnun object create karaychi garaj nahi


//public class Session1 {
//   static int data=100;
//
//  static void show(){
//        System.out.println("Show all!");
//    }
//
//    public static void main(String[] args) {
//        System.out.println("data is "+ data);
//     show();
//
//        System.out.println("Data is : "+ Session1.data);
//        Session1.show();//best way
//  }
//}



// create object of another class ,dusrya class cah object creat karach same class madhi tyacha dataaccep karaych

//public class Session1 {
//    static int data=100;
//
//    static void show(){
//        System.out.println("Show all!");
//    }
//
//    public static void main(String[] args) {
//        System.out.println("data is "+ data);
//        show();
//
//        System.out.println("Data is : "+ Session1.data);
//        Session1.show();//best way
//
////        PQR p1= new PQR();
////        p1.call();
//
//        PQR.call();
//    }
//
//}
//
//
//class PQR
//{
//    static void call(){
//        System.out.println("pqr calling method");
//        System.out.println("Data is : "+Session1.data);
//        Session1.show();
//    }
//}


//public  class Session1  {
//    public static void main(String[] args) {
//
//        System.out.println("hello");
//
//    }
//}

//public - keyword  -Access To all any  where Acess
//class -keyword - class declared !!
//session1 -class name
//static -keyword  -static funtion
//java know -call main jvm if static funtion no need tocreate object

//memory save!
//vodi  -does not return  any value!!
//main  startup
//system.out.println =>("print statement)

//String[]args -command line argument


//
//public  class Session1  {
//    public static void main(String[] args) {
//
//    int arr[]={10,20,30,40,50};
//        System.out.println("Array lenth is :"+arr.length);
//
//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//
//        }
//
//        //For each loop
//        //array chya value patkan print karto
//
//        System.out.println("for each loop");
//        for(int value : arr){
//            System.out.println(value);
//        }
//    }
//}


//
//public  class Session1  {
//    public static void main(String[] args) {
//
//        float arr[]={10.1f,20.2f,30.1f,40.2f,50.3f};
//        System.out.println("Array lenth is :"+arr.length);
//
//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//
//        }
//
//        //For each loop
//        //array chya value patkan print karto
//
//        System.out.println("for each loop");
//        for(float value : arr){
//            System.out.println(value);
//        }
//    }
//}
//


/*

public  class Session1  {
    public static void main(String[] args) {

        String  arr[]={"dhoni","kphli","sachin","abd","sharma"};
        System.out.println("Array lenth is :"+arr.length);

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);

        }

        //For each loop
        //array chya value patkan print karto

        System.out.println("for each loop");
        for(String value : arr){
            System.out.println(value);
        }
    }
}
*/


/*
public class Session1 {
    public static void main(String[] args) {
        String s1="10";
        String s2="20";

        int number1= Integer.parseInt(s1);
        int number2= Integer.parseInt(s2);

        System.out.println(number1 + " + " +number2+" = "+ (number1+number2));
    }

}
*/




// string to float
    /*
public class Session1 {
    public static void main(String[] args) {
        String s1="10.25";
        String s2="20.40";

        float number1= Float.parseFloat(s1);
        float number2= Float.parseFloat(s2);

        System.out.println(number1 + " + " +number2+" = "+ (number1+number2));
    }

}
*/


//doubel

//public class Session1 {
//    public static void main(String[] args) {
//        String s1="10.25";
//        String s2="20.40";
//
//        double number2= Double.parseDouble(s2);
//        double number1= Double.parseDouble(s1);
//
//        System.out.println(number1 + " + " +number2+" = "+ (number1+number2));
//    }
//
//}

//command line argument


//public class Session1  {
//
//    public static void main(String[] vowtech) {
//        System.out.println("First Name : " +vowtech[0]);
//        System.out.println("Last name "+ vowtech[1]);
//    }
//}
