package builderpattern;

public class ShoppingTest {
//used by single user so only one object is enough ,if we have 100 user/laptop that 100 object will be created.
	public static void main(String[] args) {
		Ecommerce e = new Ecommerce();
		e.login("pooja@gmail.com", "pooja123")
		    .search("Laptop")
		        .selectProduct("Macbook")
		            .addToCart("Macbook")
				        .doPayment("1234 4567 7667 9888", 322) 
				            .generateOrderID()
				                .logout();
		
		
		
		//
		e.login("pooja@gmail.com", "pooja123")
	        .search("shoes", "red")
	          .selectProduct("Nike AirMax")
	             .logout();
		//
	
	e.login("poojakhatiyan@gmail.com","beautifulliar")
	   .search("Mobile","Pink")
         .selectProduct("Iphone 15")
           .addToCart("Iphone 15")
             .logout();
	
	
	e.login("poojakhatiyan@gmail.com","beautifulliar")
	 .logout();
	
	
	e.login()
	 .search("Mobile","Pink")
        .selectProduct("Iphone 15")
           .addToCart("Iphone 15")
              .logout()
                 .search("Laptop")
		            .selectProduct("Macbook")
		                .addToCart("Macbook")
				           .doPayment("1234 4567 7667 9888", 322) 
				               .generateOrderID()
				                .logout();
	
	}

}
