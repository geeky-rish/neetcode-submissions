class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        

        Map<Integer, Integer> fMap = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            fMap.put(nums[i], fMap.getOrDefault(nums[i],0)+1);
        }

        // The comparator (b, a) reverses the order to make it a Max-Heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> fMap.get(b) - fMap.get(a));
        for (int num : fMap.keySet()) 
            maxHeap.add(num);
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
        result[i] = maxHeap.poll();
        }
        return result;

    }
}
