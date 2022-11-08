import java.util.*;
class CustomString{
    
    static void frequencyOfChar(String names){
         HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i = 0;i < names.length();i++){
           if(map.containsKey(names.charAt(i))){
               map.put(names.charAt(i),map.get(names.charAt(i))+1);
           }else
           map.put(names.charAt(i),1);
       }
       int maxfreq = 0; char name=' ';
       for(char key:map.keySet()){
            if(map.get(key)>=maxfreq){
            maxfreq=map.get(key);
            name=key;
            }
        }
         System.out.println(name+"   :  "+map.get(name));
    }
    
    static void frequencyOfWords(String[] names){
       HashMap<String,Integer> map = new HashMap<String,Integer>();
       for(int i = 0;i < names.length;i++){
           if(map.containsKey(names[i])){
               map.put(names[i],map.get(names[i])+1);
           }else
           map.put(names[i],1);
       }
        String name="";
        int maxfreq=0;
        for(String key:map.keySet()){
            if(map.get(key)>=maxfreq){
            maxfreq=map.get(key);
            name=key;
            }
        }
         System.out.println(name+":"+"\t"+map.get(name));
    
    }
}