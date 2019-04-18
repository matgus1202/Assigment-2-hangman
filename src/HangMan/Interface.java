package HangMan;

import java.util.Scanner;

public class Interface {
	private static Scanner input = new Scanner(System.in);
	private int startOrEndOrStartAndChoose =0;
	private int lifes;
	String userName;
	String[] hangdMan = {
			"|",
			"|\no", 
			"|\no\n|", 
			" |\n o\n/|", 
			" |\n o\n/|"+"\\\\",
			" |\n o\n/|"+"\\\\"+"\n/" ,
			" |\n o\n/|"+"\\\\"+"\n/"+" \\\\" };
	
	public String CreateUser() {
		// TODO Auto-generated method stub
		System.out.println("Write your User Name if you write an non existiong one you will create a new one");
		userName = input.next();
		System.out.println("hi and wellcome your user name is " + userName);
		return userName;
	}
	public int doYouWantStart(int i) {
		// TODO Auto-generated method stub
		System.out.println("Write 1 for Starting a new game and 2 for ending and 3 for new game and choose difficulty and 4 for adding a new word");
		System.out.println("Your user name is "+ userName+" and you have "+ i+ " nummber of wins");
		startOrEndOrStartAndChoose= input.nextInt();
		return startOrEndOrStartAndChoose;
	}
	public int didYouWantStart() {
		// TODO Auto-generated method stub
		return startOrEndOrStartAndChoose;
	}
	public String showPlayerWhatHeKnows(String st) {
		// TODO Auto-generated method stub
		System.out.println("\n\n\neach star * repensents an letter");
		System.out.println(st);
		System.out.println("Gues a letter");
		System.out.println("or to end the game press 1 ");
		return input.next();
		
		
	}
	public void wrongGues(int i) {
		// TODO Auto-generated method stub
			System.out.println("\n\nguest wrong try again you have " +i+" tryes left before you will get hangd");
			if(lifes ==2)
			System.out.println(hangdMan[7-i]);
	}
	public void lostGame() {
		// TODO Auto-generated method stub
		System.out.println("you have lost the game and will now be hanged");
		
	}
	public void wonGame() {
		// TODO Auto-generated method stub
		System.out.println("you won and shall be rewarded with another game if you like");
	}
	public int chooseDifficulyt() {
		// TODO Auto-generated method stub
			System.out.println("1(5-6 letters long) for easy 2(7-8 letters long) for medium and 3(9-10 letters long) for hard");
			lifes =input.nextInt();
			return lifes;
	}
	public int chooseNummberOfLifes() {
		// TODO Auto-generated method stub
			System.out.println("1 for easy 10 lifes 2 for medium 8 lifes and 3 for hard 6 lifes ");
			return input.nextInt();
	}
	public String addWord() {
		// TODO Auto-generated method stub
			System.out.println("write the word you wana add if its allredy added nothing will happend");
			String newWord =input.next();
			return newWord;
	}

	

}
