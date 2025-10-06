//varible type  
/*
 * 1.instance variable =>inside class but outside method
 * 2.static variable =?>inside class but outside method with static keyword
 * 3.local variable =>inside method
 */
public class Session2 {
    int i = 100; // instance variable
    static int j = 200; // static variable

        public static void main(String[] args) {
        System.out.println("Variable");

        // int  i=10;
        // System.out.println(i);

        // i=20;
        // System.out.println(i);

        // i=30;
        // System.out.println(i);

        Session2 s2 =new Session2();
        System.out.println("InStance varible"+s2.i);

        System.out.println("Static varible "+ j);
        


        

    }
}
