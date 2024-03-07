package programs;

public class RemoveDuplicateString {

    public static void main(String[] args) {

        String str="sassssb";
        str.replaceAll("[^a-zA-Z0-9\\s]","");
        String result = removeDuplicate(str);
        System.out.println("Original String: "+ str);
        System.out.println("String without duplicate character: "+ result);

    }

    public static String removeDuplicate(String str){

        StringBuilder result=new StringBuilder();

        for(int i=0;i<str.length();i++){
            char currenetChar=str.charAt(i);
            if(result.indexOf(String.valueOf(currenetChar))== -1){
                result.append(currenetChar);
            }
        }
        return result.toString();
    }
}
