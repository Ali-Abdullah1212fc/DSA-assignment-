

public class ReverseStringOptimal {

    public static void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;

        while(left < right){

            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args){

        char[] s = {'A','S','L','A','M'};

        reverseString(s);

        System.out.print("Reversed String: ");

        for(char c : s)
            System.out.print(c + " ");
    }
}