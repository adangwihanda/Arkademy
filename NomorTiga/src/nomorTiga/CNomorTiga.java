package nomorTiga;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CNomorTiga {

	public static void main(String[] args) {
		String strTglAwal = "2018/10/05";
        String strTglAkhir = "2018/11/01";
        DateFormat dateAwal = new SimpleDateFormat("yyyy/MM/dd");
        DateFormat dateAkhir = new SimpleDateFormat("yyyy/MM/dd");
         
       try {
    	   	Date tglAwal = dateAwal.parse(strTglAwal);
    	    Date tglAkhir = dateAkhir.parse(strTglAkhir);
             
            Date TGLAwal = tglAwal;
            Date TGLAkhir = tglAkhir;
            Calendar kalender1 = Calendar.getInstance();
            kalender1.setTime(TGLAwal);
            
            Calendar kalender2 = Calendar.getInstance();
            kalender2.setTime(TGLAkhir);
             
            String hasil = String.valueOf(hitungHari(kalender1, kalender2));
             
            System.out.println("Tanggal Awal  = " +strTglAwal);
            System.out.println("Tanggal Akhir = " +strTglAkhir);
            System.out.println("------------------------------");
            System.out.println("Selisih = " +hasil+ " hari");
             
       } 	catch (ParseException e) {
        	}
	    }
		
	private static long hitungHari(Calendar tanggalAwal, Calendar tanggalAkhir) {
		long JumlahHari = 0;
		Calendar tanggal = (Calendar) tanggalAwal.clone();
		while (tanggal.before(tanggalAkhir)) {
			tanggal.add(Calendar.DAY_OF_MONTH, 1);
			JumlahHari++;
		}
		return JumlahHari;
	}
}