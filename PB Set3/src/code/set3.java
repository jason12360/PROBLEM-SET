package code;



public class set3 {

	public String encode(String s) {
		String result = "";
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			result = result + cipher13(c);// TODO Auto-generated method stub
		}
		return result;
	}

	private char cipher13(char c) {
		if(c >= 'A' && c <= 'Z'){
			return (char) ('A' + ((c-'A')+13) % 26);
		}else if (c >= 'a' && c <= 'z'){
			return (char) ('a' + ((c-'a')+13) % 26);
		}else{
			return c;
		}
	}

	public String encode(String s, String key) {
		String result = "";
		char[] target = setCharList(key);
		
		
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			if(c >= 'A' && c <= 'Z'){
				result = result + target[c - 'A'];
			}else if (c >= 'a' && c <= 'z'){
				result = result + target[c - 'a'];
			}else{
				result = result + c;
			}
		}
		return result;
	}

	private char[] setCharList(String key) {
		char[] target = new char[26];
		char[] temp = new char [26];
		for(int i = 0; i < 26 ; i++){
			target[i] = (char) ('A' + i);
		}
		if(key.length() != 0){
			int p = key.length();
			for(int i = 0; i < key.length();i++){
				temp [i] = Character.toUpperCase(key.charAt(i));
			}
			for(int i = 0; i < target.length; i++){
				if(!charInKey(key,target[i])){
					temp[p] = target[i];
					p++;
				}
			}
			return temp;
		}else{
			return target;
		}
	}

	private boolean charInKey(String key, char c) {
		for(int i = 0; i < key.length(); i++){
			if (Character.toLowerCase(key.charAt(i)) == Character.toLowerCase(c)){
				return true;
			}
		}
		// TODO Auto-generated method stub
		return false;
	}
}
	
	


