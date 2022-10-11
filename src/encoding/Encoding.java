package encoding;

public class Encoding extends BaseEncoding {
	
	public boolean pickWhichEncode(char choice) {
		if(getIndexChart().containsKey(choice)) {
			encodeChoice = choice;
			return true;
		}
		return false;
	}
	
	public String encode(String plainText) {
		
		StringBuilder result = new StringBuilder();
		result.append(encodeChoice);
		for(int i = 0;i<plainText.length();++i) {
			if(!getIndexChart().containsKey(plainText.charAt(i))) {
				result.append(plainText.charAt(i));
				continue;
			}
			int ogIndex = getIndexChart().get(plainText.charAt(i));
			char newChar = getCharChart().get(loop(ogIndex-encodingNum()));
			
			result.append(newChar);
		}
		
		return result.toString();
	}
	
}
