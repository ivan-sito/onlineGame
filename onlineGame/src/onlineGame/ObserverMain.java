package onlineGame;

public class ObserverMain {

	public static void main(String[] args) {


		OnlineGame onlineGame = new OnlineGame();
		Observer player1 = new OnlineGameSubscriber("Player 1");
		Observer player2 = new OnlineGameSubscriber("Player 2");
		Observer player3 = new OnlineGameSubscriber("Player 3");

		Context horse = new Context("Horse");
		Context cow = new Context("Cow");
		
		Eating eatingState = new Eating();
		Idle idleState = new Idle();
		Sleeping sleepingState = new Sleeping();
		
		eatingState.applyState(horse);
		idleState.applyState(cow);
		
		State horseState = horse.getState();
		String currentState = horseState.getStateName();
		System.out.println("Current state of the horse: " + currentState);
		
		onlineGame.subscribe(player1);
		onlineGame.subscribe(player2);
		onlineGame.subscribe(player3);
		
		onlineGame.setName(horseState.getStateName());
	}
}
