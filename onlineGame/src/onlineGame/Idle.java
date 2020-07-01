package onlineGame;

public class Idle implements State {

	private String stateName = "Idle";
	
	@Override
	public void applyState(Context context) {
		context.setState(this);
	}
	
	public String getStateName() {
		return this.stateName;
	}
}
