package oops;

public abstract class WhatsAppV5 {
	
	public void aiImage() {
		System.out.println("ai created images");
	}
	
	public void reShare() {
		System.out.println("reshare Status");
	}

	public void instantLive() {
		System.out.println("locate");
	}

	public void sharePostInsta() {
		// TODO Auto-generated method stub
		System.out.println("share post");
		
	}
	
	public static void main(String[] args) {
		WhatsAppV5 w =new WhatsAppV7();
		w.aiImage();
		w.reShare();
		w.instantLive();
		w.sharePostInsta();
	}
	
	

}
