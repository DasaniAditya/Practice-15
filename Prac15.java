// Subarray Product Less than K

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        if(k <= 1) {
            return 0;
        }
        int i = 0;
        int product = 1;
        int result = 0;
        
        for(int j = 0; j < nums.length; j++) {
            product *= nums[j];
            while(i < j && product >= k) {
                product /= nums[i];
                i++;   
            } 
            if(nums[j] < k) {
                result += j-i+1;
            }
         }
        return result;
    }
}

//Product of late k numbers

class ProductOfNumbers {
    ArrayList<Integer> list;
    public ProductOfNumbers() {
        list = new ArrayList<>();
    }
    
    public void add(int num) {
        list.add(num);
    }
    
    public int getProduct(int k) {
        int result = 1;
        int index = list.size()-1;
        while(k > 0) {
            result *= list.get(index);
            index--;
            k--;
        }
        return result;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */