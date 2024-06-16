public class Product{
	double price;

	public Product(double price)
	{
		this.price = price;
	}
	public static void main(String[] args)
	{
		Product p1 = new Product(23.45);
		Product p2 = new Product(43.75);
		Compare c = new Compare();
		Product d = c.compareoperator(p1,p2);
		System.out.println("price="+d.price);
	}
}


class Compare{
	public Product compareoperator(Product p1,Product p2)
	{
		if (p1.price < p2.price)
		{
			System.out.println("p2");
			return p2;
		}
		else
			System.out.println("p1");
			return p1;
	}
	
}

