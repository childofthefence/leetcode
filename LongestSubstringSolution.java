public class LongestSubstringSolution {
    public int lengthOfLongestSubstring(String s) {
        //find every substring and put it in an array
        List<String> substrings = new ArrayList<String>();
        StringBuilder newSubstring;
        for(int i =0; i<s.length(); i++){
            newSubstring = new StringBuilder();
            newSubstring.append(s.charAt(i)); //start with the first char (always can be added)
            for(int j=i+1; j<s.length(); j++){
                if(newSubstring.toString().indexOf(s.charAt(j)) <0){ //check substring for the character
                    newSubstring.append(s.charAt(j));
                }else if(newSubstring.toString().indexOf(s.charAt(j))>=0){
                    break;
                }
            }
            substrings.add(newSubstring.toString());
        }
        
        
        int highCount=0;
        //find the longest substring in the arraylist
        for(int i=0; i<substrings.size(); i++){
            System.out.println(substrings.get(i));
            if(substrings.get(i).length() > highCount){
                highCount = substrings.get(i).length();
            }
        }
        return highCount;
        
    }
}