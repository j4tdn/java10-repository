package Exception;
import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FinallyDemo {
	public static void main(String[] args) {
		File file = new File("data.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

			bw.write("Row x");
			bw.write("\nRow y");

			bw.write(5 / 0); // exception

			bw.write("\nRow z");

			System.out.println("Finished !!!");
		} catch (Exception e) {

		} finally {
			try {
				bw.close();
				fw.close();

				Desktop.getDesktop().open(file);

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		System.out.println("==== main thread ====");
	}
}
