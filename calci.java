import java.util.Scanner;

class lab1{

        public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.println("enter numbers to perform the operation\n");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("choose the operation:\n1.Addition\n2.Subtraction\n3.multiplication\n4.Division\n");
        int k = input.nextInt();
        switch(k)
        {
                case 1:
                        int c;
                        c = a + b;
                        System.out.println("The answer is " + c);
                        break;
                case 2:
                        int d;
                        d = a - b;
                        System.out.println("The answer is " + d);
                        break;
                case 3:
                        int e;
                        e = a * b;
                        System.out.println("The answer is " + e);
                        break;
                case 4:
                        float f;
                        f = (float)a / b;
                        System.out.println("The answer is " + f);
                        break;
        }
}
}

