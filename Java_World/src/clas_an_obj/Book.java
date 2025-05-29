
 class Book {
	 StringBuilder title;  // String builder is mutable content can be changedafter creation.
	 
	 //Normal constructor
	 Book(StringBuilder title)
	 {
		 this.title=title;
		 
	 }
	 //shallow copy constructor 
	 Book(Book b)
	 {
		 this.title=b.title; //same reference
	 }
	 
	 //Deep copy constructor
	 Book(Book b,boolean deep)
	 {
		 this.title= new StringBuilder(b.title.toString());
	 }
	void showTitle()
	{
		System.out.println("Title: "+title);
	}
	public static void main(String[] args) {
		StringBuilder originalTitle = new StringBuilder("Java Programming");
		
  //orginal object
		Book book1 = new Book(originalTitle);
		//shallow copy
		Book book2 =new Book(book1);
		//Deep copy 
		Book book3 = new Book(book1,true);
		

        // Modify the original title
        originalTitle.append(" - Beginner");

        System.out.println("After modifying the original title:\n");

        System.out.print("Book1: ");
        book1.showTitle();

        System.out.print("Book2 (Shallow Copy):  ");
        book2.showTitle(); // Will be affected (same reference)

        System.out.print("Book3 (Deep Copy):  ");
        book3.showTitle(); // Will not be affected
		
}
}
