import java.util.Scanner;

//@author: Celine Lechner

public class Palindrom {
    	  public static boolean istPalindrom(String s)
    	    {   
   	        if(s.length() == 0 || s.length() == 1) // Wenn die Länge des Strings null oder 1 ist, ist es ein Palindrom
    	            return true; 
    	        if(s.charAt(0) == s.charAt(s.length()-1)) //hier wird die erste Stelle mit der Letzten verglichen, wenn gleich --> erste und letzte Stelle "verschmissen" --> selbe für substring --> solange bis Ende
    	        
    	        return istPalindrom(s.substring(1, s.length()-1));	

    	        
    	        return false;
    	    }

    	    public static void main(String[]args)
    	    {
    	    	
    	        Scanner scanner = new Scanner(System.in);
    	        System.out.println("Geben Sie ihren Text ein:");
    	        String string = scanner.nextLine();
    	        
    	        
    	        if(istPalindrom(string))
    	            System.out.println(string + " ist ein Palindrom !! :-D");
    	        else
    	            System.out.println(string + " ist kein Palindrom !! :-((( ");
    	    }
    }



























































