package lab5;

public class Lab5 {
	
	public static String getInitials(String fullName) {
	       

	        String[] nameParts = fullName.split("\\s+"); 
	        StringBuilder initials = new StringBuilder();

	        for (String part : nameParts) {
	            if (!part.isEmpty()) {
	                initials.append((part.charAt(0))); 
	            }
	        }

	        return initials.toString();
	    }

	 public static int getVowel(String fullName) {
		 String vowelList = "aeiouAEIOU";
		 
		 for (int i = 0; i < fullName.length(); i++) {
			 char ch = fullName.charAt(i);
			 if (vowelList.indexOf(ch) >= 0) {
				 return i;
			 }
			 	
		 }
		 
		 return -1;
	 }
	 
	 
	 
	 public static void main(String[] args) {
	        
	        System.out.println(getInitials("Cher"));
	        System.out.println(getInitials("Edna del Humboldt von der Schooch")); 

	        // Testing the getVowel method
	        System.out.println(getVowel("Cher")); 
	        System.out.println(getVowel("vn")); 
	    }
	}