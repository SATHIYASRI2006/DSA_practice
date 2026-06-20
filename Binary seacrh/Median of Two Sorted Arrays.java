class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        // Make sure array a is the smaller one to minimize binary search range
        if (a.length > b.length) return findMedianSortedArrays(b, a);

        int n1 = a.length, n2 = b.length;
        int low = 0, high = n1;

        // Binary search on the smaller array
        while (low <= high) {
            // Calculate cut points for both arrays
            int mid1 = (low + high) / 2;
            int mid2 = (n1 + n2 + 1) / 2 - mid1;

            // Get values to the left and right of the partition
            // Use Integer.MIN_VALUE and MAX_VALUE to handle edge cases
            int l1 = (mid1 == 0) ? Integer.MIN_VALUE : a[mid1 - 1];
            int l2 = (mid2 == 0) ? Integer.MIN_VALUE : b[mid2 - 1];
            int r1 = (mid1 == n1) ? Integer.MAX_VALUE : a[mid1];
            int r2 = (mid2 == n2) ? Integer.MAX_VALUE : b[mid2];

            // If partition is valid
            if (l1 <= r2 && l2 <= r1) {
                // Even total elements => average of two middle elements
                if ((n1 + n2) % 2 == 0)
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                else
                    // Odd total elements => max of left parts
                    return Math.max(l1, l2);
            }
            // Move left in array a
            else if (l1 > r2)
                high = mid1 - 1;
            // Move right in array a
            else
                low = mid1 + 1;
        }

        return 0.0; 
    }
}
