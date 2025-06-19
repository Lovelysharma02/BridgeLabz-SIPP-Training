
public class profitandloss {
	public static void main (String[]args) {
		int cost_price=129;
		int selling_price=191;
		
		
		if(selling_price>cost_price) {
			float profit=selling_price-cost_price;
			System.out.println("profit is INR"+ profit+"profit percentage is"+ profit/cost_price*100 );
		}else {
			float loss=cost_price-selling_price;
			System.out.println("loss is INR"+ loss +"loss percentage is"+ loss/cost_price*100 );
			
			
		}

}
