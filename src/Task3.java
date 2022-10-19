import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Task3 {

	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader("C:\\Games\\Lab2(OS)\\Task3\\input.txt");
		Scanner scanner	= new Scanner(fileReader);
		FileWriter fileWriter = new FileWriter("C:\\Games\\Lab2(OS)\\Task3\\output.txt");

		String line;
		while(scanner.hasNextLine()){
			line = scanner.nextLine();
			fileWriter.write(line);
			fileWriter.write("\n");
		}
		fileReader.close();
		fileWriter.close();
	}
}
