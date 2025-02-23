import java.util.Scanner;
import java.io.*;
public class CompactDisc {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(new File("Classics.txt"));
		String title;
		String artist;
		// ADD LINES FOR TASK #3 HERE
		// Declare an array of Song objects, called cd,
		// with a size of 6
		Song[] cd = new Song[6];


		for (int i = 0; i < cd.length; i++) {
			title = input.nextLine();
			artist = input.nextLine();
			cd[i] = new Song(title, artist);
			// ADD LINES FOR TASK #3 HERE
			// Fill the array by creating a new song with
			// the title and artist and storing it in the
			// appropriate position in the array
		}

		input.close();

		System.out.println("Contents of Classics:");
		for (int i = 0; i < cd.length; i++) {
			for (Song song : cd) {
				System.out.print(song); // Print the contents of the array to the console

			}
		}
	}
}


