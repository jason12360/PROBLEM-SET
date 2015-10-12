package code;

public class set2 {
	public int x2ten(String number, int base){
		if(base < 0 || base > 36){
			return -1;
		}
		int result = 0;
		for(int places = 0; places < number.length(); places++){
			int digit = digitValue(number.charAt(places));
			if(digit == -1){
				return -1;
			}else{
			result = result * base + digit;
			}
		}
		return result;	
	}
	
	
	private int digitValue(char ch) {
		if(ch >= '0' && ch <= '9' ){
			return ch - '0';
		}else if(ch >= 'A' && ch <= 'Z'){
			return 10 + (ch -'A');
		}else{
			return -1;
		}

	}


	public String ten2x(int number, int base) {
		if(base < 0 || base > 36){
			return "";
		}
		String result = "";
		int quot = number;
		while(quot != 0){
			int reminder = quot % base;
			quot = quot / base;
			if(charValue(reminder) == '*'){
				return "";
			}else{
			result = charValue(reminder) + result;
			}
		}
		return result;
		
	}


	private char charValue(int num) {
		if(num >= 0 && num <= 9){
			
			return (char) (num +'0');// TODO Auto-generated method stub
		}else if(num >= 10 && num <= 36){
			return (char) (num - 10 +'A');
		}else{
		return '*';
		}
	}

}
