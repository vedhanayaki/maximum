package player;
import java.util.Scanner;
public class Greatestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of array element");
int n=s.nextInt();
int[]a=new int[n];
System.out.println("Enter the array element");
for(int i=0;i<n;i++){
	a[i]=s.nextInt();
}
max=a[0];
for(int i=0;i<n;i++){
	if(max>a[i]){
		max=a[i];
	}
	}
System.out.println("The Maximum Number is:"+max);
	}

}
