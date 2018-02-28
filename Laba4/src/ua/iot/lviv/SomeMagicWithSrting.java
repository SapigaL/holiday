package ua.iot.lviv;

import java.io.*;

public class SomeMagicWithSrting {
	public String readInputText() {
		try {
			BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter Text \n");
			return a.readLine();
		} catch (IOException errors) {
			System.out.println(errors.getMessage());
			return null;
		}
	}

	public String processText(String inputText) {

		String[] result = inputText.split("\\s");
		String result1 = "";
		int number;
		for (int i = 0; i < result.length; i++) {
			boolean numeric = false;
			numeric = result[i].matches("-?\\d+(\\.\\d+)?"); // check if result[i] consist of numbers
			if (numeric) {
				number = Integer.parseInt(result[i]); // if true convert into int and check condition
				if (number >= 0 && number <= 25) {
					result[i] = "EXPEL";
				}
				if (number >= 26 && number <= 49) {
					result[i] = "COMISSION";
				}
				if (number >= 50 && number <= 70) {
					result[i] = "SATISFACTORY";
				}
				if (number >= 71 && number <= 87) {
					result[i] = "GOOD";
				}
				if (number >= 88 && number <= 100) {
					result[i] = "EXCELLENT";
				}
				if (number >= 100 || number <= 0) {
					result[i] = "WHAT DO YOU WRITE?!?!?!?!?";
				}
				result1 += result[i] + " ";
			} else
				result1 += result[i] + " ";
		}

		return result1;

	}
	public void showResult(String processedString) {
        System.out.println("Result: \n" + processedString);
    }

	// public static void main(String[] args) {
	// Scanner scan = new Scanner(System.in);
	// String text = scan.nextLine(); //read from console
	// String[] result = text.split("\\s");
	// // StringTokenizer tokenizer = new StringTokenizer(str, "
	// .,;:!@#$%^&*()+=_");

	// }

}
