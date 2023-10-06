
public class Main {

	public static void main(String[] args) {
		
		String tekija = "Vera";
		
		double luku1 =6;
		double luku2 =3;
		
		double tulo =0;
		
		System.out.println("Hei olen Tulostin-ohjelma");
		System.out.println("Ohjelman tekijä: " + tekija);
		
		
		//System.out.println(luku1);
		
		System.out.println("Luku1-muuttujan arvo on " + luku1 + ".");
		System.out.println("Luku2-muuttujan arvo on " + luku2 + ".");
		
		
		tulo = luku1 * luku2;
		System.out.println(luku1 + " * " + luku2 + " = " + tulo);
		
		tulo = luku1 - luku2;
		System.out.println(luku1 + " - " + luku2 + " = " + tulo); 
		
		tulo = luku1 + luku2;
		System.out.println(luku1 + " + " + luku2 + " = " + tulo); 
		
		tulo = luku1 / luku2;
		System.out.println(luku1 + " / " + luku2 + " = " + tulo); 
		
		
	}

}
