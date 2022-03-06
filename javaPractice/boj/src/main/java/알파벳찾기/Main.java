package 알파벳찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] res = new int[26];
        Arrays.fill(res, -1);
        for(int i = 0 ; i < s.length() ; i++){
            if(res[s.charAt(i) - 'a'] != -1) continue;
            res[s.charAt(i) - 'a'] = i;
        }
        for (int i : res) {
            System.out.print(i + " ");
        }

    }

}
