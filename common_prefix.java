public class common_prefix {
    public static void main(String[] args) {
        String[] words = new String[]{
            "flower", "fight", "flight"
        };

        common_prefix solution = new common_prefix();
        String result = solution.longestCommonPrefix(words);
        if (result.isEmpty()){
 System.out.println("No common prefixes");
        }else{
        System.out.println("Common Prefixes:" + result);
    }
    }
    public String longestCommonPrefix(String[] strs){
        //check position of the characters
        for (int i = 0; i < strs[0].length() ; i++) {
            System.out.println(strs[0].charAt(i));
        //check if the characters had the same prefixes
            for (int j = 1; j < strs.length ; j++) {
                System.out.println(strs[j]);
               if(i >= strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i)){//added i >= strs[j].length() without it, it will throw out of bound
                return strs[0].substring(0,i);
               }
            }
        }
        return strs[0];
    }
}
