import java.util.Scanner;

class Word_Processor {
	public static void generate(String input, String choice)
	{
		String upperInput = null, lowerInput = null;
		if(choice == "upper"){	
			upperInput = input.toUpperCase();
			System.out.println(upperInput);
		}
		else if (choice == "lower"){
			lowerInput = input.toLowerCase();
			System.out.println(lowerInput);
		}
		else
			System.out.println("Invalid option");
	}	
	public static void main (String[] args)
    {
 
        Scanner myObj = new Scanner(System.in);
        System.out.println("data: ");
        String str = myObj.nextLine();
 
 		Scanner myotherObj = new Scanner(System.in);
        System.out.println("options: ");
        String options = myotherObj.nextLine();
		
		generate(str, options);
    }
}



