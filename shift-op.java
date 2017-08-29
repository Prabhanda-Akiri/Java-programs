import java.util.Scanner;
class lab4{
        public static void main(String args[])
        {
                Scanner input=new Scanner(System.in);
                System.out.println("choose the operation to be performed\n1.Right shift unsigned\n2.Right shift\n3.Left shift\n");
                int k=input.nextInt();
                switch(k)
                {
                        case 1: System.out.println("enter number and shift size\n");
                                int a=input.nextInt();
                                int b=input.nextInt();
                                int c;
                                c = a >>> b;
                                System.out.println("the resultant shifted number is:" + c);
                                break;

                        case 2: System.out.println("enter number and shift size\n");
                                int d=input.nextInt();
                                int e=input.nextInt();
                                int f;
                                f = d >> e;
                                System.out.println("the resultant shifted number is:" + f);
                                break;

                        case 3: System.out.println("enter number and shift size\n");
                                int g=input.nextInt();
                                int h=input.nextInt();
                                int i;
                                i = g << h;
                                System.out.println("the resultant shifted number is:" + i);
                                break;
                }
}
}


