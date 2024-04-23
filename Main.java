// Main Class File
public class Main {
	
	public static void main(String[] args) {
		int n=1;
		for (int r=1; r<=10; r++){
		    for(int c=1; c<=10; c++){
		        if(r==1 || r==10)
		        System.out.print("====");
		        else if(c==1 || c==10)
		        System.out.print(" || ");
		        else
		        System.out.printf(" %2d ",n++);
		        }
		        System.out.print("\n");
		}
	

	}
}