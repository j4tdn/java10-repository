package dao;

public interface DepartmentDAO {
	
	void firstLevelCache(String id);
	
	void secondLevelCache(String id);
}
