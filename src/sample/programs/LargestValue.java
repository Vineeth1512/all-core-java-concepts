package sample.programs;

public class LargestValue {
//WAP TO FIND THE LARGEST VALUE OR SMALLESTVALUE
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 50;
		int b = 10;
		int c = 7;// (a>b)?a:b;

		int d = 40;// (a>b&&a>c)?a:(b>c)? b:c;

		int e = 9;// (a>b&&a<c&&a>d)?a:(b>c && b>d)?b:(c>d)?c:d;
		int f = 12;// (a>b&&a<c&&a>d)?a:(b>c && b>d)?b:(c>d&& c>e)?d:e;
		int g = 11;
		/*
		 * int res=(a>b&&a<c&&a>d&&a>e&&a>f&&a>g)?a :(b>c && b>d&&b>e&&b>f&&b>g)?b
		 * :(c>d&&c>e&&c>f&&c>g)?c :(d>e&&d>f&&d>g)?d :(e>f&&e>g)?e :(f>g)?f :g;
		 * System.out.println(res);
		 */

		int res = (a < b && a < c && a < d && a < e && a < f && a < g) ? a
				: (b < c && b < d && b < e && b < f && b < g) ? b
						: (c < d && c < e && c < f && c < g) ? c
								: (d < e && d < f && d < g) ? d : (e < f && e < g) ? e : (f < g) ? f : g;
		System.out.println(res);

	}

}
