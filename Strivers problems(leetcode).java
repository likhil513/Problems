//Maximum Subarray
class Solution {
    public int maxSubArray(int[] nums) {
        int maxendinghere=nums[0];
        int maxsofar=nums[0];
        for(int i=1;i<nums.length;i++){
            maxendinghere=Math.max(nums[i],maxendinghere+nums[i]);
            maxsofar=Math.max(maxendinghere,maxsofar);
        }
        return maxsofar;
    }
}



//Sort Colors
class Solution {
    public void sortColors(int[] nums) {
       int temp=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }}
        System.out.println(nums);
    }
}



//Best Time to Buy and Sell Stock
public class Solution {
    public int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
}




// Merge Sorted Array
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;    
        for(int i = m;i < m + n; i ++){
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
    }
}




//Search a 2D Matrix
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==target)
                return true;
            }
        }return false;
    }
}



#CodeNinja(Missing and repeating numbers)
  public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        int count[]=new int[n+1];
        Arrays.fill(count,0);
        for(int x:arr){
            count[x]++;
        }
        int missing =0;
        int repeating=0;
        for(int i=1;i<count.length;i++){
            if(count[i]==0){
                missing=i;
            }
            if(count[i]>1)
                repeating=i;
        }
        int ans[]={missing,repeating};
        return ans;
    }
}




//Reverse Words in a String
class Solution {
    public String reverseWords(String s) {
        String[] str=s.split(" ");
        String a="";
        for(int i=str.length-1;i>=0;i--){
            if(!(str[i].trim().isEmpty()))
                a+=str[i]+" ";
        }a=a.trim();
        return a;
    }
}
