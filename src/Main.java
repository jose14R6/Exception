//ArrayList<ArrayList<String>> array = new ArrayList<ArrayList<String>>();
import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String file = "/home/jose/Desktop/JAVA Coding/Exception/src/namelist.txt";
        //Scanner input = new Scanner(System.in);

        //BufferedReader br = new BufferedReader(new FileReader(file));

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

        System.out.println(myArray[4][0]);

        /*ArrayList<ArrayList<String>> multiArray = new ArrayList<ArrayList<String>>();
        //ArrayList<String> multiArray = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(file));

        String line = br.readLine();

        while (line != null) {
            //multiArray.add(new ArrayList<String>());
            multiArray.add(line);
            line = br.readLine();
            //System.out.println(multiArray);
        }

        String[] strArray = new String[5];
        strArray = multiArray.toArray(strArray);

        System.out.println(strArray[0]);*/

        br.close();



    }
}