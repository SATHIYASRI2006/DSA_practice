class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sum=0;
        for(int i=0;i<grumpy.length;i++){
            if(grumpy[i]==0){
                sum+=customers[i];
            }
        }
        int[] num=new int[grumpy.length];
        for(int i=0;i<grumpy.length;i++){
            if(grumpy[i]==1){
                num[i]=customer[i];
            }
        }
        int max=sum;
        for(int i=0;i<num.length;i++){
            sum+=num[i];
            max=Math.max(sum,max);
        }
        return max;
    }
}
