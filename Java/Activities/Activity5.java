package activities;

// Create Abstract class
abstract class Book 
{
	String title;

//Abstract method
abstract void setTitle(String s);

//concrete method
String getTitle() {
    return title;
}
}

class MyBook extends Book
{
	public void setTitle(String s) {
        title = s;
    }
}
public class Activity5 {

	public static void main(String[] args) {
		String title = "Harry Potter";
		MyBook newNovel= new MyBook();
		newNovel.setTitle(title);
		System.out.println(newNovel.getTitle());
			
	}

}
