/*
Problem: Two Sum
Platform: LeetCode
Link: https:https://leetcode.com/problems/two-sum/description/
Difficulty: Easy

Time Complexity: O(n^2)
Space Complexity: O(1)
*/

import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        System.out.println("Enter the elements");
        new num[]=int num[];
        int target = sc.nextInt();
        for(int i=0; i<n ;i++)
           {
            for(int j=i+1; j<n;j++)
            {
                if(num[i]+num[j]==target)
            }
            System.out.println("["+i+","+j+"]");
           }
        System.out.println("invalid")

    }
}
