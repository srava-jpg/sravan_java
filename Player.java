package SmallProjects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Player {

	private String name;
	private int position;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {		// It goes to main method which contains setName()
		this.name = name;
	}
	
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	
	public static void start(List<Player> PlayerName) {		// List<Player> stores list of players
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	
	HashMap<Integer, Integer> ladder = new HashMap<>();
	ladder.put(5, 30);
	ladder.put(20, 45);
	ladder.put(35, 47);
	
	HashMap<Integer, Integer> snake = new HashMap<>();
	ladder.put(48, 8);
	ladder.put(40, 17);
	ladder.put(33, 12);
	
	int currentPlayer = 0;
	boolean gameOver = false;
	
	while(!gameOver) {
		Player s = PlayerName.get(currentPlayer);   // Selecting players one after another
		System.out.println("player name: " + s.getName());
		System.out.println("position: " + s.getPosition());
		System.out.println("Go to next player: ");
		sc.nextLine();
		
		int dice = random.nextInt(6) +1;		//It generates random number from 1 to 6
		System.out.println("dice number: " + dice);
		int newPosition = s.getPosition() + dice;

// Check whether position exceeds 100
		if(newPosition <=50) {
			s.setPosition(newPosition);
			
			//If ladder occurs
			if(ladder.containsKey(newPosition)) {
				System.out.println("got ladder successfully which moves upwards");
				s.setPosition(newPosition);
			}
			
			
		}
		else if(snake.containsKey(newPosition)) {
			System.out.println("got snake which moves downwards");
			s.setPosition(newPosition);
		}
		else {
            System.out.println("You need an exact dice value to reach 100.");
        }
		
		System.out.println("name: " + s.getName());
		System.out.println("position: " + s.getPosition());
		System.out.println("----------------------2");
		
		if(s.getPosition() == 50) {
			System.out.println("winner");
			gameOver = true;
		}
		else if(dice != 6) {
			currentPlayer = (currentPlayer + 1)%  PlayerName.size();
		}
		else {
            System.out.println("You got 6! Play again.");
        }
	}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Player> players = new ArrayList<>();	//It creates list of Player objects
		System.out.println("enter no of players: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<n; i++) {
			Player p = new Player();		// It creates player object
			System.out.println("enter player" + (i+ 1) + "name: ");		// i is 0. SO we use i+1 to increment player number
			p.setName(sc.nextLine());		
			players.add(p);
		}
		Player.start(players);
	}
	
	

}
