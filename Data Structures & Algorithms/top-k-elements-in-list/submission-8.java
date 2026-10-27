class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        //System.out.println(map);

        int[] result = new int[k];

        for(int i=0; i<k; i++){
            int a = getMax(map);
            result[i] = a ;
            map.remove(a);
        }
        //System.out.println(Arrays.toString(result));
        return result;
    }
    public int getMax(Map<Integer,Integer> map){
        int bestKey = 0;
        int bestCount = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > bestCount) {
                bestCount = e.getValue();
                bestKey = e.getKey();
            }
        }
        return bestKey;
    }
}
