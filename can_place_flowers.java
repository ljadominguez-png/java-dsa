public class can_place_flowers {
    public static void main(String[] args) {
        // 0, 0, 0, 0, 0, 0, 0
        int[] arr = new int[] { 1, 0, 0, 0, 1 };

        can_place_flowers solution = new can_place_flowers();
        System.out.println("answer: " + solution.CanPlaceFlowers(arr, 2));
    }

    public boolean CanPlaceFlowers(int[] flowerbed, int n) {
        /*
         * You can place a flower at index i if and only if:
         * The current spot is empty (flowerbed[i] == 0)
         * The spot to the left is empty (or you're at the very beginning)
         * The spot to the right is empty (or you're at the very end)
         */
        int length = flowerbed.length;
        for (int index = 0; index < length; index++) {
            if (flowerbed[index] == 0) {
                boolean leftempty = (index == 0 || flowerbed[index - 1] == 0);
                boolean rightempty = (index == flowerbed.length - 1 || flowerbed[index + 1] == 0);
                if (leftempty && rightempty) {
                    flowerbed[index] = 1;
                    n--;
                }
            }
        }
        return n <= 0;
    }
}
