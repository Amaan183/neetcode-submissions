class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> s_seen = new HashMap<>();
        HashMap<Character, Integer> t_seen = new HashMap<>();

        for (int i=0;i<t.length();i++)
        {
            if (s_seen.get(s.charAt(i)) == null)
            {
                s_seen.put(s.charAt(i),0);
            }
            else{
                s_seen.put(s.charAt(i),s_seen.get(s.charAt(i)) +1);
            }

            if (t_seen.get(t.charAt(i)) == null)
            {
                t_seen.put(t.charAt(i),0);
            }
            else{
                t_seen.put(t.charAt(i),t_seen.get(t.charAt(i)) +1);
            }
        }

        return s_seen.equals(t_seen);
    }
}
