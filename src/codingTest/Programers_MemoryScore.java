package codingTest;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Programers_MemoryScore {
    public int[] solution(String[] name, int[] yearing, String[][] photo){
        int[] answer = new int[photo.length];

        HashMap<String,Integer> map = new LinkedHashMap<>();

        for (int i = 0 ; i< name.length; i++){
            map.put(name[i],yearing[i]);
        }

        for (int i = 0 ; i< photo.length; i++){
            String[] persons = photo[i];
            int score = 0;

            for (int j = 0 ; i < persons.length; j++){
                String person = persons[i];
                if(map.containsKey(person)){
                    score += map.get(person);
                }
            }

            answer[i]=score;
        }
        return answer;
    }
}
