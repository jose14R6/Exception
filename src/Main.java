/*
* Here is the list of names on the txt file:
*    Amy amyb2008
*    Maricela mcortez86
*    Jose jbenitez86
*    Erick erickb01
*    Ricky bestbroever1
*
*
*
* */
import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {

        String stuID;

        String textString = "namelist.txt";

        String file = "/home/jose/Desktop/JAVA Coding/Exception/src/namelist.txt";

        Scanner input = new Scanner(System.in);

        Scanner br = new Scanner(new BufferedReader(new FileReader(file)));

        String[][] myArray = new String[5][2];

        while(br.hasNextLine()) {
            for (int i=0; i<myArray.length; i++) {
                String[] line = br.nextLine().trim().split(" ");
                for (int j=0; j<line.length; j++) {
                    myArray[i][j] = line[j];
                }
            }
        }

        System.out.print("Please enter a \"1\" to select the namelist.txt file for the program: ");
        int textNum = input.nextInt();
        while (textNum != 1){
            System.out.print("Please make sure to enter a 1 for the selection: ");
            textNum = input.nextInt();
        }
        //System.out.println("the file name for this is: " + textString + ".");


        System.out.print("\nHow would you like to search for the student? Enter 1 by ID num or enter a 2 for " +
                "the name of the student: ");
        int searchNum = input.nextInt();
        while (searchNum != 1 && searchNum != 2){
            System.out.print("Please make sure to enter a 1 or a 2 for the selection: ");
            searchNum = input.nextInt();
        }


        if(searchNum == 1) {
            System.out.print("Enter the student ID number to see if they are on the list: ");
            stuID = input.next();
            //System.out.print("Student id entered was: " + stuID + ".");
        }else {
            System.out.print("Enter the name of the student to see if they are on the list: ");
            stuID = input.next();
        }



        //System.out.println(myArray[4][0]);

        br.close();



    }
}