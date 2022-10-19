import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Task2 {

	public static void work() throws IOException, InterruptedException {
		boolean check = true;
		try {
			ProcessBuilder builder = new ProcessBuilder("C:\\Games\\Lab2(OS)\\cpuz_x64_ru.exe");
			Process process = builder.start();
			if(process.isAlive()){
				Thread.sleep(3000);
				process.destroy();
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
		work();
	}
}
