class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int startIndex = 0;
        int endIndex = numbers.length - 1;

        while (true) {
            int start = numbers[startIndex];
            int end = numbers[endIndex];
            int sum = start + end;

            if (target == sum) {
                return new int[] { startIndex + 1, endIndex + 1 };
            } else if (target < sum) {
                endIndex--;
            } else {
                startIndex++;
            }
        }
    }
}
