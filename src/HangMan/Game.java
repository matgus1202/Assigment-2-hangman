package HangMan;

import java.util.ArrayList;

public class Game {
	public void start(Words words, Player player, Interface inFace, Rouls rouls) {
		// TODO Auto-generated method stub
			player.setUser(inFace.CreateUser());
			while (inFace.doYouWantStart(player.howManeyPointsGotThePlayer())!= 2){
				if(inFace.didYouWantStart()==4){
				
					words.addChosenWordIfNotAllredyAdded(	inFace.addWord());
				}else {
				 if (inFace.didYouWantStart()==3){
					rouls.setLife(inFace.chooseNummberOfLifes());
					words.setLenthOfWords(inFace.chooseDifficulyt());
				}else {
					rouls.setLife(2);
					words.setLenthOfWords(0);//0 Means all words
				}
				words.getRandomWord();
				String playerKnows = player.getSizeOfWord(words.getSizeOfWord());
				String guess;
				while(!playerKnows.equals(words.getWord())&& rouls.LifesLeft()){
				
				do {
					guess = inFace.showPlayerWhatHeKnows(playerKnows);
					if (guess.substring(0).equals("1")){
						System.exit(0);
					}
				} while (guess.length() != 1);
				char c =guess.charAt(0);
				ArrayList <Integer> ar = words.checkLetter(c);
				player.UppdateWord(c, ar);
				playerKnows = player.getWord();
				if(rouls.lostLife(ar)&& rouls.howManeyLifesLeft()>0){
					inFace.wrongGues(rouls.howManeyLifesLeft());
				}
			}
				if (rouls.LifesLeft()){
					player.playerWonIncreaseThePoints();
					inFace.wonGame();
					
					
				}else{
					inFace.lostGame();;
				}
			
			}
		}
	}
}
