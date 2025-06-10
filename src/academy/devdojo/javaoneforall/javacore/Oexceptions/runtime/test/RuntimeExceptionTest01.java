package academy.devdojo.javaoneforall.javacore.Oexceptions.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        // Checked and Unchecked
        // Checked -> Exceptions directly daughters of Exception, if they don't treat, the program can't be compiled
        // Unchecked -> They are subclasses of RuntimeException or is she, they generally are caused by the developer
        Object object = null;
        System.out.println(object.toString());
        int[] nums = {0,1};
        System.out.println(nums[2]);
    }
}