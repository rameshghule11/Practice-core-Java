package string;

public class RevreseEachWord {

//	reverse String without inbuilt function
//	i/p => "java is good language"
//	o/p=> "avaj si doog egaugnal"

	

	

		public static void main(String[] args) {
			String str = "java is good language";
			reverse(str);
		}

		private static void reverse(String str) {
			String [] words =str.split(" ");
			for(String word : words) {
				reverseWord(word);
			}
		}

		private static void reverseWord(String word) {
			int f = 0, l = word.length()-1;
			char [] arr= word.toCharArray();
			char temp;
			while(f<l) {
				temp = word.charAt(f);
				arr[f]=word.charAt(l);
				arr[l]=temp;
				f++;
				l--;
			}
			System.out.print(arr);
			System.out.print(" ");
		}

	}
	

