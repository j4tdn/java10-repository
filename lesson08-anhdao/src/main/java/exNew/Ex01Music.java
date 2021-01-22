package exNew;

import java.util.Arrays;

public class Ex01Music {
	public static void main(String[] args) {
		String[] musics = { "d:/music/somthingyoulike.mp3", 
							"d:/music/foreoverandone.mp3", 
							"d:/music/takemetoyourheart.mov" };
	   
		iterate(getMp3Songs(musics));
		
	}

	private static String[] getMp3Songs(String[] musics) {
		String[] result = new String[musics.length];
		int index = 0;
		for (String music : musics) {
			if (music.endsWith(".mp3")) {
				result[index++] = music.substring(music.lastIndexOf('/') + 1, music.lastIndexOf('.'));
			}
		}
		return Arrays.copyOfRange(result, 0, index);
	}
	
	public static void iterate(String [] elements) {
		for(String element: elements) {
			System.out.println(element);
		}
		
	}

}
