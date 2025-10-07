public  class Session5 {
    public static void main(String[] args) {

//        byte b=127;
//        System.out.println(b);
//        System.out.println(Byte.BYTES);
//        System.out.println(Byte.SIZE);
//
////        2^7
////    -128 to 127
//
//        b=(byte)128;
//        System.out.println(b); //-128
//
//        b=(byte) -130;
//        System.out.println(b);



        //----short---------


//        short s=32767;
//        System.out.println(s);
//        System.out.println(Short.BYTES);
//        System.out.println(Short.SIZE);
//        2^15
//        -32768to 32767


        //---------------Pre increment-----
        // ++variable  --variable  pre increent , pre decrement
        // variable++  variable--   post increent , post decrement

        int i=10;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(i);

        System.out.println("post increment =>");
        int b=11;
        System.out.println(++b);//
        System.out.println(b);
        System.out.println(b);


         i=10;
        System.out.println(i--);
        System.out.println(i);
        System.out.println(i);

        System.out.println("post increment =>");
         b=11;
        System.out.println(--b);//
        System.out.println(b);
        System.out.println(b);



    }
}