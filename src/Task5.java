import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Task5 {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Games\\Lab2(OS)\\Task5\\Old");
		File[] fileMas = file.listFiles();

		Path path = Paths.get("C:\\Games\\Lab2(OS)\\Task5\\New");
		for(int i = 0; i < 2; i++){
			Files.copy(fileMas[i].toPath(), path.resolve(fileMas[i].getName()));
		}
	}
}