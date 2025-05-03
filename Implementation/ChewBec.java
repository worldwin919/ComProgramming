import java.util.*;
public class ChewBecca {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < num.length(); i++){
               char cur = num.charAt(i);
               int dig = cur - '0';
               if(i == 0 && dig == 9) res.append("9");
               else{
                    int inv = 9-dig;
                    if(inv < dig) res.append(inv);
                    else res.append(dig);
               }
        }
        System.out.println(res.toString());
    }
}

