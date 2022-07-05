import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new Solution().evaluatePostFix(br.readLine().trim()));
		}
	}
}// } Driver Code Ends


class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String s)
    {
        Stack<Integer> st=new Stack<>();
        
        for(int i=0; i<s.length(); i++)
        {
            int var1, var2;
            char ch=s.charAt(i);
            
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
            {
                var2=st.pop();
                var1=st.pop();
                switch(ch)
                {
                    case '+':
                        st.push(var1+var2);
                        break;
                    case '-':
                       st.push(var1-var2);
                        break;
                    case '*':
                       st.push(var1*var2);
                        break;
                    case '/':
                       st.push(var1/var2);
                        break;
                }
            }
            else
            st.push(ch-'0');
        }
        return st.pop();
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
