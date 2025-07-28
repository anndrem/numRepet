//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    static void verifyNumbers(int[] nums) {
        int k = 0;
        int j = 1;
        int won = 0;
        while (k < nums.length - 1) {
            for (int i = k + 1; i < nums.length; i++) {
                if (nums[k] == nums[i]) {
                    j++;
                    if (j > nums.length / 2) {
                        won = nums[k];
                    }
                }
            }
            j = 0;
            k++;
        }
        System.out.print(won);
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,1};
        verifyNumbers(nums);
    }
}
