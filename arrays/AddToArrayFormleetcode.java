package arrays;

import java.util.*;
// import java.util.ArrayList;

// question - https://leetcode.com/problems/add-to-array-form-of-integer/

public class AddToArrayFormleetcode {
    public static void main(String[] args) {
        int[] num = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        List<Integer> res = new ArrayList<Integer>();
        res = addToArrayForm(num, k);
        // String s = res.;
        System.out.println(res.toString());
    }

    static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<>();
        int carry = 0;

        for (int i = num.length - 1; i >= 0 || k > 0 || carry > 0; i--) {
            int x = (i >= 0) ? num[i] : 0;
            int sum = x + k % 10 + carry;
            res.add(sum % 10);
            carry = sum / 10;
            k = k / 10;
        }

        Collections.reverse(res);
        return res;
    }
}
