/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

class Lucky_Four
{
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        
        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        
        int nextInt() {
            return Integer.parseInt(next());
        }
        
        long nextLong() {
            return Long.parseLong(next());
        }
        
        double nextDouble() {
            return Double.parseDouble(next());
        }
        
        String nextLine() {
            String str = "";
            try {
                str = br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    
    static class FastWriter {
        private final BufferedWriter bw;
        
        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }
        
        public void print(Object object) throws IOException {
            bw.append("").append(String.valueOf(object));
        }
        
        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }
        
        public void close() throws IOException {
            bw.close();
        }
    }
    
    static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
    
    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
    
    static long pow(long base, int exp) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result *= base;
            }
            base *= base;
            exp /= 2;
        }
        return result;
    }
    
    public static void main(String[] args) throws java.lang.Exception {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        
        int t = in.nextInt();
        while (t != 0) {
            t--;
            int n=in.nextInt();
            int c=0;
            while (n>0) {
                int r= n%10;
                if(r==4)
                c++;
                n=n/10;
            }
            out.println(c);
            
        }
        
        out.close();
    }
}