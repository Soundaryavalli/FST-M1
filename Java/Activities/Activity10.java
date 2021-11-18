package activities;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {

	public static void main(String[] args) {
		Set<String> hs = new HashSet<> ();
		 hs.add("Table");
		 hs.add("Chair");
		 hs.add("Pen");
		 hs.add("Scale");
		 hs.add("Pencil");
		 hs.add("Eraser");
		 
		 
System.out.println("The size of the hashset:" + hs.size());
hs.remove("Pen");
for(String i : hs)
System.out.println(i);
if ( hs.remove("Paint"))
{
	System.out.println("Removed");
}
else
{
System.out.println("Not available in the set");
}
System.out.println("is the item Scale available in the hashset:" + hs.contains("Scale"));
System.out.println("Update set:"+hs);
	}

}
