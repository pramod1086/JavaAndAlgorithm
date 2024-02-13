package com.pramod.geekforGeeks;


public class PermutationsofgivenString {
    public static void main(String args[]){
        PermutationsofgivenString ls = new PermutationsofgivenString();
        String str = "ABC";
        ls.permutationsofgivenString("ABC",0,str.length()-1);

    }

    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    private void permutationsofgivenString(String str,int left,int right) {
        if (left == right)
            System.out.println(str);
        else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                permutationsofgivenString(str, left + 1, right);
                str = swap(str, left, i);
            }
        }
    }
}


