package oop1;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();
		// set iþlemi yazmak
		product1.setName("A Kahve Makinasý");
		product1.setDiscount(7);
		product1.setUnitePrice(7500);
		product1.setUnitsInStock(5);
		product1.setImageUrl("asdja");
		

		Product product2 = new Product();
		product2.setName("B Kahve Makinasý");
		product2.setDiscount(7);
		product2.setUnitePrice(7500);
		product2.setUnitsInStock(5);
		product2.setImageUrl("asdja");
		
		Product product3 = new Product();
		product3.setName("C Kahve Makinasý");
		product3.setDiscount(7);
		product3.setUnitePrice(7500);
		product3.setUnitsInStock(5);
		product3.setImageUrl("asdja");
		

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.getName());		
			}
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setCustomerNumber("654");
		individualCustomer.setId(10);
		individualCustomer.setPhone("5464564");
		individualCustomer.setFirsName("furk");
		individualCustomer.setLastName("kirt");
		CorporateCustomer corporateCustomer=new CorporateCustomer();
		corporateCustomer.setCompanyName("sds");
		corporateCustomer.setCustomerNumber("45346");
		corporateCustomer.setId(45456);
		corporateCustomer.setTaxName("hslkhfdlf");
		
		Customer[] customers= {individualCustomer,corporateCustomer};
		
	}

}
