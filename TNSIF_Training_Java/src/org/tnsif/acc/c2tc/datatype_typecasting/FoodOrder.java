package org.tnsif.acc.c2tc.datatype_typecasting;

public class FoodOrder {

	public static void main(String[] args) {
		
		//Primitive datatype
		
		int     orderId =101;
		double  price=299.99;
		boolean isDelivered= false;
		char    rating='A';
		float   deliveryDistance=5.3f;
		long    deliveryBoyPhone= 9835365252L;
		byte    deliverTime=45;
		short   restaurantId=12;
		
		
		//Non  Primitive datatype
		
		String CustomerName="Anajli";
		String[] foodItem= {"Burger" , "Fries","Coke"};
		
		
		System.out.println("Order Summary");
		System.out.println("Customer Name :"+CustomerName);
		System.out.println("Order Id :"+orderId);
		System.out.println("RestaurantID :"+restaurantId);
		System.out.println("Delivery Boy Contact :"+deliveryBoyPhone);
		System.out.println("Food items :");
		for (String item : foodItem)
		{
			System.out.println(" - "+ item);
		}
		
		System.out.println("Total Price :"+price);
		System.out.println("DeliveryDistance :"+deliveryDistance);
		System.out.println("Expcted Time :"+deliverTime);
		System.out.println("Delivery status :"+isDelivered);
		System.out.println("Rating :"+ rating);
		
	}

}