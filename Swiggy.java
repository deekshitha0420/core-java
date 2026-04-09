class Swiggy{
	
	public double getPriceByFoodName(String FoodName){
		System.out.println("invoking getPriceByFoodName:"+FoodName);
		double Price=0.0;
		
		if("egg rice"==FoodName){
			Price=65;
		} else if("fried rice"==FoodName){
			Price=90.99;
		} else if("aloo paratha"==FoodName){
			Price=80.21;
		} else if("biriyani"==FoodName){
			Price=120;
		} else if("boti gojju"==FoodName){
			Price=100;
		} else {
			Price=0.0;
		}
		System.out.println("end of getPriceByFoodName");
		return Price;
	}
	
	public double getTotalAmountByPriceAndQuantity(double Price,int Quantity){
		System.out.println("invoking getTotalAmountByPriceAndQuantity");
		
		double TotalPrice=0.0;
		TotalPrice=Price*Quantity;
		System.out.println("end of getTotalAmountByPriceAndQuantity");
		return TotalPrice;
	}
}