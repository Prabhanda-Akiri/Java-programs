import java.util.Scanner;

class lab3{
        public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the variables for the equations:\n ax+by=c\ndx+ey=f\n");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int d=input.nextInt();
        int e=input.nextInt();
        int f=input.nextInt();
        float x,y;
        y=(float)(c * d - a * f) / (b * d - a * e);
        x=(float)(c * e - b * f) / (a * e - b * d);

        System.out.println("the value of x is: " + x);
        System.out.println("the value of y is: " + y);
}}

