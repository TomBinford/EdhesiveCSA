import java.util.Scanner;

class Main
{
    static int vowelsRemoved = 0;
    static int duplicatesRemoved = 0;

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the message to be shortened");
        String message = scan.nextLine();
        
        System.out.println();
        if(message.length() < 10)
        {
            System.out.println("This doesn't need shortening!");
            return;
        }
        
        message = message.toLowerCase();
        
        String noDuplicates = removeDuplicates(message);
        String noVowels = removeVowels(noDuplicates);
        
        System.out.println("Shortened message: " + noVowels);
        System.out.println("Repeated letters removed: " + duplicatesRemoved);
        System.out.println("Vowels removed: " + vowelsRemoved);
        System.out.println("Total characters saved: " + (message.length() - noVowels.length()));
    }
    
    static boolean isVowel(char c)
    {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    
    static String removeVowels(String message)
    {
        String noVowels = "";
        for(int i = 0; i < message.length(); i++)
        {
            char atI = message.charAt(i);
            if(i == 0 || message.charAt(i - 1) == ' ')
            {
                noVowels += atI;
            }
            else if(isVowel(atI))
            {
                vowelsRemoved++;
            }
            else
            {
                noVowels += atI;
            }
        }
        return noVowels;
    }
    
    static String removeDuplicates(String message)
    {
        String noDuplicates = "";
        for(int i = 0; i < message.length(); i++)
        {
            char atI = message.charAt(i);
            if(i != 0 && message.charAt(i - 1) == atI && !isVowel(atI))
            {
                duplicatesRemoved++;
            }
            else
            {
                noDuplicates += atI;
            }
        }
        return noDuplicates;
    }
}
