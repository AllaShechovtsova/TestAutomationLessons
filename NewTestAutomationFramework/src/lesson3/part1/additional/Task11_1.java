package lesson3.part1.additional;

public class Task11_1 {
	public boolean willWeGoToTheCinema(boolean heSmile, boolean sheSmile){
		boolean result=true;
		if (heSmile==false ||sheSmile==false){
			result=false;
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		Task11_1 myInstance=new Task11_1();
		System.out.println(myInstance.willWeGoToTheCinema(true, true));
		System.out.println(myInstance.willWeGoToTheCinema(true, false));
		System.out.println(myInstance.willWeGoToTheCinema(false, true));
		System.out.println(myInstance.willWeGoToTheCinema(false, false));
	}
}