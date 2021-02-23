	package Examplethree;
	import java.util.Scanner;
	import java.util.Stack;
	import java.util.regex.Pattern;

		public class ReverseString {

		    static String reverses(String str) {
		         Pattern pattern = Pattern.compile("\\s"); 
		      
		            String[] temp = pattern.split(str); 
		            String result = ""; 
		       
		            for (int i = 0; i < temp.length; i++)
		            { 
		                if (i == temp.length - 1) 
		                    result = temp[i] + result; 
		                else
		                    result = " " + temp[i] + result; 
		            } 
		            return result; 
		    }
		    
		    static void reverseWords(String str) 
		    { 
		        Stack<Character> st=new Stack<Character>(); 
		        for (int i = 0; i < str.length(); ++i) { 
		            if (str.charAt(i) != ' ') 
		                st.push(str.charAt(i));  
		            else 
		            { 
		                while (st.empty() == false) { 
		                    System.out.print(st.pop()); 
		                      
		                } 
		                System.out.print(" "); 
		            } 
		        } 
		        while (st.empty() == false) { 
		            System.out.print(st.pop()); 
		              
		        } 
		    }

		    public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the string");
		        String str;
		        str = sc.nextLine();
		        String res = reverses(str);
		        reverseWords(res);
		        sc.close();
		    }

		}




