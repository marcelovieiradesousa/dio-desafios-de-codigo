//  RESOLUÇÃO DRAGÃO BERRADOR WORLD
import java.io.IOException;
import java.util.Scanner;

public class DragaoBerradorWorld {

	public static void main(String[] args) throws IOException {

		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			int numGuests = leitor.nextInt();
			int minHeight = leitor.nextInt();
			int maxHeight = leitor.nextInt();
			int enteredGuests = 0;

			for (int i = 0; i < numGuests; i++) {
				int guestHeight = leitor.nextInt();
				if (guestHeight >= minHeight && guestHeight <= maxHeight) enteredGuests++;
			}
			System.out.println(enteredGuests);
		}	
	}
}
// RESOLUÇÃO DRAGÃO BERRADOR WORLD END 
