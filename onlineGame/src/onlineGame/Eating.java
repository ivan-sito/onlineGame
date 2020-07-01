package onlineGame;

public class Eating implements State {

	private String stateName = "Eating";
	
	@Override
	public void applyState(Context context) {
		context.setState(this);
	}
	
	public String getStateName() {
		return this.stateName;
	}

}
