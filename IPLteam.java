class IPLteam{
	
	String teamName;
	String captionName;
	String coarch;
	String ownerName;
	String jerseyColor;
	int noOfplayers;
	
    public IPLteam(){
		System.out.println("IPLteam object created");
		 
	}
	
	public void setDetails(String name,String captionName,String coarch,String ownerName,String jerseyColor,int noOfplayers){
		this.teamName=teamName;
		this.captionName=captionName;
		this.coarch=coarch;
		this.ownerName=ownerName;
		this.jerseyColor=jerseyColor;
		this.noOfplayers=noOfplayers;
	}
	
	public void displayDetails(){
		System.out.println("teamName:"+teamName);
		System.out.println("captionName:"+captionName);
		System.out.println("coarch:"+coarch);
		System.out.println("ownerName:"+ownerName);
		System.out.println("jerseyColor:"+jerseyColor);
		System.out.println("noOfplayers:"+noOfplayers);
	}
}