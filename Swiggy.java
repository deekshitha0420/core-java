class Swiggy{
	void getswiggyDetails(){
		System.out.println("invoking getMenuDetails");

	}
	
	void checkFoodPriceByFoodName(String foodName){
        System.out.println("invoking checkFoodPriceByfoodNameandthefoodName:"+ foodName);

		if(foodName.equalsIgnoreCase("pizza"))
		{
		  System.out.println("the Price is:350");
		}
		 else
		
	    if(foodName.equalsIgnoreCase("burger"))
		{
		  System.out.println("the Price is:250");
		}
		 else
		
	    if(foodName.equalsIgnoreCase("ice cream"))
		{
		  System.out.println("the Price is:150");
		}
		 else{
		  System.out.println(foodName +" is not available");
		  System.out.println("the price is:0.0");
		}
	}
}