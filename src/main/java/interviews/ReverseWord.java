package interviews;

public class ReverseWord {


    public static void main(String[] args) {

        String s="hello world";
        String[] words=s.split(" ");
        StringBuilder reverString= new StringBuilder();

        for(int i=words.length-1;i>=0;i--){
            reverString.append(words[i]);

            if(i!=0){
                reverString.append(" ");
            }

        }

        System.out.println("Oroginal String "+ s);
        System.out.println("reverse String "+reverString);

    }
}
