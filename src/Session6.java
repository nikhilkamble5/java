public class Session6 {
    public static void main(String[] args) {
//        int p=5 ,q=5 ,r=4;
//        r=r+q;//9
//        r=(r+p)+p//9+5+5=19
//        p=(p&12)&p;
//        //0101
//        //1100
//        //0101
//        //----------
//        //0100 p=4
//        System.out.println(p+q+r);//4+5+19=28



        //-2--------------------------

//        int p=8,q=4,r=5;
//        r=(q^4)^p;
//        //0100
//        //0100
//        //1000
//        //----
//        //1000 => r=8
//
//        r=(q+r)+q;// r=4+8+4 =16
//        p=(5+7)&r;
//        //01100
//        //10000
//        //-----
//        //00000 p=0;
//
//        System.out.println(p+q+r);//0+4+16=0



        //nested if else

//        int i=2;
//        if(i==1)
//            System.out.println("yes1");
//        else {
//            if(i==2)
//                System.out.println("Yes 2");
//            else
//                System.out.println("No 2");
//            System.out.println("r1");
//
//        }
//        System.out.println("r2");


        int i=2;
        if(i==1)
        {
            if (i==2)
                System.out.println("yes2");
            else
                System.out.println("no2");
            System.out.println("R1");


        }
        else
            System.out.println("yes1");
        System.out.println("r2");
    }
}
