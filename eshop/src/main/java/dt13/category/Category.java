package dt13.category;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


	@Entity
	public class Category 
	{
	@Id
	int CategoryId;
	@Column
	String CategoryName;
	@Column
	String CategoryDescription;
	public int getCategoryId() {
		return CategoryId;
	}
	public void setCategoryId(int categoryId) {
		CategoryId = categoryId;
	}
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	public String getCategoryDescription() {
		return CategoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		CategoryDescription = categoryDescription;
	}
	
	
	

}
