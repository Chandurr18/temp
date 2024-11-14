
//Complete this code or write your own from scratch
import java.util.*;

class Solution {
	public static void main(String[] argh) {
		Stack<Character> stack = new Stack<>();
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String str = scan.nextLine();
			boolean flag = true;
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (ch == '(' || ch == '[' || ch == '{') {
					stack.push(ch);
				} else if ((ch == ')' || ch == '}' || ch == ']')) {
					if (stack.isEmpty()) {
						flag = false;
						break;
					}
					char topEle = stack.pop();
					if ((ch== ')' && topEle!='(') || (ch== ']' && topEle!='[') || (ch== '}' && topEle!='{')) {
						flag = false;
						break;
					}
				}
			}
			if (flag && stack.isEmpty()) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}

		}

		scan.close();
	}
}
