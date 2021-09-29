package edu.northeastern.yanxuan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a=19;
        int b=5;
        int add=a+b;
        int sub=a-b;
        int multiple=a*b;
        int divide = a/b;
        int remainer=a%b;

        System.out.println("Add:"+add);
        System.out.println("sub:"+sub);
        System.out.println("multiple:"+multiple);
        System.out.println("divide:"+divide);
        System.out.println("remainer:"+remainer);

        //unit operator: += -+ *= /+ !
        a+=2;
        b-=2;
        boolean bValue = true;
        bValue = !bValue;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("bValue = "+bValue);

        a++;
        b--;
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        if(bValue) {
            System.out.println("Boolean value is true.");
        }

        if( b > 10 ) {
            System.out.println("b's value is greater than 10.");
        }else{
            System.out.println("b's value is less than 10.");
        }

        // result = (conditional statement)? value 1 : value 2

        //1: 0000 0001
        //-1: 1111 1111
        int result = b > 10 ? 10 :30;

        Integer x=Integer.MAX_VALUE;
        int y=15;
        int z=x^y;
        System.out.printf("%08x^%08x=%08x\n",x,y,z);
        System.out.println(z);


        String namename="name1";
        namename="name2";
        System.out.println(namename);
    }//end of main function
}//end of the class
