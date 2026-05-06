package practice_0417.실습;

class AddArray {
    public static int addArray(int[] arrayRefer){
        int totalSum = 0;
        for (int i = 0; i < arrayRefer.length; i++) {
            totalSum += arrayRefer[i];
        }
        return totalSum;
    }

    static  final int value = 3;
}
public class CallByReference {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};

        AddArray 신형 = new AddArray();
        int result = 신형.addArray(a);

        int number = AddArray.value;
        System.out.println("총합 : "+result);
        System.out.println("number : "+number);
    }
}
