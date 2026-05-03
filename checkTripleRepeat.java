//Single Number (Every element appears 3 times except one)
Java int has 32 bits
Triplicate numbers contribute bits 3 times
count % 3 == 0 → bit belongs to repeated numbers
count % 3 != 0 → bit belongs to unique number
Rebuild the unique number bit by bit



class Solution {
    public int singleNumber(int[] nums) {

        int result = 0;

        for (int i = 0; i < 32; i++) {
            int count = 0;

            for (int num : nums) {
                if ((num >> i & 1) == 1) {     //Check if the i‑th bit of num is 1


                    count++;
                }
            }

            if (count % 3 != 0) {
                result |= (1 << i);
            }
        }

        return result;
    }
}
