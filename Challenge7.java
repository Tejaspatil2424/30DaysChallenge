public class Challenge7 {
    public static String reverseWords(String s) {
        
        String[] parts = s.split(" ");
        
        String result = "";
        
        
        for (int i = parts.length - 1; i >= 0; i--) {
            if (!parts[i].equals("")) {  
                result = result + parts[i] + " ";
            }
        }
        
        
        if (result.equals("")) {
            return "";
        }
        
        
        return result.substring(0, result.length() - 1);
    }

    public static void main(String[] args) {
        //Test case 1
        System.out.println("Input:the sky is blue");
        System.out.print("Output:");
        System.out.println(reverseWords("the sky is blue"));   
        System.out.println();
        //Test case 2
         System.out.println("Input:hello world");
        System.out.print("Output:");
        System.out.println(reverseWords("  hello world  ")); 
        System.out.println();  
        //Test case 3
         System.out.println("Input:a good example");
        System.out.print("Output:");
        System.out.println(reverseWords("a good example"));  
        System.out.println();
        //Test case 4
        System.out.println("Input:    ");
        System.out.print("Output:");
        System.out.println(reverseWords("    "));  
        System.out.println();            
        //Test case 5
         System.out.println("Input:word");
        System.out.print("Output:");
        System.out.println(reverseWords("word"));              
    }
}