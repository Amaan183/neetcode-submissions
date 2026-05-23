class Solution:
        def isAnagram(self, s: str, t: str) -> bool:
                if not (len(s) == len(t)):
                        return False
                s_dict = {}
                t_dict = {}
                for i in range(0, len(s)):
                        if (s[i] in s_dict) == False:
                                s_dict[s[i]] = 1
                        else:
                                s_dict[s[i]]+=1
                        if (t[i] in t_dict) == False:
                                t_dict[t[i]] = 1
                        else:
                                t_dict[t[i]]+=1
                return s_dict == t_dict