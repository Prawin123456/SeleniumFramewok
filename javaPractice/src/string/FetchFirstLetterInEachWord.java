package string;

public class FetchFirstLetterInEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        String input = "My Name Is Prawin Kumar";
	        String result = fetchFirstLetters(input);
	        System.out.println("First letters: " + result);
	    }

	    public static String fetchFirstLetters(String input) {
	        String[] words = input.split(" ");
	        String result = "";

	        for (String word : words) {
	            if (!word.isEmpty()) {
	                result += word.charAt(0);
	            }
	        }

	        return result;
	    }
	}

	


