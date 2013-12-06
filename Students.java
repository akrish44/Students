import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.awt.*;

public class Students {
        public static void main(String[] args) throws IOException {
                Random random = new Random();

                File file = new File("class.csv");
                Scanner scan = new Scanner(System.in);
                Scanner reader = new Scanner (file);
                String[] names = reader.nextLine().split(",");
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
        
        int randomStudent = random.nextInt(names.length);
        System.out.println("The random student is " + names[randomStudent]);

                System.out.println("How many groups do you want?");
                int groups = scan.nextInt();
                //int groups = 5;
                if (names.length % groups == 0) {
               
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
                        
                } else if (names.length % groups != 0) {
                   int numberOfPeople = names.length/groups;
                   int remainder = names.length % groups;   
                    for (int i=0; i<groups; i++) {
                        for (int j=0; j<numberOfPeople; j++) {
                            System.out.println(names[j]);
                        }
                    }

                }



         }
}
