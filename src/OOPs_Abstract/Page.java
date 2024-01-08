package OOPs_Abstract;

public abstract class Page {
public abstract void title();
public abstract void url ();
public void pageLoadTime () {
	System.out.println("Page load time out = 10 secs ");
}
public final void logo () {//logo is same for all the pages
	System.out.println("Application logo");
}
	
//Constructor is allowed & call when the object of the child class is create--constructor overloading is also allowed.

public Page () {
	System.out.println("page constructor");
}
//constructor overloading
public Page(int a) {
	System.out.println("Page constructor " + a );
}	
	
	
	
	
	
	
	
	

}
