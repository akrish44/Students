import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.awt.*;

public class Students {
		public static void main(String[] args) throws IOException {
			Random random = new Random();
			// int i = random.nextInt(names.length);

			File file = new File("class.csv");
			Scanner scan = new Scanner(file);
			String[] names = scan.nextLine().split(",");

			for (int i = 0; i<names.length; i++) {
				System.out.println(names[i]);
			}

			System.out.println("How many groups do you want?");

			int groups = reader.nextInt();

				if(number.length % group ==0) {

					int people = number.length / group;

					for (int j=0; j<groups; j++) {
						
						for (int i=0; i<people; i++) {
						
							

					}
				}
			}

	}
