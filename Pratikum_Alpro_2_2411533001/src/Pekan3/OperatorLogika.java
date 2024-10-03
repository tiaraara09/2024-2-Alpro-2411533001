package Pekan3;

public class OperatorLogika {

	public static void main(String[] args) {
		boolean x= true;
		boolean y= false;
		boolean z;
		System.out.println("X = " +x);
		System.out.println("Y = " +y);
		System.out.println("Konjungsi" );
		z= x&&y;
		System.out.println("True and False = " +z);
		System.out.println("Disjungsi" );
		z= x||y;
		System.out.println("True or False = " +z);
		System.out.println("Negasi" );
		z= !x;
		System.out.println("Bukan True= " + z);

	}

}
