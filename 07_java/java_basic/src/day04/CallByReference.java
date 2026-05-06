package day04;

class AddArray {
    public int addArray(int[] arrayRefer){
        int totalSum = 0;
        for (int i = 0; i < arrayRefer.length; i++) {
            totalSum += arrayRefer[i];
        }

        return totalSum;
    }

    static final int value = 3;
}
public class CallByReference {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        //배열의 총합을 구하여 출력하세요
        AddArray 신형 = new AddArray();
        int result = 신형.addArray(a);

        int  number = AddArray.value;
        System.out.println("신형이의 총합 계산 서비스: " + result);
    }


}
