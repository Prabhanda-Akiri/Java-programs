public class B
{
	public static void main(String[] args)
	{

		System.out.println("Statement1\n");
		int A[]=new int[5];

		try{

			System.out.println("Inside try block");

			try
			{
				System.out.println("Inside nested try block");

				System.out.println(10/0);

			}

			catch(ArithmeticException e)
			{
				System.out.println("Inside nested catch block");

				System.out.println("Exception handled " + 10/2 );

			}

			System.out.println(A[6]);
		}

		catch(IndexOutOfBoundsException e)
		{

			System.out.println("Inside IndexOutBoundException catch block");

			System.out.println(A[2]);


		}

		catch(Exception e)
		{
			System.out.println("Inside default Eception block");

			System.out.println("Exception handled");


		}

		finally
		{
			System.out.println("In the finally block");
		}

		System.out.println("Outside try catch finally series");
	}
}
