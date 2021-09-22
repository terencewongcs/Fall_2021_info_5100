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

        if(bValue == true){

        }
    }//end of main function
}//end of the class
