import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.Objects;

public class Stuff {
    int id;
    int attaque;
    int defense;
    int value;

    public Stuff(int id, int attaque, int defense, int value) {
        this.id = id;
        this.attaque = attaque;
        this.defense = defense;
        this.value = value;
    }

    public Stuff(int attaque, int defense, int value) {
        this.attaque = attaque;
        this.defense = defense;
        this.value = value;
    }

    public Stuff() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAttaque() {
        return attaque;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Stuff{" +
                "id=" + id +
                ", attaque=" + attaque +
                ", defense=" + defense +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stuff stuff = (Stuff) o;
        return id == stuff.id && attaque == stuff.attaque && defense == stuff.defense && value == stuff.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, attaque, defense, value);
    }

   /* public ObjectNode getJson(){

    }*/
}
