

public class ReverseString {
  public static void main(String[] args) {
    String input = "Anitha";
    int len = input.length();
    String rev = "";
    for(int i = len-1;i>=0;i--){
      rev = rev + input.charAt(i);
    }
    System.out.println(rev);
  }
}
