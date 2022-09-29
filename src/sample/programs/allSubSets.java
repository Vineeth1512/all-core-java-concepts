package sample.programs;

public class allSubSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String str="FUN"; int n=str.length(); int temp=0; String a[]=new
		 * String[n*(n+1)/2]; for(int i=0;i<n;i++) { for(int j=i;j<n;j++) {
		 * a[temp]=str.substring(i,j+1); temp++; } }
		 * System.out.println("all subsets for given string"); for(int
		 * i=0;i<a.length;i++) { System.out.println(a[i]);}
		 */
		String s = "vineethkumar";
		String str = "";
		str = (s.charAt(0) + "").toUpperCase();
		for (int i = 1; i < s.length(); i++) {
			str = str + (s.charAt(i) + "").toLowerCase();

		}
		System.out.println(str);

	}

}
