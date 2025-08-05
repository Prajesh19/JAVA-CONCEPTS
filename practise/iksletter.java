package practise;

import java.util.Scanner;


public class iksletter {
	public static void main (String[] arg) {
        Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String  str = scan.nextLine();
	    char[] arr = str.toCharArray();	
		for (int i=0; i<str.length();i++) {
			if(arr[i]=='c'|| arr[i]=='C') {
				
				if(arr[i+1]=='e' || arr[i+1]=='E') {
					if(arr[i+2]=='s'|| arr[i+2]=='S') {
						System.out.print("yes");
						break;
					}
					else {
						System.out.print("no");
						break;
					}
				}
				else {
					System.out.print("no");
					break;
				}
			}
			else {
				System.out.print("no");
				break;
			}
		}
		
		
		
		
	}
	}

