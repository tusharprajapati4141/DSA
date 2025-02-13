public class FirstoddorLasteven {

	public static void main(String[] args){
		int[] a = {2, 6, 8, 10, 12, 3, 5, 7, 9, 11};

        int firstOdd = -1;
        int lastEven = -1;
        int lastOdd = -1;
        int firstEven = -1;


        for (int num : a) {
            if (num % 2 != 0 && firstOdd == -1){
                firstOdd = num;
            }
            if (num % 2 == 0) {
                lastEven = num;
            }
        }
        for(int i = a.length-1; i>=0; i--){
            if(a[i] % 2 != 0 && lastOdd == -1){
                lastOdd = a[i];
            }
            if(a[i] % 2 == 0 && firstEven == -1){
                firstEven = a[i];
            }
        }
        System.out.println("First Odd: " + firstOdd);
        System.out.println("Last Even: " + lastEven);
        System.out.println("Last Odd: " + lastOdd);
        System.out.println("First Even: " + firstEven);

}
}
