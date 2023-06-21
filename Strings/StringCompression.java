package Strings;

public class StringCompression {

    public static String string_compression(String str)
    {
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            sb.append(ch);
            int count=1;
            while( ((i+1) <= (str.length()-1 )) && (str.charAt(i+1) == ch))
            {
                count = count +1;
                i++;
            }
            if(count>1)
            {
                sb.append(count);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aaaabbbcdddefff";
        System.out.println(string_compression(str));
    }
}
