
public class Main
{
	public static void main(String[] args) {
		int a1 = 15;
		int n = 19;
		int r = 8;
		int an = a1 + (n-1)*r; 
		System.out.println("Usando a formula de PA, o valor de an é " + an);
		a1= an -(n-1)*r; 
		System.out.println("Usando usando a formula PA, o valor de a1 é " + a1);
		r =(an-a1)/(n-1); 
		System.out.println("Usando a formula de PA, o valor de r é " + r);
		n = (an-a1)/r + 1; 
		System.out.println("Usando a formula de PA, o valor de n é " + n);
		
	}
}
