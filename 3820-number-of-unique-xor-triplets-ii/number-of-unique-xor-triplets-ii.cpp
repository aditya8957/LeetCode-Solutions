class Solution {
public:
    int uniqueXorTriplets(vector<int>& nums) {
        unordered_set<int> pairs, triplets;
        int n =  nums.size();
        for(int i = 0;i < n;i++){
            for(int j = i;j < n;j++)
                pairs.insert(nums[i] ^ nums[j]);
        }
        for(int k = 0;k < n;k++){
            for(int p: pairs){
                triplets.insert(nums[k] ^ p);
            }
        }
        return triplets.size();
    }
};