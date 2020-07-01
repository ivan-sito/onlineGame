package onlineGame;

public class Sleeping implements State {

	private String stateName = "Sleeping";
	
	@Override
	public void applyState(Context context) {
		context.setState(this);
	}
	
	public String getStateName() {
		return this.stateName;
	}
}
