
public class Sorting2sorted_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,3,5,8};
		int[] b= {2,4,6,7,9,10,11};
		int len=a.length+b.length;
			int []newarray = new int [len];
			int j=0;
			int k=0;
			int i=0;
			//Max (a.len , b.len)
			
			while(i<a.length && j<b.length)
				{
					
			    if(a[i]<b[j])
			    {
			        newarray[k]=a[i];
			        k++;
			        i++;
			    }
			    else 
			    {
			        newarray[k]=b[j];
			        j++;
			        k++;
			    }
				
				}
				
					
				
				while(i>=a.length&& k<len)
				{
					//System.out.println(z+"z value");
					System.out.println("k value "+k+ "j value" +j);
					
					 newarray[k]=b[j];
					 System.out.println(newarray[k]);
				        j++;
				        k++;
				}
				while(j>=b.length && k<len)
				{
					newarray[k]=a[i];
			        i++;
			        k++;
				}
					
				
			
			for (int u=0;u<newarray.length; u++)
			{
				System.out.println(newarray[u]);
			}

		}
		}