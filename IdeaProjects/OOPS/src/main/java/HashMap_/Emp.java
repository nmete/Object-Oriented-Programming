package HashMap_;

import java.util.Objects;

public class Emp {

    String name;
    int id;

    public Emp(String name, int id){
        this.name= name;
        this.id= (id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Emp)) return false;
        Emp emp = (Emp) o;
        return id == emp.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }


}
