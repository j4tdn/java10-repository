package persistence;

import org.apache.commons.lang3.builder.EqualsBuilder;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ItemGroup {
	private static Integer id;
	private static String name;
	public ItemGroup() {
	}
	public ItemGroup(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public static Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public static String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 @Override
	public boolean equals(Object o) {
		if (this == o){
			return true;
		}
		if(!(o instanceof ItemGroup)) {
			return false;
		}
		 ItemGroup that = (ItemGroup) o;
		return new EqualsBuilder()
				.append(getId(), that.getId())
				.append(getName(), that.getName())
				.isEquals();
	}
	 
	 @Override
	public int hashCode() {
	
		return new HashCodeBuilder()
				.append(getId())
				.append(getName())
				.toHashCode();
		
	}
	 @Override
	public String toString() {
		return getId()+ ","+ getName();
				
	}
	
}
