package onlineGame;

import java.util.ArrayList;
import java.util.List;

public class OnlineGame implements Observable {
	
	private List<Observer> observers = new ArrayList<Observer>();
	private String name;

	public void setName(String name) {
		this.name = name;
		this.notifyObservers();
	}

	@Override
	public void subscribe(Observer observer) {
		this.observers.add(observer);
		observer.setTopic(this);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.name;
	}

}
