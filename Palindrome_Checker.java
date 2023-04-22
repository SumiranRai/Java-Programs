import java.util.Scanner;

class Palindrome_Checker {
	public static void is_it_Palindrome (String input)
	{
	String reverseInput="";
	
	int len = input.length();
	if( len == 1)
		System.out.println(input + " is itself the longest palindrome.");
	
	else if ( len == 0)
		System.out.println("Empty input");
	
	int maxLength = 1, start=0;
    int low, high;
    
        for (int i = 0; i < len; i++) {
            low = i - 1;
            high = i + 1;
            while (high < len && input.charAt(high) == input.charAt(i))                                    
                high++;
       
            while (low >= 0 && input.charAt(low) == input.charAt(i))                 
                low--;
       
            while (low >= 0 && high < len && input.charAt(low) == input.charAt(high) ){
                  low--;
                high++;
        }
 
        int length = high - low - 1;
        if (maxLength < length){
            maxLength = length;
            start=low+1;
        }
    }
       
    System.out.print("Longest palindrome substring is: ");
    System.out.println(input.substring(start, start + maxLength));
		
	for(int i = input.length() - 1; i >= 0; i--) {
		reverseInput = reverseInput + input.charAt(i);
	}
	
	if(input.equals(reverseInput))
		System.out.println(input + " is a Palindrome String.");
	
	else 
		System.out.println(input + " is not a Palindrome String.");
	
	
	}
	public static void main(String[] args)
    {
        // Input string
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String str = myObj.nextLine();
 
        // Convert the string to lowercase
        str = str.toLowerCase();
        is_it_Palindrome(str);
    }
}
