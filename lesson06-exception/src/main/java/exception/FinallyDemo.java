package exception;

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
			bw.newLine();
			bw.write("Row y");
			bw.write( 5 / 0 );
			bw.write("Row z");

			System.out.println("Fineshed !!!");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
				// open file by default editor
				Desktop.getDesktop().open(file);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		System.out.println("==== main thread ====");
	}

}