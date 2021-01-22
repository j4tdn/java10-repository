package exercisebonus;

public class Ex01 {
	public static void main(String[] args) {
		String song1 = "d:/music/somthingyoulike.mp3";
		String song2 = "d:/music/foreoverandone.mp3";
		String song3 = "d:/music/takemetoyourheart.mov";
		String song4 = "d:/music/photograph.mp3";
		String song5 = "d:/music/weareyoung.mov";
		String[] arrSong = {song1, song2, song3, song4, song5};
		
		for (String songName : songName(arrSong)) {
			if (songName != null) {
				System.out.println(songName);
			}
		}
	}
	
	private static String[] songName(String[] arrSong) {
		String[] songsName = new String[arrSong.length];
		int length = 0;
		for (String song : arrSong) {
			if (song.contains("mp3")) {
				songsName[length] = song;
				songsName[length] = songsName[length].substring(songsName[length].lastIndexOf("/") + 1, songsName[length].indexOf("."));
				length++;
			}
		}
		return songsName;
	}
}
