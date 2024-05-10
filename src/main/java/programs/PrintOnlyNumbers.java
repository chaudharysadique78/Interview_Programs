package programs;

public class PrintOnlyNumbers {
    public static void main(String[] args) {

        String input="gdhad 042353    14th";
        StringBuilder numbers= new StringBuilder();

        for(char c:input.toCharArray()){
            if(Character.isDigit(c)){
                numbers.append(c);
            }
        }
        System.out.println("String with numbers only :" + numbers.toString());
    }

}
