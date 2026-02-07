package Map.HashMap;

import java.util.Objects;

public class Hash_Student {

    private String name;
    private int id;

    public Hash_Student(String name , int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    @Override
    public int hashCode() {
        return  Objects.hash(name,id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        Hash_Student other = (Hash_Student) obj;
        return id == other.getId() && Objects.equals(name,other.getId());

    }

    @Override
    public String toString() {
        return "id " + id + "name"+  name;
    }
}
