import java.util.Arrays;

public class TruncateSentence {
    public static void main(String[] args) {
        String s= "Hello how are you Contestant";
        int k=4;
        String toreturn = "";
        String[] news = s.split("\\s+"); //Arrays.toString
        System.out.println(Arrays.toString(news));
        for (int i = 0 ; i < k ; i++){
            if(i==0){
                toreturn = toreturn+news[0];
            }
       else  toreturn = toreturn + " "+news[i];
        }
        System.out.println(toreturn);
    }
}
