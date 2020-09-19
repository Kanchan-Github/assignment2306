package itech2306.operation;
package itech2306.domain;


	// Menu option 3
	
	@Override
	protected void performDialog() {
	//	System.out.println("Not Implemented Yet");
		Service service = null;
		switch (type) 
		{
			case():
				service = new Service();
				break;
			case(prePaid):
				service = new PrePaid();
				break;
			case(postPaid):
				service = new PostPaid();
				break;
			case(landLinePhone):
				service = new LandLinePhone();
				break;
			case(internet):
				service = new Internet();
				break;
			
			case(END):
				break;				
		}
		if (property != null) {
			service(type);
			service.plan();
			System.out.println("Service Selected: " + service +  "\n");
		}
	}
	

}
