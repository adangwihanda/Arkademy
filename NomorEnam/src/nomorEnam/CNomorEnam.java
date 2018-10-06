package nomorEnam;

public class CNomorEnam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String abjad = "abcdefghijklmnopqrstuvwxyz";
		
		// ditambah 1 karena array menghitung dari 0
		int m = abjad.indexOf("m")+1;
		
		System.out.print("Posisi huruf m dalam abjad adalah : "+m);
	}
}
