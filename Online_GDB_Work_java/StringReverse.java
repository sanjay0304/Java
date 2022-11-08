class StringReverse{
    
    static String reverseString(String name){
        String namereverse = "";
        
        for(int i = name.length()-1; i>=0 ;i--){
            namereverse+=name.charAt(i);
        }
        
        return namereverse;
    }
}