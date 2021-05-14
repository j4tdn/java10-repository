package bean;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class Student {
 private String id;
 private String name;
 private List<String> language;
 private List<Grade> grade;
 private Map<String, BigDecimal> points ;
 
 public Student() {
}

public Student(String id, String name, List<String> language, List<Grade> grade, Map<String, BigDecimal> points) {
	super();
	this.id = id;
	this.name = name;
	this.language = language;
	this.grade = grade;
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

public List<String> getLanguage() {
	return language;
}

public void setLanguage(List<String> language) {
	this.language = language;
}

public List<Grade> getGrade() {
	return grade;
}

public void setGrade(List<Grade> grade) {
	this.grade = grade;
}

public Map<String, BigDecimal> getPoints() {
	return points;
}

public void setPoints(Map<String, BigDecimal> points) {
	this.points = points;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", language=" + language + ", grade=" + grade + ", points=" + points
			+ "]";
}

}
