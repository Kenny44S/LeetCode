public class LongestPalindromicSubString {

    public static void main(String[] args)
    {
        String str = "jhfuvghjjhgfrhababahasdfreyurefmkjn";     // Target String in which we find the palindrome

        final int MINIMUM = 3;                                  // Palindromic string should be minimum of length 3 | Smaller will be ignored
        char[] chars = new char[str.length()];                  // Make an character array of length = above string
        String substr;                                          // to store chunks from the above string to check further whether its palindrome or NOT
        int longestLength = 0;
        String longestString = "";                              // Longest palindrome in the above string will be stored in this variable


        System.out.println("Original String:" + str);
        System.out.println("------------------------------------");

        for(int i=0; i < str.length(); i++)
        {
            chars[i] = str.charAt(i);
        }

        for(int j=0; j < chars.length; j++)
        {
            for(int k=j+1; k < chars.length; k++)
            {
                if(chars[j] == chars[k] && (k-j) > MINIMUM)
                {
                    substr = str.substring(j, k+1);
                    System.out.println("Checking string: " + substr);
                    if(check(substr))
                    {
                        System.out.println(substr + " is a Palindrome.");
                        if(substr.length() > longestLength)
                        {
                            longestLength = substr.length();
                            longestString = substr;
                        }
                    }else
                    {
                        System.out.println("FALSE");
                    }
                    System.out.println("--------------------------");
                }
            }
        }
        System.out.println("Longest Palindrome is: " + longestString);
    }

    public static boolean check(String str)                                // 
    {
        int LEFT = 0;
        int RIGHT = str.length()-1;
        int i, j;

        for(i=LEFT, j=RIGHT; i < j; i++,j--)
        {
            System.out.println("L: " + LEFT + " - " + str.charAt(LEFT) + " | R: " + RIGHT + " - " + str.charAt(RIGHT));
            if(str.charAt(LEFT) != str.charAt(RIGHT))
            {
                return false;                                             // String is NOT Palindrome
            }
            LEFT++;
            RIGHT--;
        }
        return true;                                                      // String IS Palindrome
    }
}

