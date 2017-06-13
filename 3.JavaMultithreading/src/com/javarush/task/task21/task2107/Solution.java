package com.javarush.task.task21.task2107;

import java.util.LinkedHashMap;
import java.util.Map;

/* 
Глубокое клонирование карты
*/
public class Solution  implements Cloneable{
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        Solution clone = null;
        try {
            clone = (Solution) solution.clone();
            System.out.println(solution);
            System.out.println(clone);
            System.out.println(solution.users);
            System.out.println(clone.users);
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
    public Solution clone() {
        Solution SolClone =  new Solution();
        for(Map.Entry<String, User> entry : this.users.entrySet()){
            SolClone.users.put(entry.getKey(),(User) entry.getValue().clone());
        }
        return SolClone ;
    }
    protected Map<String, User> users = new LinkedHashMap();
    public static class User implements Cloneable  {
        int age;
        String name;
        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }
        public User clone() {
            return new User (age, name) ;
        }
        public boolean equals(Object o){
            if(this == o) return true;
            if(!(o instanceof User)) return false;
            if(o.hashCode() != hashCode()) return false;
            User u = (User) o;
            if(age != u.age) return false;
            if(!(name.equals(u.name)) && u.name != null) return false;
            return true;
        }
        public int hashCode(){
            long f = age * name.hashCode();
            return (int) (f ^ (f >>> 32));
        }
    }
}