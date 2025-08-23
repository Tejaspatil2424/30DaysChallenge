public class Challenge8 {

    public String findPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0]; 
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {  
                prefix = prefix.substring(0, prefix.length() - 1);  
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        //case study 1
        Challenge8 obj = new  Challenge8();
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + obj.findPrefix(strs1));

        //Case study 2
         String[] strs2 = {"dog", "racecar", "car"};
        System.out.println("Longest Common Prefix: " + obj.findPrefix(strs2));

        //Case study 3
        String[] strs3 = {"apple", "ape", "april"};
        System.out.println("Longest Common Prefix: " + obj.findPrefix(strs3));

        //Case study 4
        String[] strs4 = {""};
        System.out.println("Longest Common Prefix: " + obj.findPrefix(strs4));

        //Case study 5
        String[] strs5 = {"alone"};
        System.out.println("Longest Common Prefix: " + obj.findPrefix(strs5));
    }
}
