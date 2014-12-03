
public class MyInteger {

	private int value;

	public MyInteger(int x) {
		value = x;
	}

	public int getValue(){
		return this.value;
	}

	public boolean isEven(int value1){
		if(value1 % 2 == 0)
			return true;
  		else return false;
  		}
	
	public boolean isEven(){
		return isEven(this.getValue());
	}
	
	public boolean isEven(MyInteger Value1){
		return isEven(Value1.getValue());
	}

	public boolean isOdd(int value1){
		if(value1 % 2 == 1)
			return true;
  		else return false;
  	}
	
	public boolean isOdd(){
		return isOdd(this.getValue());
	}
	
	public boolean isOdd(MyInteger Value1){
		return isOdd(Value1.getValue());
	}

	public boolean isPrime(int value1){
		int j =2;
		int result = 0;
		while (j < value1 / 2){
			if(value % j == 0){;
			result = 1;
			}
			else j++;
		}
		if(result == 1){
			return true;}
		else return false;
	}

	public boolean isPrime(){
		return isPrime(this.getValue());
	}
	
	public boolean isPrime(MyInteger Value1){
		return isPrime(Value1.getValue());
	}
	
	public boolean equals (int value1) {
		return value == value1;
	}
	
	public boolean equals(MyInteger value1) {
		return equals(value1.getValue());
	}
	
	public static int parseInt(String string1) {
		return Integer.parseInt(string1);
	}
	
	public static int parseInt(char[] string1) {
		return parseInt(new String(string1));
	}
}







