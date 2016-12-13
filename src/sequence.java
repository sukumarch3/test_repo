/**
 * 
 */

/**
 * @author sukumar-4681
 *
 */
public class sequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("test");
		int n = 5;
		String number = "1";
		StringBuffer temp;
		for (int i = 0; i < n; i++) {
			temp = new StringBuffer("");
			for (int j = 0; j < number.length();) {

				int j2 = j + 1;
				int count = 1;
				for (; j2 < number.length(); j2++) {
					if (number.charAt(j) == number.charAt(j2)) {
						count++;
						// System.out.println("count increases : " + count);
						continue;
					} else
						break;
				}
				// System.out.println("count : " + count + "\nchar:" +
				// number.charAt(j));
				temp.append(count);
				temp.append(number.charAt(j));
				// System.out.println("Temp String" + temp);
				j = j2;

			}
			number = temp.toString();
			System.out.println("number : " + number);
		}

	}

	public static String getSeq(int n) {
		return null;
	}

}
