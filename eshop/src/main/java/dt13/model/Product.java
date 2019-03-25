package dt13.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class Product
{
@Id
int ProductId;
@Column
String ProductName;
@Column
int ProductPrice;
@Transient
MultipartFile image;
public int getProductId() {
	return ProductId;
}
public void setProductId(int productId) {
	ProductId = productId;
}
public String getProductName() {
	return ProductName;
}
public void setProductName(String productName) {
	ProductName = productName;
}
public int getProductPrice() {
	return ProductPrice;
}
public void setProductPrice(int productPrice) {
	ProductPrice = productPrice;
}
public MultipartFile getImage() {
	return image;
}
public void setImage(MultipartFile image) {
	this.image = image;
}

}
