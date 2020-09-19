package domain2;


public  abstract class Customer {
	// Each customer should have a billing contract 
	
	// Each customer should have a unique ID.
	
	// Other fields will be required as well.
	private int customerId;
	private String customerName;
	private String customerAddress;
	private int customerPostCode;
	private String customerBusinessName;
	private int customerBusinessResponsibleContact;
	private String customerService;
	
	
	/**
	 * Reports the name of the customer
	 * @return
	 */
	public int getId()
	{
		return customerId;
	}
		
	public void setId(int id) {
			this.customerId = id;
		}
	public String getName()
	{
		return customerName;
	}
		
	public void setName(String name) {
			this.customerName = name;
		}
	public String getAddress()
	{
		return customerAddress;
	}
		
	public void setAddress(String address) {
			this.customerAddress = address;
		}
	
	public int getPostCode() {
		return customerPostCode;
	}

	public void setPostcode(int postCode) {
		this.customerPostCode = postCode;
	}
	
	/**
	 * Sets the name of the customer to something new.
	 * @param newName The name to store for the customer from now on.
	 */

	// Incomplete. Should display summary information about the customer.
	// updated toString method
	@Override
	public String toString() {
		return "Customer [id=" + customerId + ", name=" + customerName + "address" + customerAddress + ",postcode=" + customerPostCode+ "]";
	}
	
	
	public String getBusinessName()
	{
		return customerBusinessName;
	}
		
	public void setBusinessName(String businessName) {
			this.customerBusinessName = businessName;
		}
	public int getBusinessResponsibleContact()
	{
		return customerBusinessResponsibleContact;
	}
		
	public void setBusinessResponsibleContact(int businessResponsibleContact) {
			this.customerBusinessResponsibleContact = businessResponsibleContact;
		}
	public String getService()
	{
		return customerService;
	}
		
	public void setService(String service) {
			this.customerService = service;
		}

	protected abstract String setName();
	
}
