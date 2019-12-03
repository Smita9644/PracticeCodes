package hashmap_codes;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {

	
	public HashMapTest() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args)
	{
		HashMap<Student,ReportCard> map=new HashMap<>();
		Student s=new Student("HM5800","smita");
		Student s2=new Student("HM5801","smita");
		Student s3=new Student("HM5802","smita1");
		Student s4=new Student("HM5803","smita2");
		Student s5=new Student("HM5804","smita3");
		Student s6=new Student("HM58046","smita3");
		Student s7=new Student("HM58047","smita3");
		Student s8=new Student("HM58048","smita3");
		Student s9=new Student("HM58049","smita3");
		Student s10=new Student("HM58014","smita3");
		Student s11=new Student("HM58024","smita3");
		Student s12=new Student("HM58034","smita3");
		Student s13=new Student("HM58044","smita3");
		Student s14=new Student("HM58054","smita3");
		Student s15=new Student("HM58064","smita3");
		Student s16=new Student("HM58074","smita3");
		Student s17=new Student("HM58084","smita3");
		Student s18=new Student("HM58094","smita3");
		map.put(s,new ReportCard());
	    map.put(s2,new ReportCard());
	    map.put(s3,new ReportCard());
	    map.put(s4,new ReportCard());
	    map.put(s5,new ReportCard());
	    map.put(s6,new ReportCard());
	    map.put(s7,new ReportCard());
	    map.put(s8,new ReportCard());
	    map.put(s9,new ReportCard());
	    map.put(s10,new ReportCard());
	    map.put(s11,new ReportCard());
	    map.put(s12,new ReportCard());
	    map.put(s13,new ReportCard());
	    map.put(s14,new ReportCard());
	    map.put(s15,new ReportCard());
	    map.put(s16,new ReportCard());
	    map.put(s17,new ReportCard());
	    map.put(s18,new ReportCard());
       System.out.println(map.size());
       Iterator<Map.Entry<Student, ReportCard>> itr = map.entrySet().iterator(); 
       
       while(itr.hasNext()) 
       { 
            Map.Entry<Student, ReportCard> entry = itr.next(); 
            System.out.println("Key = " + entry.getKey().id +  
                                ", Value = " + entry.getValue().MathScore); 
       } 
    
} 

	
	
}
