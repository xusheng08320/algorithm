package com.xusheng.arr;

import org.junit.Test;
import sun.security.x509.CertificatePolicyMap;

import java.util.Arrays;

public class ArrTest {

    @Test
    public void testMerge() {
        int[] nums1 = new int[]{0};
        int m = 0;
        int[] nums2 = new int[]{1};
        int n = 1;
        merge(nums1, m, nums2, n);
        Arrays.stream(nums1).forEach(System.out::println);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Index = m - 1;
        int nums2Index = n - 1;
        for (int i = m + n - 1; i >= 0 ; i--) {
            if (nums2Index < 0 || (nums1Index >= 0 && nums1[nums1Index] > nums2[nums2Index])) {
                nums1[i] = nums1[nums1Index--];
                continue;
            }
            nums1[i] = nums2[nums2Index--];
        }
    }
}
