
public class CalcetoManager implements ObservePlayerCard{

	public CalcetoManager(){
		
	}

	@Override
	public void update() {
		
		sendMail("Manager@gmail.com" , " new Goal is scored");
	}

	private void sendMail(String receiver, String content) {
		
		System.out.println("Send to : " + receiver  + "  content : " + content);
		
	}
}
