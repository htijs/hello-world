import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HelloHarry {
    public static void main(String... doMyBidding) throws IOException {
        FileWriter writeToFile = new FileWriter("C:\\Temp\\LetterToHarry.txt");
        File file = new File("C:\\Temp\\LetterToHarry.txt");
        Desktop fileTool = Desktop.getDesktop();

        String message1 = "Hello Harry,\n";
        String message2 = "I was able to open your GitHub project after copying your project to my Git-Desktop.\n";
        String message3 = "Then I was was able to open your code to my IntelliJ IDE, then created this HelloHarry.java file.\n";
        String message4 = "After that, I added the files accordingly to run your project in Java.\n";
        String message5 = "I am simply learning to use GitHub, and thought you might like to practice as well.\n";
        String message6 = "I challenge you to pull up this code to run it in whichever IDE you prefer then make changes to reply!\n";
        String message7 = "Sincerely your battle code companion,\n";
        String message8 = "Bryan Blaze\n";

        ArrayList<String> letter = new ArrayList<>();
        letter.add(message1);
        letter.add(message2);
        letter.add(message3);
        letter.add(message4);
        letter.add(message5);
        letter.add(message6);
        letter.add(message7);
        letter.add(message8);

        for (String info: letter) {
            writeToFile.write(info + System.lineSeparator());
        }
        writeToFile.close();

        fileTool.open(file);
    }
}
