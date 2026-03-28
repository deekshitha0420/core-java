class SocialMediaPostsRunner{
	
	public static void main(String[] args){
		
		System.out.println("SocialMediaPosts details with parameters: Deekshitha,Education,18.9f,17-08-2020,Instragram,100000l,15000l");
		
		SocialMediaPosts ref = new SocialMediaPosts("Deekshitha","Education",18.9f,"17-08-2020","Instragram",100000l,15000l);
		
		ref.getSocialMediaPostsData();
	}
}