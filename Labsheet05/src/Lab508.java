import javax.swing.JOptionPane;
public class Lab508 {
    public static void main(String[] args){
        int[] indexArray = {25, 78, 41, 22, 36, 85, 37};
        int index = Integer.parseInt(JOptionPane.showInputDialog("Input inedx of array:"));
        while (!checkIndex(indexArray, index)) {
            index = Integer.getInteger(JOptionPane.showInputDialog("Input inedx of array, again:"));
        }
        String message = currentData(indexArray,index)+"\n"+prevData(indexArray,index)+"\n"+nextData(indexArray,index);

        JOptionPane.showMessageDialog(null, message);
    }
    public static boolean checkIndex(int[] indexArray01, int index) {
        return (index >= 0 && index < indexArray01.length) ? true : false;
    }
    public static String currentData(int[] indexArray02, int index){
        return "Current data, nums["+index+"] is "+indexArray02[index];
    }
    public static String prevData(int[] indexArray03, int index){
        return (index > 0) ? "Previous data, nums[" + (index - 1) + "] is " + indexArray03[index - 1] : "No previous data";
    }
    public static String nextData(int[] indexArray04, int index){
        return (index < indexArray04.length - 1) ? "Next data, nums[" + (index + 1) + "] is " + indexArray04[index + 1] : "No next data";
    }
}