package com.jie.entity;

public class Products {
	private Integer productID;
	private String product_name;
	private Double income_price;
	
//	private Integer providerID;
//	private String provider_name;
	private Providers provider;
	
//	private Integer categoryID;
//	private String category_name;
	private Categorys categorys;
	
	private Double sales_price;
	private String income_time;
	
	public Products() {
		// TODO Auto-generated constructor stub
	}
	
	public Products(Integer productID) {
		super();
		this.productID = productID;
	}

	
	
	public Products(Integer productID, String product_name) {
		super();
		this.productID = productID;
		this.product_name = product_name;
	}

	public Products(String product_name, Providers provider, Categorys categorys) {
		super();
		this.product_name = product_name;
		this.provider = provider;
		this.categorys = categorys;
	}

	public Products(String product_name, Double income_price, Providers provider, Categorys categorys,
                    Double sales_price, String income_time) {
		super();
		this.product_name = product_name;
		this.income_price = income_price;
		this.provider = provider;
		this.categorys = categorys;
		this.sales_price = sales_price;
		this.income_time = income_time;
	}

	public Products(Integer productID, String product_name, Double income_price, Providers provider, Categorys categorys,
                    Double sales_price, String income_time) {
		super();
		this.productID = productID;
		this.product_name = product_name;
		this.income_price = income_price;
		this.provider = provider;
		this.categorys = categorys;
		this.sales_price = sales_price;
		this.income_time = income_time;
	}

	public Integer getProductID() {
		return productID;
	}

	public void setProductID(Integer productID) {
		this.productID = productID;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public Double getIncome_price() {
		return income_price;
	}

	public void setIncome_price(Double income_price) {
		this.income_price = income_price;
	}

	public Providers getProvider() {
		return provider;
	}

	public void setProvider(Providers provider) {
		this.provider = provider;
	}

	public Categorys getCategorys() {
		return categorys;
	}

	public void setCategorys(Categorys categorys) {
		this.categorys = categorys;
	}

	public Double getSales_price() {
		return sales_price;
	}

	public void setSales_price(Double sales_price) {
		this.sales_price = sales_price;
	}

	public String getIncome_time() {
		return income_time;
	}

	public void setIncome_time(String income_time) {
		this.income_time = income_time;
	}

	@Override
	public String toString() {
		return "Products [productID=" + productID + ", product_name=" + product_name + ", income_price=" + income_price
				+ ", provider=" + provider + ", categorys=" + categorys + ", sales_price=" + sales_price
				+ ", income_time=" + income_time + "]";
	}

//	@Override
//	public String toString() {
//		return "Products [productID=" + productID + ", product_name=" + product_name + ", income_price=" + income_price
//				+ ", provider=" + provider.getProvider_name() + ", categorys=" + categorys.getCategory_name() + ", sales_price=" + sales_price
//				+ ", income_time=" + income_time + "]";
//	}
}
