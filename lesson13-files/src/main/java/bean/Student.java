package bean;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class Student {
	private String id;
	private String name;
	private List<String> languages;
	private List<Grade> grades;
	private Map<String, BigDecimal> points;	
	
	public Student() {
	}

	public Student(String id, String name, List<String> languages, List<Grade> grades, Map<String, BigDecimal> points) {
		super();
		this.id = id;
		this.name = name;
		this.languages = languages;
		this.grades = grades;
		this.points = points;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	public List<Grade> getGrades() {
		return grades;
	}

	public void setGrades(List<Grade> grades) {
		this.grades = grades;
	}

	public Map<String, BigDecimal> getPoints() {
		return points;
	}

	public void setPoints(Map<String, BigDecimal> points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", languages=" + languages + ", points=" + points + "]";
	}
	
	
}