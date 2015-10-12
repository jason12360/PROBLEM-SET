package code;

public class PSet4 {
	
	public boolean accept(String s) {
		String temp = "";
		if(s.charAt(0) == '+'){
			temp = temp + s.charAt(0)+ s.charAt(1);
			
			for(int i = 2; i < s.length(); i++){
				
				char c = s.charAt(i);
				if(c == 'D'){
					return false;
				}else if(c >= '0' && c<= '9'){
					temp =  temp + 'D';
				}else{
					temp =  temp + c;
				}
				
			}
			
		}else{
			for(int i = 0; i < s.length(); i++){
				
				char c = s.charAt(i);
				if(c == 'D'){
					return false;
				}else if(c >= '0' && c<= '9'){
					temp =  temp + 'D';
				}else{
					temp =  temp + c;
				}
			}	
			
		}
		
		
		return temp.equals("(DDD)DDD-DDDD") ||  temp.equals("DDD-DDDD") ||  temp.equals("+1-DDD-DDD-DDDD");
	}

	public boolean accept(String string, int state) {
		int currentState = 0;
		for(int i = 0; i< string.length(); i++){
			char process = string.charAt(i);
			switch(currentState){
				case 0:
					if(process == 'P'){
						currentState = 2;
					}else if(process == 'S'){
						currentState = 1;
					}
				case 1:
					if(process == 'W'){
						currentState = 3;
					}
				case 2:
					if(process == 'D'){
						currentState = 0;
					}else if(process == 'S'){
						currentState = 1;
					}
				case 3:
					if(process == 'S'){
						currentState = 1;
					}else if(process == 'P'){
						currentState = 2;
					}
			}
		}
		return currentState == state;
	}

	
}
