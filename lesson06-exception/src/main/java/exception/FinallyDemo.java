package exception;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;

public class FinallyDemo {
	public static void main(String[] args) {
		File file = new File("data.txt");
		FileWriter fw = null;
		FileWriter bw = null;
		try {
			fw = new FileWriter(file);
			bw = new FileWriter(file);

			bw.write("Row 1");
			bw.write("\nRow 2");
			bw.write(5 / 0);
			bw.write("\nRow 3");

			// save data

			System.out.println("Finished !!!");
			// OPEN FILE
		} catch (Exception e) {
			// save data
		} finally {
			try {
				bw.close();
				fw.close();
				Desktop.getDesktop().open(file);

			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}

		System.out.println("=====main thread ========");
	}
}
