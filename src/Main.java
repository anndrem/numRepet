//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    static void verifyNumbers(int[] nums) {
        int j = 1;
        int won = 0;
        for (int k : nums) {
            for (int num : nums) {
                if (k == num) {
                    j++;
                    if (j > nums.length / 2) {
                        won = k;
                    }
                }
            }
            j = 1;
        }
        System.out.print(won);
    }

    public static void main(String[] args) {
        int[] nums = {2,2,2,1};
        verifyNumbers(nums);
    }
}
