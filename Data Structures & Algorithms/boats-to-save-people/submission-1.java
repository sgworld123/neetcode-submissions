class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int i = 0;
        int n = people.length;
        int j = people.length - 1;
        Arrays.sort(people);
        int count = 0;
        while(i < j)
        {
            int sum = people[i] + people[j];
            if(sum <= limit)
            {
                count++;
                people[i] = 0;
                people[j] = 0;
                i++;
                j--;

            }
            else if(sum > limit)
            {
                j--;
            }
        }
        for(int l = 0 ; l < n ; l++)
        {
            if(people[l] != 0)
            {
                count++;
            }
        }
        return count;

    }
}