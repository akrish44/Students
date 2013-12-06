import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.awt.*;

public class Students {
        public static void main(String[] args) throws IOException {
                Random random = new Random();

                File file = new File("class.csv");
                Scanner scan = new Scanner (file);
                String[] names = scan.nextLine().split(",");
                //int[] used = new int[30];

        for (int i=names.length-1; i>0; i--) {
               // used[i] = i;
                String a = names[i];
                int b = random.nextInt(i);
                names[i] = names[b];
                names[b] = a;


        }
        // for (int j=0; j<names.length; j++) {
        //         System.out.println(names[j]);


        // }

                //System.out.println("How many groups do you want?");
                //int groups = reader.nextInt();
                int groups = 5;
                //if (names.length % groups == 0) {
                System.out.println(names.length);
                System.out.println(groups);
                        int people = names.length / groups;
                        String[][] groupedNames = new String[groups][people];
                        int counter = 0;
                        for (int j=0; j<groups; j++) {
                                for (int i=0; i<people; i++) {
                                     groupedNames[j][i] = names[counter];
                                     counter = counter + 1;
                                }
                        }
                        for (int i=0; i<people; i++) {
                           System.out.println(groupedNames[3][i]);     
                        }
                        
                        //System.out.println("Hello");
                // }



         }
}
