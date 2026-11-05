class Solution {
public:
    int majorityElement(vector<int>& nums) {
        unordered_map <int ,int>m;
        for(auto x: nums){
            if(m.find(x)!=m.end())
                m[x]++;
            else{
                m[x]=1;
            }
        }
        int ans;
        for(auto x: m){
            if(x.second > nums.size()/2){
                ans= x.first;
                break;
            }
        }
        return ans;
        
    }
};