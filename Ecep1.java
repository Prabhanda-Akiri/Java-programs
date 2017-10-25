public class A
{
	public static void main(String[] args)
	{

		System.out.println("Statement1:");

		int A[]=new int[5];

		try{

			System.out.println("Inside Try block");
			System.out.println(10/0);
			System.out.println(A[6]);
		}

		catch(ArithmeticException e)
		{
			System.out.println("Inside ArithmeticException catch block");

			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());

			System.out.println(10/5);

		}

		catch(IndexOutOfBoundsException e)
		{

			System.out.println("Inside IndexOutBoundException catch block");

			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());

			System.out.println(A[2]);


		}

		catch(Exception e)
		{
			System.out.println("Inside default Eception block");

			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());

			System.out.println("Exception handled");


		}

		finally
		{
			System.out.println("In the finally block");
		}

		System.out.println("Outside try catch finally series");
	}
}
