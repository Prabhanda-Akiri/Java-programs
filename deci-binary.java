import java.util.Scanner;

class lab2{
        public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.println("enter the decimal number\n");
        int n = input.nextInt();
        int a[];
        int i;
        i=0;
        a=new int[30];
        while(n>=2)
        {
                a[i]=n % 2;
                n = n / 2;
                i++;
        }
        a[i]=n;
        int k,l,sum=0;

        for(k=i;k>-1;k--)
        {
                l=k;
                while(l>0)
                {       a[k] = a[k]*10;
                        l--;
                }
                sum=sum + a[k];
        }

        System.out.println("the binary form of the number is " + sum);


                }
}
