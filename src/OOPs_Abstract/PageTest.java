package OOPs_Abstract;

public class PageTest {

	public static void main(String[] args) {
LoginPage lp = new LoginPage(10);
lp.url();
lp.title();
lp.pageLoadTime();
lp.logo();
lp.doLogin("admin", "admin@123");

System.out.println("----------------");
//Page p = new Page ();//Cannot instantiate the type Page--abstract class can't be instantiate
//top casting 
Page p = new LoginPage ();
p.url();
p.title();
p.pageLoadTime();
p.logo();
//p.doLogin();--reference type check fails

//down casting--for abstract class instantiation not applicable



	}

}
