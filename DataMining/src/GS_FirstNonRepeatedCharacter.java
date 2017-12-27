
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Neelabh
 */
public class GS_FirstNonRepeatedCharacter {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter input string");
        String string=scan.next();
        int len=string.length();
        HashMap<Character, Integer> hashMap=new HashMap<Character, Integer>();
        //First Scan
        for(int i = 0; i <len;i++){
            char currentCharacter=string.charAt(i);
            if(!hashMap.containsKey(currentCharacter)){
                hashMap.put(currentCharacter, 1);
            }
            else{
                hashMap.put(currentCharacter, hashMap.get(currentCharacter)+1);
            }
        }
        // Second Scan
        boolean flag=false;
        char firstNonRepeatingChar = 0;
        for(int i=0;i<len;i++){
                char c=string.charAt(i);
                if(hashMap.get(c)==1){
                    flag=true;
                    firstNonRepeatingChar=c;
                    break;
                }
        }
        if(flag==true)
            System.out.println("firstNonRepeatingChar is "+firstNonRepeatingChar);
        else
            System.out.println("There is no such type of character");
    }    
}

/////////////////////////////////////////////////////////
/*Method 2 using single loop
 // using indexof and last index of 

import java.util.Scanner;
public class firstoccurance {
public static void main(String args[]){
char [] a ={'h','h','l','l','o'};
//Scanner sc=new Scanner(System.in);
String s=new String(a);//sc.next();
char c;
int i;
int length=s.length();
for(i=0;i<length;i++)
{
    c=s.charAt(i);
    if(s.indexOf(c)==s.lastIndexOf(c))
    {
        System.out.println("first non repeating char in a string   "+c);
        break;
    }
    else if(i==length-1)
    {
        System.out.println("no single char");
    }
}
}
}

*/
