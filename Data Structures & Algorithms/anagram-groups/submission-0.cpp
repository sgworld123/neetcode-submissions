class Solution
 {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        map<string,vector<string>> mpp;
        int n = strs.size();
        for(int i = 0 ; i < n ; i++)
        {
            string s = strs[i];
            sort(s.begin(),s.end());
            mpp[s].push_back(strs[i]);
        }
        vector<vector<string>> ans;
        for(auto &p : mpp)
        {
            ans.push_back(p.second);
        }
        return ans;
    }
};
