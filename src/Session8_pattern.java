public class Session8_pattern {
    public static void main(String[] args) {

        // pattern problem
        // 1
        // 11 12 13 14
        // 21 22 23 24
        // 31 32 33 34
        // 41 42 43 44

        // for (int i = 1; i <= 3; i++)// 1
        // {

        // for (int j = 1; j <= 4; j++)
        // System.out.print(i + "" + j + "\t");
        // System.out.println();

        // }

        // 2
        // *
        // ***
        // ****
        // *****
        // ******

        // for (int i = 1; i <= 5; i++) {

        // // =1
        // for (int j = 1; j <= i; j++)
        // System.out.print("*");

        // System.out.println();

        // }

        // 3
        // 1
        // 12
        // 123
        // 1234
        // 12345

        // trick -> Each Row Value Change J
        // Trick -> each ROw Valie Same Same I

        // 4
        // 1
        // 22
        // 333
        // 4444
        // 55555

        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <=i; j++)
        // System.out.print(i);
        // System.out.println();
        // }

        // 5
        // 12345
        // 1234
        // 123
        // 12
        // 1

        // for(int i=5;i>=1;i--)
        // {
        // for (int j=1;j<=i;j++)
        // System.out.print(j);
        // System.out.println();
        // }

        // 6
        // 12345
        // 2345
        // 345
        // 45
        // 5

        // for (int i=1;i<=5;i++)
        // {
        // for (int j=i;j<=5;j++)
        // System.out.print(j);
        // System.out.println();
        // }

        // 7
        // 54321
        // 4321
        // 321
        // 21
        // 1

        // for (int i=5;i>=1;i--)
        // {
        // for (int j=i;j>=1;j--)
        // System.out.print(j);
        // System.out.println();
        // }

        // 8
        // 54321
        // 5432
        // 543
        // 54
        // 5

        // for (int i=1;i<=5;i++)
        // {
        // for (int j=5;j>=i;j--)
        // System.out.print(j);
        // System.out.println();
        // }

        // 9
        // 5
        // 54
        // 543
        // 5432
        //

        // for (int i = 5; i >= 1; i--) {

        //     for (int j = i; j <= 5; j++)
        //         System.out.print(j);
        //     System.out.println();

        // }



        //10

        // 1
        // 21
        // 321
        // 4321
        // 54321

//        for(int i =1;i<=5;i++)
//        {
//            for (int j=i;j>=1;j--)
//                System.out.print(j);
//            System.out.println();
//        }


            // 11
            // 5
            // 54
            // 543
            // 5432
            // 54321


        // for (int i=5; i>=1; i--) {
        //     for (int j=5; j>=i; j--)
        //         System.out.print(j);
        //     System.out.println();
        // }


        //12

        //1
        //22
        //333
        //4444
        //55555

//        for (int i=1;i<=5;i++){
//            for (int j=1;j<=i;j++)
//                System.out.print(i);
//            System.out.println();
//        }

    
//2nd trick

//        for (int i=1;i<=5;i++){
//            for (int j=i;j>=1;j--)
//                System.out.print(i);
//
//            System.out.println();
//        }

        
//13
// 5
// 44
// 333
// 2222
// 11111


//for(int i=5;i>=1;i--){
//    for(int j=5;j>=i;j--)
//        System.out.print(i);
//
//    System.out.println();
//}

        // for(int i=5;i>=1;i--){
        //     for(int j=i;j<=5;j++)
        //         System.out.print(i);

        //     System.out.println();
        // }


        // 14

        // 55555
        // 4444
        // 333
        // 22
        // 1


//        for (int i=5;i>=1;i--)
//        {
//            for (int j=1;j<=i;j++)
//                System.out.print(i);
//
//            System.out.println();
//        }


//15

//11111
//2222
//333
//44
//5

//        for (int  i=1;i<=5;i++){
//
//            for (int j=i;j<=5;j++)
//                System.out.print(i);
//            System.out.println();
//        }

        //2nd way

        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--)
                System.out.print(i);

            System.out.println();
        }


    }
}
