package org.tnsif.acc.c2tc.methodoverriding_super_this_instanceof;

class ProductBottle
{
	double price;
	
	ProductBottle(double price)
	{
		this.price=price;
	}
	double calculateDiscount()
	{
		return this.price*0.10;
		//400*0.10 =40
	}
	double calculateTotalPrice()
	{
		return this.price-this.calculateDiscount();
		//400-40=360
	}
}

public class ThisDemo1 {
	public static void main(String[] args) {
		ProductBottle product=new ProductBottle(400);
		System.out.println(" Final Price :"+product.calculateTotalPrice());
	}

}