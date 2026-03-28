class SocialMediaPosts{
	
	String userName;
	String content;
	float views;
	String postDate;
	String platformName;
	long noOfLikes;
	long noOfShares;
	
	public SocialMediaPosts(String userName,String content,float views,String postDate,String platformName,long noOfLikes,long noOfShares){
		
	    this.userName=userName;
		this.content=content;
		this.views=views;
		this.postDate=postDate;
		this.platformName=platformName;
		this.noOfLikes=noOfLikes;
		this.noOfShares=noOfShares;
    }
	
	public void getSocialMediaPostsData(){
		System.out.println("------SocialMediaPostsData------");
		System.out.println("userName:"+userName);
		System.out.println("content:"+content);
		System.out.println("views:"+views);
		System.out.println("postDate:"+postDate);
		System.out.println("platformName:"+platformName);
	    System.out.println("noOfLikes:"+noOfLikes);
		System.out.println("noOfShares:"+noOfShares);
	}
}		