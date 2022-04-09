class Solution {
    List<Integer> rtList = new ArrayList<>();
    Map<Integer,Integer> countSet = new HashMap<>();
    int[] countArr;
    //记录当前坐标移动多少格的数组
    int[] moveArr;
    //定义一个索引数组，用来记录“原始数组”的下标
    int[] indexArr;
    public List<Integer> countSmaller(int[] nums) {
        //记录右侧小于当前元素的个数的数组,int[]数组每个元素默认为0
        //[0,0,0,0...]
        countArr = new int[nums.length];
        moveArr = new int[nums.length];
	indexArr = new int[nums.length];
	for(int i = 0; i < nums.length; i++) {
            indexArr[i] = i;
	}	
    }
    /**
     * 和计算数组中的逆序对那道题很类似
     * 使用归并排序，在合并的过程中，对当前元素的count值进行 + 1；
     *
     */
    void mergeSort() {
        
    }
    void merge(int[] arr,int left,int mid,int right) {
	//左数组包括arr[mid];
        int leftSize = mid - left + 1;
        int rightSize = right - mid;
	int[] leftArr = new int[leftSize];
	int[] rightArr = new int[rightSize];
	for(int i = 0; i < leftSize; i++) {
	    leftArr[i] = arr[left + i];
	}
	for(int j = 0; j < rightSize; j++) {
            rightArr[j] = arr[mid + i + 1];
	}
	int i = 0;
	int j = 0;
	int k = left;
	while(i < leftSize && j < rightSize) {
             if(leftArr[i] <= rightArr[j]) {
		  indexArr[indexArr[k]] = k;
	          //当前元素在原始数组的count数+1;
	          countArr[indexArr[k]] ++;
                  arr[k++] = left[i++];

	     }else {
		  indexArr[indexArr[k]] = k;
	          //当前元素在原始数组的count数+1;
	          countArr[indexArr[k]] ++;
		  arr[k++] = right[j++];    
	     }
	}
	while(i < leftSize) {
            arr[k++] = left[i++]
	}
	while(j < rightSize) {
            arr[k++] = right[j++];
	}
    }
}
