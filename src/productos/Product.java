package productos;

public class Product {
	// Declaraciones de campo de instancia
	private int number;
	private String name;
	private int qty;
	private double price;
	private boolean active ;
	
	public Product() {
		this.active = true;
	}
	// inicializar los campos con sus valores predeterminados
	public Product(String name, int qty, double price, int number) {
		this.name = name;
		this.number = number;
		this.qty = qty;
		this.price = price;
		this.active = true;
	}
	
	// m�todos para obtener valores de los campos
	public String getName() {
		return this.name;
	}
	public int getNumber() {
		return this.number;
	}
	public int getQty() {
		return this.qty;
	}
	public double getPrice() {
		return this.price;
	}
	public boolean isActive() {
		return active;
	}
	
	// m�todos para establecer valores de los campos
	public void setName(String name) {
		 this.name = name;
	}
	public void setNumber(int number) {
		 this.number = number;
	}
	public void setQty(int qty) {
		 this.qty = qty;
	}
	public void setPrice(double price) {
		 this.price = price;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	public String toString() {
		return "Item Number: " + getNumber() + "\n" +
				"Name: " + getName() + "\n" +
				"Quantity in Stock: " + getQty() + "\n" +
				"Price: " + getPrice() + "\n" + 
				"Stock Value: " + getInventoryValue() + "\n" +
				"Product status: " + (isActive() == true ? "Active" : 
															"Discontinued");
	}

	public double getInventoryValue() {
		return this.price * this.qty;
	}

 } // end Product
