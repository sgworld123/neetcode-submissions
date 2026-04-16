class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character,Integer> mpp = new HashMap<>();
        int y = 1;
        int n = words.length;
        int count = -1;
        for(var i : order.toCharArray())
        {
            mpp.put(i,y);
            y++;
        } 
        int i = 0;
        for(int j = 1 ; j < n ; j++)
        {
            String w1 = words[i];
            String w2 = words[j];

            /* 2 conditions valid honi chahiye
            koi esa indec hua jispe mpp.get(one) < mpp.get(two)
            and and and  */
            for(int k = 0 ; k < Math.min(w1.length(),w2.length()); k++)
            {
                char one = w1.charAt(k);
                char two = w2.charAt(k);
                if(mpp.get(one) < mpp.get(two))
                {
                    count = 0;
                    break;
                }
                else if(mpp.get(one) == mpp.get(two))
                {
                    continue;
                }
                else
                {
                    count = 1;
                    break;
                }
            }
            System.out.println(w1);
            System.out.println(w2);
            System.out.println(count);
            if(count == -1 && w1.length() > w2.length())
            {
                return false;
            }
            if(count == 1)
            {
                return false;
            }
            i++;
        }
        return true;
    }
}