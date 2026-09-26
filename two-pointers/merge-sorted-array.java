class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         int[] result = IntStream.concat(
                Arrays.stream(nums1, 0, m),
                Arrays.stream(nums2)
            )
            .sorted()
            .toArray();
        System.arraycopy(result, 0, nums1, 0, m + n);
    }
}