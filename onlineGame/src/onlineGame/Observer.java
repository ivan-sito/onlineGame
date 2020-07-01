package onlineGame;

public interface Observer {
	public void subscribe(Observer observer);
	public void update();
	public void setTopic(Observable topic);
}
