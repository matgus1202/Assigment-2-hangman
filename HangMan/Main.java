package HangMan;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rouls rouls = new Rouls();
		Interface inFace = new Interface();
		Player player = new Player();
		Words words = new Words();
		Game game = new Game();
		game.start(words,player,inFace,rouls);
	}

}
