//imports (4040-FBAS/BSCS/F18(A))
import javax.activation.FileDataSource;
import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class Filing {
    //main method throwing IO exception (4040-FBAS/BSCS/F18(A))
    public static void main(String args[]) throws IOException {
        //part 1 and 2 (getting content names in a directory)
        /*System.out.println("Enter file or directory name:");
        Scanner scanner = new Scanner(System.in);
        //Inputing path of file from the user (4040-FBAS/BSCS/F18(A))
        Path path = Paths.get(scanner.nextLine());
        if(Files.exists(path)){
            if(Files.isDirectory(path)){
                System.out.printf("%nDirectory Contents:%n");
                //Creating Object of directoryStream of type Path (4040-FBAS/BSCS/F18(A))
                DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
                for (Path p : directoryStream){     //foreach loop for iterating through all content in a file (4040-FBAS/BSCS/F18(A))
                    if(p.toString().matches(".*csv$"))    //Using regex (4040-FBAS/BSCS/F18(A))
                        System.out.println(p);
                }
            }
        }
        else {
            System.out.printf("%s does not exist%n", path);
        }*/
        //Reading data from csv (4040-FBAS/BSCS/F18(A))
        Scanner input = new Scanner(new File("F:\\RAJA G\\Documents\\BSCS Semester 5\\ACP" +
                "\\Java Projects\\Filing\\src\\ACP-BSCS-18-A (2020-12-17).csv"));
        //input.useDelimiter(",");
        System.out.println("NAME OF PRESENT STUDENTS\t\t\tNUMBER OF TIMES HE Joined THE CLASS");
        while (input.hasNext()){
            String line = input.nextLine();
            //Only Present Students are " ✔" marked in .csv (4040-FBAS/BSCS/F18(A))
            if(line.contains(" ✔")){
                //Converting each line into list of Strings (4040-FBAS/BSCS/F18(A))
                String[] str = line.split(",");
                //Splitting name from reg number (4040-FBAS/BSCS/F18(A))
                //I am not displaying reg numbers because only few student's reg number were mentioned in the file
                //Only displaying Student name and no. of times he joined the class
                String[] str2 = str[0].split(" ");
                System.out.printf("%-20s \t\t\t\t\t%s%n",str2[0] , str[7]);
            }
        }
        input.close();
    }
}
