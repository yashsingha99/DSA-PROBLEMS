class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int cntIds = 0;
        // long setBit = 0;
        // for (int tuple[] : nums1) {
        // if ((setBit & (1 << tuple[0])) == 0) {
        // cntIds++;
        // setBit |= (1 << tuple[0]);
        // }
        // }
        // for (int tuple[] : nums2) {
        // if ((setBit & (1 << tuple[0])) == 0) {
        // cntIds++;
        // setBit |= (1 << tuple[0]);
        // }
        // }

        BitSet setBit = new BitSet(1000);

        for (int[] tuple : nums1) {
            if (!setBit.get(tuple[0])) {
                cntIds++;
                setBit.set(tuple[0]);
            }
        }
        for (int[] tuple : nums2) {
            if (!setBit.get(tuple[0])) {
                cntIds++;
                setBit.set(tuple[0]);
            }
        }
        int[][] arr = new int[cntIds][2];
        int i = 0, j = 0, idx = 0, n = nums1.length, m = nums2.length;
        while (i < n && j < m) {
            if (nums1[i][0] == nums2[j][0]) {
                arr[idx][0] = nums1[i][0];
                arr[idx++][1] = nums1[i++][1] + nums2[j++][1];
            } else if (nums1[i][0] > nums2[j][0]) {
                arr[idx][0] = nums2[j][0];
                arr[idx++][1] = nums2[j++][1];
            } else {
                arr[idx][0] = nums1[i][0];
                arr[idx++][1] = nums1[i++][1];
            }
        }

        while (i < n) {
            arr[idx][0] = nums1[i][0];
            arr[idx++][1] = nums1[i++][1];
        }
        while (j < m) {
            arr[idx][0] = nums2[j][0];
            arr[idx++][1] = nums2[j++][1];
        }
        return arr;
    }
}