import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Task4 {
	public static void work() throws IOException, InterruptedException {
		boolean check = true;
		try {
			File files = new File("C:\\Games\\Lab2(OS)\\");
			File[] items = files.listFiles(new FilenameFilter() {
				@Override
				public boolean accept(File directory, String fileName) {
					if (fileName.endsWith(".exe")) {
						return true;
					}
					return false;
				}
			});
			ProcessBuilder builder = new ProcessBuilder("C:\\Games\\Lab2(OS)\\cpuz_x64_ru.exe");
			ProcessBuilder orig = new ProcessBuilder("C:\\Windows\\notepad.exe");
			Process processOrig = orig.start();
			Thread.sleep(1000);
			Process process = processOrig;
			process = builder.start();
			if(process.isAlive()){
				process.waitFor();
				Thread.sleep(3000);
				if(process.isAlive()){
					process.destroy();
				}
			}
		} catch (IOException e){
			check = false;
			System.out.println("Файл не найден\n");
			Thread.sleep(10000);
			work();
		}
		File file = new File("C:\\Games\\Lab2(OS)\\cpuz.ini");
		System.out.println(file.delete());
	}


	public static void main(String[] args) throws IOException, InterruptedException {

		//work();

		ProcessBuilder processBuilder = new ProcessBuilder(new String("C:\\Users\\pc\\OneDrive\\Рабочий стол\\Task.txt"));
		Process process = processBuilder.start();

	}
}