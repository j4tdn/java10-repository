package exception;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FinallyDemo {
	public static void main(String[] args) {
		File file = new File("datax.txt");

		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

			bw.write("Row 1");
			bw.write("\nRow 2");

			bw.write(5 / 0);

			bw.write("\nRow 3");

			System.out.println("Finished !!");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// save and close
				bw.close();
				fw.close();

				// open file by default editor
				Desktop.getDesktop().open(file);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
