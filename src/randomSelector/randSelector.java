package randomSelector;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class randSelector {

	public static void main(String[] args) {

		List<String> suggestion = new ArrayList<String>();
		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("=====what to watch next=====");
		
		
		System.out.print("\nEnter amount of suggestions: ");
		int numberOfSuggestions = sc.nextInt();

			
		sc.nextLine();
		
		for (int x = 1; x <= numberOfSuggestions; x++) {
			System.out.print("Enter name of anime (" + x + "): ");
			String anime = sc.nextLine();
			suggestion.add(anime);
		}

		System.out.println("\nYour options:");
		for (int i = 0; i < suggestion.size(); i++) {
			System.out.println((i + 1) + ". " + suggestion.get(i));
		}

		System.out.print("\nHow many spins? ");
		int spins = sc.nextInt();

		
		String pick = "";
		for (int i = 1; i <= spins; i++) {
			pick = suggestion.get(random.nextInt(suggestion.size()));
			System.out.println("Spin " + i + " landed on: " + pick);
		}

		System.out.println("\nYou should watch: " + pick);

		sc.close();
	}
}