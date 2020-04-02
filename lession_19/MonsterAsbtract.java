package lession19;

abstract public class MonsterAsbtract {
    private String name;

    public MonsterAsbtract(String name){
        this.name = name;
    }
    abstract public String attack();
}