import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class mine {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line="";
    String cvsSplitBy = ";";
    String s1="";
    String s2="";
    String s3="";
    String[] data = null;
    String[] data1 = null;
    while ((line = in.readLine()) != null) {
     // System.out.println(line);
                
       data = line.split(";");
       s1= data[0];
       //   System.out.println(s1);
          s2= data[1];
         if (s1!=null){
        	 break;
         }
      
       
    }
    System.out.println(data[0]);
   
    
    
    	
    
  }
}