package HangMan;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner; 
public class Words {
	private String ThePicktWord;
	private int lengthOfWords;
	public void getRandomWord() {
		// TODO Auto-generated method stub
		File file =  new File("C:\\Users\\mattias\\workspace\\HangMan\\src\\HangMan\\words.txt");
		ArrayList<String> wordList = new ArrayList<String>();
		Scanner scanner;
		
		try {
			scanner = new Scanner(file);
	    
			while (scanner.hasNextLine()){
				String temp =scanner.nextLine();
				
				if (lengthOfWords==1){
					if (temp.length()==5){
						wordList.add(temp);
					}
					if (temp.length()==6){
						wordList.add(temp);
					}
				}
				
				if (lengthOfWords==2){
					if (temp.length()==7){
						wordList.add(temp);
					}
					if (temp.length()==8){
						wordList.add(temp);
					}
				}

				if (lengthOfWords==3){
					if (temp.length()==9){
						wordList.add(temp);
					}
					if (temp.length()==10){
						wordList.add(temp);
					}
				}
				if (lengthOfWords==0){
						wordList.add(temp);
				}
			}
			Random r = new Random();
			if(wordList.size()>1){
				int result = r.nextInt((wordList.size())-0) + 0;
			ThePicktWord = wordList.get(result);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public int getSizeOfWord() {
		// TODO Auto-generated method stub
		return ThePicktWord.length();
	}
	public ArrayList<Integer> checkLetter(char c) {
		// TODO Auto-generated method stub
		ArrayList <Integer> arInt = new ArrayList<Integer>();
		for (int i =0; i<ThePicktWord.length(); i++){
			if (ThePicktWord.charAt(i) == c){
				arInt.add(i);
			}
		}	
		return arInt;
	}
	public String getWord() {
		// TODO Auto-generated method stub
		return ThePicktWord;
	}
	public void setLenthOfWords(int chooseDifficulyt) {
		// TODO Auto-generated method stub
		this.lengthOfWords =chooseDifficulyt;
	}

}
