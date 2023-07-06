public class Decimal2Octal
{
	public static void main(String[] args) {
	    int n=5867,i=0;
	    int[] r=new int[40];
	    while(n>=1){
	        r[i++]=n%8;
	        n=n/8;
	    }
	    
	    for(int j=r.length-1;j>=0;j--)
	    {
	        System.out.print(r[j]);
	    }
	}
}
