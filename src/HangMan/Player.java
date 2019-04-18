package HangMan;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Player {
private String user;
private String word;
private int points;

public int howManeyPointsGotThePlayer() {
	// TODO Auto-generated method stub
	return points;
}
public void playerWonIncreaseThePoints() {
	ArrayList<String> userList = new ArrayList<String>();
	File file =  new File("C:\\Users\\mattias\\workspace\\HangMan\\src\\HangMan\\user.txt");
	Scanner scanner;
	
		try {
			scanner = new Scanner(file);
			while (scanner.hasNextLine()){
				String temp =scanner.nextLine();
				userList.add(temp);
				System.out.println(temp);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<userList.size();i++){
			System.out.println(userList.get(i)+111+"dd");
		}
		try {
			FileWriter fw;
			fw = new FileWriter("C:\\Users\\mattias\\workspace\\HangMan\\src\\HangMan\\user.txt");
			boolean sameUser = false;
			for (int i = 0; i<userList.size();i++){
				
				if(sameUser==true){
					int in = Integer.valueOf(userList.get(i));
					fw.write(in+1+"");
					fw.write(( "\n" ));
					sameUser=false;
				}else{
					fw.write(userList.get(i));
					fw.write(( "\n" ));
				}
				if (user.equals(userList.get(i))){
					sameUser= true;
				}
			}
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}



	public void setUser(String u) {
		// TODO Auto-generated method stub
		File file =  new File("C:\\Users\\mattias\\workspace\\HangMan\\src\\HangMan\\user.txt");
		Scanner scanner;
		boolean was =false;
		ArrayList<String> userList = new ArrayList<String>();
			try {
				scanner = new Scanner(file);
				while (scanner.hasNextLine()){
					String temp =scanner.nextLine();
					userList.add(temp);
					if (temp.equals(u)){
						user = temp;
						points = scanner.nextInt();
						was= true;
					}
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (was==false){
				userList.add(u);
				try {
					FileWriter fw;
					fw = new FileWriter("C:\\Users\\mattias\\workspace\\HangMan\\src\\HangMan\\user.txt");
					for (int i = 0; i<userList.size();i++){
						fw.write(userList.get(i));
						fw.write(( "\n" ));
					}
					fw.write(0+"");
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(u+ " is added to the list he has 0 wins");
				setUser(u);
			}
			
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
