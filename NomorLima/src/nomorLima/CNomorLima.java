package nomorLima;

public class CNomorLima {

	public static void main(String[] args) {
		
		char[] arkademy = {'a','r','k','a','d','e','m','y'};
		
		int Count = 0;	   
		for (int i=0; i<arkademy.length; i++) {
			if (arkademy[i] == 'a') 
			Count++;	   
		}	   
		
		System.out.println("Jumlah huruf a pada kata arkademy : "+Count);	
	}
}
