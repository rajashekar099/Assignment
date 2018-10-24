package Inheritance;

 class Published1 extends AuthorPublished {

	private String AuthorName;
	private char AuthorGender;
	private String AuthorEmail;
	private String BookName;
	private int NoOfPagesInBook;
	

	public String getAuthorName() {
		return AuthorName;
	}

	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}

	public char getAuthorGender() {
		return AuthorGender;
	}

	public void setAuthorGender(char authorGender) {
		AuthorGender = authorGender;
	}

	public String getAuthorEmail() {
		return AuthorEmail;
	}

	public void setAuthorEmail(String authorEmail) {
		AuthorEmail = authorEmail;
	}

	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	public int getNoOfPagesInBook() {
		return NoOfPagesInBook;
	}

	public void setNoOfPagesInBook(int noOfPagesInBook) {
		NoOfPagesInBook = noOfPagesInBook;
	}

		
}
