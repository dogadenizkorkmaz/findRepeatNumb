import java.util.Arrays;

public class Main {

    static boolean isFind(int[] arr, int value){
        for (int i: arr) {
            if(i==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {3,4,4,7,2,3,3,2,9,10,10,21,1,8,8,33,9,1};
        int [] duplicate = new int [list.length];
        int startIndex = 0;
        for (int i= 0; i < list.length; i++ ) {
            for(int j=0; j< list.length; j++) {
                if ((i != j) && (list[i]==list[j])){
                    if (!isFind(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                    }
                }
            }
        }
        for (int value : duplicate) {
            if ((value % 2 == 0)&&(value != 0)) { // videodaki örnekten farklı olarak "çift sayılar için" buraya "value%2==0" koşulu ekledim
                System.out.println(value);
            }
        }
    }
}
