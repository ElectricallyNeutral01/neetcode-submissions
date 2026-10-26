class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        
        d = {}

        for i in nums:
            if (d.get(i) is None):
                d[i] = 1
            else:
                d[i] = d[i] + 1
        
        item = []

        for key,val in d.items():
            item.append([val,key])
        item.sort()

        result = []
        print(item)
        for i in range(0,k):
            result.append(item.pop()[1])

        return result
        
                

        