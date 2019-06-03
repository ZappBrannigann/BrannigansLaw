package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice;
		bookTitle = "The Lord of the Rings";
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word " + wordChoice);
		}
		String browser = "Chrome";
		/* (this would not work, because of case sensitivity)
		if browser == "chrome"; */
		if (browser.equalsIgnoreCase("chrome");
		System.out.println("The browser is Chrome");
		
	}

}
