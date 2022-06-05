class Solution {
public:
    bool isAnagram(string s, string t) {
        int len1=s.size();
        int len2=t.size();
        if(len1!=len2)
            return false;
        map<char,int>n1,n2;
        for(int i=0;i<len1;i++){
            n1[s[i]]++;
            n2[t[i]]++;
        }
        
        map<char,int>::iterator it,it2;
        it=n1.begin(); 
        it2=n2.begin();
        while(it!=n1.end() && it2!=n2.end()){
            if(it->first==it2->first && it->second==it2->second)
            {it++;
            it2++;}
            else
                return false;
            
        }
        return true;
        
        }
    };