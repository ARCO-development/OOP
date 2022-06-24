package ex1;

import java.util.Stack;

public class Inverte {
    public static void main(String[] args) {
    
        String s = "abcde";
        String[] stringArray = new String[s.length()];
        Stack<String> stringStack = new Stack<>();

    for (int i = 0; i < s.length(); i++)
    {
        stringArray[i] = Character.toString(s.charAt(i));
    }

    for (int j = 0; j < s.length(); j++)
    {
        stringStack.push(stringArray[j]);
    }


    for (int a = 0; a < s.length(); a++)
    {
        System.out.print(stringStack.pop());
    }
    }
}