class SwiggyRunner{
	public static void main(String [] args){
		Swiggy instance = new Swiggy();
		double FoodPrice=instance.getPriceByFoodName("biriyani");
		System.out.println("FoodPrice:"+FoodPrice);
		
		double TotalAmount=instance.getTotalAmountByPriceAndQuantity(FoodPrice,3);
		System.out.println("TotalPrice:"+TotalAmount);
	}
}