import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class main1 {
  /**
   * Iterate through each line of input.
   */
	  public static void main(String[] args) throws IOException {
		    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		    BufferedReader in = new BufferedReader(reader);
		    String line;
		    int element_req = 0;
		    while ((line = in.readLine()) != null) {
		    //  System.out.println(line);
		    	element_req= Integer.parseInt(line);
		    	break;
		    }
		    
		    StringBuilder sb = new StringBuilder();
		String str = sb.append("0").toString();
		System.out.println(str);
		for (int i=0;i<element_req; i++)
		{

		  }
		}
		}