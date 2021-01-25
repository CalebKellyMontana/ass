import java.io.*;
class insert{
	public static void main(String[] args)throws IOException {
		BufferedReader connec = new BufferedReader(new InputStreamReader(System.in));
		int num1,num2;
		String n1,n2;
		System.out.println("enter first number: ");
		n1=connec.readLine();
		num1=Integer.parseInt(n1);
		System.out.println("enter second number: ");
		n2=connec.readLine();
		num2=Integer.parseInt(n1);

		if (num1<=num2) {
			System.out.println(num1);
		}
		else {
			for (int a=1;a<=12;a++) {
				System.out.println(num1+"*"+a+"="+num1*a);
			}
			//System.out.println("try again");
		}

	}
}