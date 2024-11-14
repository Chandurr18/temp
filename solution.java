//Complete this code or write your own from scratch
import java.util.*;

class Solution{
	public static void main(String []argh)
	{
        Map<String,Integer> record = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=scan.nextLine();
			int phone=scan.nextInt();
            record.put(name,phone);
			scan.nextLine();
		}
		while(scan.hasNext())
		{
			String query=scan.nextLine();
			if(record.containsKey(query)){
				System.out.println(query+"="+record.get(query));
			}
			else{
				System.out.println("Not found");
			}
			
		}
        scan.close();
	}
}
