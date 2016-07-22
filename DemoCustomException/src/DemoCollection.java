import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class DemoCollection {

	public static void main(String[] args) {

		System.out.println("--------Tree Map------");

		TreeMap<String, Double> salary = new TreeMap<>();
		salary.put("A", 434.33);
		salary.put("Y", 4234.33);
		salary.put("K", 766.33);
		salary.put("D", 970.33);
		salary.put("Z", 600.5);

		Set set = salary.entrySet();
		Iterator i = set.iterator();

		while (i.hasNext()) {
			Map.Entry<String, Double> map = (Entry<String, Double>) i.next();
			
			System.out.print("key : "  + map.getKey() + " - ");
			System.out.println(" value : " + map.getValue());
		}
		
		System.out.println("--------------------");
		
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy:hh-mm-ss");
		String dateString = format.format(date);
		System.out.println(dateString);
		
		System.out.println("Current time in Millis : " + Calendar.getInstance().getTimeInMillis());
		
		String chuoi = "Hello Java Function";
		System.out.println(chuoi.indexOf("a")); //vi tri xuat hien dau tien cua chu "a"
		System.out.println(chuoi.lastIndexOf("o")); //vi tri xuat hien cuoi cung cua chu "o"
		String name = "  Kami ah       ";
		System.out.println(name.trim());
		
		String testString = "";
		if(testString.trim().isEmpty()){
			System.out.println("Chuoi nay rong");
		}else{
			System.out.println("Chuoi hop le");
		}
		
		System.out.println("---String Tokenizer----");

		String test = "Demo+String+Tokenizer";
		StringTokenizer sk = new StringTokenizer(test, "+", true);
		while (sk.hasMoreTokens()){
			String token = sk.nextToken();
			System.out.println(token);
		}
		
		System.out.println("---------String Builder----------");
		
		StringBuilder builder = new StringBuilder();
		builder.append("How to use ");
		builder.append("\n");
		builder.append("GitHub");
		
		System.out.println(builder.toString());
	}

}
