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
		
		MyMoney-=money;     //마이머니에서 머니만큼 차감
		
		int cnt= seller.Receive(money);          //셀러에게 돈 전달   //셀러러부터 사과갯수받기!!
	
		AppleCnt+=cnt;                  //사과개수 Cnt누적
	}
	
	public void ShowInfo() {                                 //속성 정보 Showinfo에출력
		
	
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
	public int Receive(int money) {          //머니누에적
		
		MyMoney+=money;                       //Mymomey에 money 누적
		
		int revcnt=money/Price;               //money에 해당하는 만큼 사과개수를 계산한다  
		
		AppleCnt-=revcnt;                      // AppleCnt에서 계산된 만큼의 사과개수를 차감
		
		return revcnt;                        //계산된 사과개수리턴
		                                    
	}
	public void ShowInfo() {
	
		System.out.println("-----판매자 정보-----");
		System.out.println("보유 금액 : "+ MyMoney);
		System.out.println("사과 개수 : "+ AppleCnt);
		System.out.println("개당 가격 : "+ Price);

	}
}
	

public class TT02 {


	public static void main(String[] args) {
		
		
				Seller 방시혁 = new Seller(100000,100,1000);     //보유금액,사과개수,개당가격
				Buyer BTS = new Buyer(10000,0);	        
				Buyer 르세라핌 = new Buyer(20000,0);        //보유금액,사과개수
				Buyer 뉴진스 = new Buyer(30000,0);				
		
		        BTS.Payment(방시혁,2000);
		        르세라핌.Payment(방시혁,5000);
		        뉴진스.Payment(방시혁, 3000);		               //돈지불한만 큼 사과 Get
		   
		        방시혁.ShowInfo();
		    	System.out.println("-----구매자 정보------");     //출력
		    	System.out.println("-BTS-");
		        BTS.ShowInfo();	
		    	System.out.println("-르세라핌-");
		        르세라핌.ShowInfo();
		    	System.out.println("-뉴진스-");
		        뉴진스.ShowInfo();
		   
		       //1
		        
		        
		        
		        
			    
		
	
				
				
				
	
		
				
	}

}
  
  

  
  