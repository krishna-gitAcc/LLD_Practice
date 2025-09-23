
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;




/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

// n -> 1234 -> 1243
// n -> 218765 -> 251678
// n -> 217865 -> 218567


public class Main
{
	public static void main(String[] args) {
		int n = 218765;

		List<Integer> arr;
            arr = new ArrayList<>();

		while(n>0){
		    arr.add(n/10);
		    n/=10;
		}

        int [] arr2 = new int[arr.size()];
        for(int i = 0; i<arr.size(); i++){
            arr2[i] = arr.get(i);
        }
		// 5-> 6-> 7-> 1-> 8-> 2;

		//5, 6, 8, 7, 1, 2;
		//i = 2;
        int i = 0;
        int minIdx = 0;
        int minTillNow = Integer.MAX_VALUE;
	    for( i = 0; i<arr2.length-1; ){
	       if(arr2[i] < arr2[i+1]){
               break;
           }
           else{
                if(minTillNow > arr2[i]){
                    minTillNow = arr2[i];
                    minIdx = i;
                }
           }
           i++;
	    }
	    if(i == arr.size()-1){
	        System.out.println("Not Possible");
            return;
	    }
	    int temp = arr2[minIdx];
	    arr2[minIdx] = arr2[i+1];
        arr2[i+1] = temp;
	    Arrays.sort(arr2, 0, i);
	    int ans = 0;
	    for(i = 0; i<arr2.length; i++){
            ans*=10;
            ans+=arr.get(i);
        }
	    System.out.println(ans);
		return;

        // { {1, 2}, {2, 4}, {3, 5}, {7, 8}};

        // sort inter smallest stat , smallest end.;

        // {{5, 7}, {1,2, }, {8, 10}, {3, 6}, {1, 6}};
        // {{1, 2},{1, 6}, {3, 7} {4, 5}, {5, 7}, {8, 10}};
        // int k = 10;
        // { {1, 2} { 4, 5}, { 1, 6}, { 3, 7}, {5, 7}, {8 10} }
        //
        // // {{1, 2},{1, 6}, {3, 7} {4, 5}, {5, 7}, {8, 10}};









	}
}