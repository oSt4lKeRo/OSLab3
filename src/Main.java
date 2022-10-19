import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.ProxySelector;
import java.util.concurrent.TimeUnit;

public class Main {

	public static boolean openApp(String[] line, int i) throws IOException, InterruptedException {
		ProcessBuilder builder = new ProcessBuilder(line[i+1]);
		Process process = builder.start();
		boolean n = process.waitFor(Integer.parseInt(line[i]), TimeUnit.SECONDS);
		if(!n){
			process.destroy();
		}
		return n;
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		FileReader reader = new FileReader("C:\\Users\\pc\\IdeaProjects\\OSLab3\\Resurse\\Config");
		BufferedReader bufferedReader = new BufferedReader(reader);
		String[] line = new String[4];
		for(int i = 0; i < line.length; i++){
			line[i] = bufferedReader.readLine();
		}

		for(int i = 0; i < line.length; i+= 2){
			System.out.println(line[i] + "  " + line[i+1]);
			System.out.println(openApp(line, i));
		}
	}
}