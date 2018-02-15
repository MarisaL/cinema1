
public class total {
	
	public void total(int TicketType, int Quantity) throws Exception {
	
	tickets T = new tickets();
	T.prices();
	
	int StandardP = 8; 
	int OAPP = 6;
	int StudentP = 6;
	int ChildP = 4;
	int price = 0;
	
	switch (TicketType) {
	
	case 1: price = StandardP;
			break;
	case 2: price = OAPP;
			break; 		
	case 3: price = StudentP;
			break;
	case 4: price = ChildP;
			break;
	}

	}

}
