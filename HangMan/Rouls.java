package HangMan;

import java.util.ArrayList;

public class Rouls {
	private int lifesLeft = 8;
	private boolean Secound7To8Letters= false;
	public boolean lostLife(ArrayList<Integer> ar) {
		// TODO Auto-generated method stub
		if(ar.size()==0){
			this.lifesLeft--;
			return true;
		}
		return false;
	}
	public boolean LifesLeft() {
		// TODO Auto-generated method stub
		if(this.lifesLeft ==0)
		return false;
		return true;
	}
	public int howManeyLifesLeft() {
		// TODO Auto-generated method stub
		return this.lifesLeft;
	}
	public void setLife(int i) {
		// TODO Auto-generated method stub
		if (i ==3 ){
		
		}
			this.lifesLeft =6;
		if(i ==2){
				this.lifesLeft =8;
				Secound7To8Letters = true;
			}
		if(i ==1){
			this.lifesLeft =10;
		}
	
			
			
	}
	public boolean standadRoules() {
		// TODO Auto-generated method stub
		return Secound7To8Letters;
	}

}
