package part2;

public class Student implements FileData {
	private final String id;
	private final String name;
	private final String score_avr;
	
	public Student() {
		this.id = "";
		this.name = "";
		this.score_avr = "";
	}
	
	public Student(String id, String name, String score_avr) {
		this.id = id;
		this.name = name;
		this.score_avr = score_avr;
	}
	
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getScore_avr() {
		return score_avr;
	}
	
	public static Student student(String line) {
		String[] tmps = line.split(" - ");
		if(tmps.length != 3) {
			return null;
		}
		return new Student(tmps[0], tmps[1], tmps[2] ); 
	}

	public String toLine() {
		return id + " - " + name + " - " + score_avr;
	}
	
	public String toString() {
		return "Student: " + id + " - " + name + " - " + score_avr;
	}
	
}
