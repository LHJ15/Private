package p01;


class Buyer{
	private int MyMoney; 
	private int AppleCnt;     
	
	public Buyer(int myMoney, int appleCnt) {
		MyMoney = myMoney;
		AppleCnt = appleCnt;
	}
	
	public void Payment(Seller seller,int money )
	{
		
		MyMoney-=money;
		
		int cnt= seller.Receive(money);
	
		AppleCnt+=cnt;
	}
	public void ShowInfo() {
		
		System.out.println("-----구매자정보------");
		System.out.println("보유 금액 : "+ MyMoney);
		System.out.println("사과 개수 : "+ AppleCnt);
	}
}
	
	



class Seller{
	private int MyMoney;
	private int AppleCnt;
	public int Price;
	
	public Seller(int myMoney, int appleCnt, int price) {
		MyMoney = myMoney;
		AppleCnt = appleCnt;
		Price = price;
	}
	public int Receive(int money) {
		
		MyMoney+=money;
		
		int revcnt=money/Price;
		AppleCnt-=revcnt;
		return revcnt;
	}
	public void ShowInfo() {
	
		System.out.println("-----판매자정보-----");
		System.out.println("보유 금액 : "+ MyMoney);
		System.out.println("사과 개수 : "+ AppleCnt);
		System.out.println("개당 가격 : "+ Price);

	}
}
	
	
	
	

public class TT02 {


	public static void main(String[] args) {
		
		
				Seller 하이브1 = new Seller(100000,100,1000);//보유금액,사과개수,개당가격
				Buyer 아이브 = new Buyer(10000,0);	//보유금액,사과개수
				Buyer 르세라핌 = new Buyer(20000,0);
				Buyer 뉴진스 = new Buyer(30000,0);
				
		
		        아이브.Payment(하이브1,2000);
		        르세라핌.Payment(하이브1,5000);
		        뉴진스.Payment(하이브1, 3000);
		        
		        하이브1.ShowInfo();
		        아이브.ShowInfo();
		        르세라핌.ShowInfo();
		        뉴진스.ShowInfo();
		        
		        
			    
		
	
				
				
				
	
		
				
	}

}
  
  