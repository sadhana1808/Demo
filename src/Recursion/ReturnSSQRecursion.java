package Recursion;

import java.util.*;
//finding Subsequences
public class ReturnSSQRecursion {
    /*
        s = "abc"
     */
    static ArrayList<String> getSSQ(String s){
        ArrayList<String> ans = new ArrayList<>();
        // base case
        if(s.length() == 0){
            ans.add("");
            return ans;
        }

        char curr = s.charAt(0); //a
        ArrayList<String> smallAns = getSSQ(s.substring(1));  // [ "bc", "b", "c", ""]
        // ans = ["bc", "b", "c", "", "abc", "ab", "ac", "a"]
        for(String ss: smallAns){
            ans.add(ss); //bc
            ans.add(curr + ss); // abc
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<String> ans = getSSQ("abc");
        for (String ss : ans){
            System.out.println(ss);
        }
    }
}
