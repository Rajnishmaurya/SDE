public class LinearSearch {
    public static void main(String[] args) {
        int nums[]={4,7,8,10,12,45};
        int target=100;

        int result=linearsearch(nums,target);

        if(result!=-1)
        {
            System.out.println("Element forund at index: "+result);
        }
        else
        {
            System.out.println("Element not found ");
        }
    }

    public static int linearsearch(int[] nums,int target)
    {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            return i;
        }
        return -1;
        
    }
}
