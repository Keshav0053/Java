package School;
import java.util.HashMap;
public class SchooldetailArrlist {
    public static void main(String[] args) {
        HashMap<Integer,Schooldetail> std_detail = new HashMap<Integer,Schooldetail>();

        std_detail.put(1,new Schooldetail("KCCITM",10000,1000,"Keshav",2));
        std_detail.put(2,new Schooldetail("KCCITM",10000,1000,"Keshav",2));
        std_detail.put(3,new Schooldetail("KCCITM",10000,1000,"Keshav",2));
        std_detail.put(4,new Schooldetail("KCCITM",10000,1000,"Keshav",2));
        std_detail.put(5,new Schooldetail("KCCITM",10000,1000,"Keshav",2));
        std_detail.put(6,new Schooldetail("KCCITM",10000,1000,"Keshav",2));
        std_detail.put(7,new Schooldetail("KCCITM",10000,1000,"Keshav",2));
        std_detail.put(8,new Schooldetail("KCCITM",10000,1000,"Keshav",2));
        std_detail.put(9,new Schooldetail("KCCITM",10000,1000,"Keshav",2));
        std_detail.put(10,new Schooldetail("KCCITM",10000,1000,"Keshav",2));

      for (int i = 0 ; i <= std_detail.size()-1 ; i ++) {
          System.out.println(std_detail.get(i).toString());
      }
    
}}
    