package GuessTheNumber;

public class GuessGame {
	// has three instance variable for the three objects....
	Player p1;
	Player p2;
	Player p3;

	public void startGame() {
		// creating the three player and assigning them to the three player instance
		// variable...
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();

		// declare three variables to hold the three guess the players make
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;

		// declare three variable to hold a true or false based on the player answer...
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;

		int targetNumber = (int) (Math.random() * 10);
		System.out.println("I am thinking of a number between 0 and 9...");

		while (true) {
			System.out.println("Number to be guessed is " + targetNumber);

			p1.guess();
			p2.guess();
			p3.guess();

			guessp1 = p1.number;
			System.out.println("Player one guessed " + guessp1);

			guessp2 = p2.number;
			System.out.println("Player two guessed " + guessp2);

			guessp3 = p3.number;
			System.out.println("Player three guessed " + guessp3);

			if (guessp1 == targetNumber) {
				p1isRight = true;
			}

			if (guessp2 == targetNumber) {
				p2isRight = true;
			}

			if (guessp3 == targetNumber) {
				p3isRight = true;
			}

			if (p1isRight || p2isRight || p3isRight) {
				System.out.println("We have the winner!");
				System.out.println("Player one got it right? " + p1isRight);
				System.out.println("Player two got it right? " + p2isRight);
				System.out.println("Player three got it right? " + p3isRight);
				System.out.println("Game is Over");
				break;
			} else {
				System.out.println("Players will have to try again.");
			}

		}

	}

}
