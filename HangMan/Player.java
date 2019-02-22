package HangMan;

import java.util.ArrayList;

public class Player {
private String user;
private String word;


	public void setUser(String u) {
		// TODO Auto-generated method stub
		user = u;
	}
	public String getSizeOfWord(int size) {
		// TODO Auto-generated method stub
		word ="";
		for (int i =0; i<size;i++ ){
			word = word+"*";
		}
		return word;
	}
	public void UppdateWord(char c, ArrayList<Integer> ar) {
		// TODO Auto-generated method stub
		StringBuilder wordSt = new StringBuilder(word);
		for (int i =0; i<ar.size();i++){
		wordSt.setCharAt(ar.get(i), c);
		}
		word = wordSt.toString();
		
	}
	public String getWord() {
		// TODO Auto-generated method stub
		return word;
	}

}
