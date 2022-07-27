import java.util.ArrayList;
import java.util.Scanner;

public class BotSentimientos {
	
	public static void main (String args[]) 
	{
		Scanner escaner = new Scanner(System.in);
		System.out.println("Bienvenido. Hoy es el 27/07/2022. Introduzca su nombre.");
		String nombre = escaner.next();
		System.out.println("Hola, " +nombre+". Cual es su estado de animo? Triste (1), alegre (2) o nervioso (3)? Introduzca 1, 2 o 3.");
		int estado = escaner.nextInt();
		
		ArrayList<String> chistes = new ArrayList<>();
		
		String chiste1 = "Un hombre se queda atrapado entre dos vallas. Vaya hombre, vaya";
		String chiste2 = "Como se dice espejo en ingles?: Miro";
		String chiste3 = "Como se dice diarrea en japones? Kagasawa.";
		
		chistes.add(chiste1);
		chistes.add(chiste2);
		chistes.add(chiste3);
		
		
		switch(estado) 
		{
		case 1:
			System.out.println("Te contare un chiste");
			var rand = (int) (Math.random()*chistes.size());
			System.out.println(chistes.get(rand));
			
			break;
		case 2:
			System.out.println("Enhorabuena");
			break;
		case 3:
			System.out.println("Todo va a ir bien.");
		}
		
	}
	
}
