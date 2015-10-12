package tests;

public class x2ten {

	public int count_e(String r) {
		// TODO Auto-generated method stub
		int count = 0;
		if(r.length() == 0){
			return -1;
		}
		for(int i = 0; i < r.length(); i++){
			if(r.charAt(i) == 'e'){
				count++;
			}
		}
		return count;
	}

	public int count_one_char(String r, char c) {
		// TODO Auto-generated method stub
		int count = 0;
		if(r.length() == 0){
			return -1;
		}
		for(int i = 0; i < r.length(); i++){
			if(r.charAt(i) == c){
				count++;
			}
		}
		return count;
	}

}
