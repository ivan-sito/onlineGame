package onlineGame;

public class OnlineGameSubscriber implements Observer {

	private String name;
	private Observable state;
	
	public OnlineGameSubscriber(String name) {
		this.setName(name);
	}

	@Override
	public void update() {
		if(state == null) {
			System.out.println("not eating");
			return;
		}
		
		String topicName = state.getUpdate();
		System.out.println(this.getName() + " Horse state: " + topicName);
		
	}
	@Override
	public void setTopic(Observable topic) {
		this.state = topic;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void subscribe(Observer observer) {
		// TODO Auto-generated method stub
		
	}


}
