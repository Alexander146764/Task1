package Task1;

import java.util.*;

// Лекарство
public class Pharmacy implements Iterable<PharmancyComponent>, Comparable<Pharmacy> {
    private List<PharmancyComponent> components = new ArrayList<>();
    private int index = 0;

    public Pharmacy addComponent(PharmancyComponent component) {
        components.add(component);
        return this;
    }

    public List<PharmancyComponent> getComponents() {
        return components;
    }

    public void setComponents(List<PharmancyComponent> components) {
        this.components = components;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex() {
        this.index = index;
    }

//    @Override
//    public boolean hasNext() {
//        return index < components.size();
//    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "components=" + components +
                ", index=" + index +
                '}';
    }
    //вынесеный класс
//    @Override
//    public Iterator<PharmancyComponent> iterator() {
//        return new InteratorComponent(this);
//    }

    //    @Override
//    public PharmancyComponent next() {
//        return components.get(index++);
//    }
//анонимный коасс
    @Override
    public Iterator<PharmancyComponent> iterator() {
        return new Iterator<PharmancyComponent>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public PharmancyComponent next() {
                return components.get(index++);
            }
        };

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pharmacy pharmacy = (Pharmacy) o;
        return index == pharmacy.index && Objects.equals(components, pharmacy.components);
    }

    @Override
    public int hashCode() {
        return Objects.hash(components, index);
    }

    @Override
    public int compareTo(Pharmacy o) {
        if (this.i > o.id){
            return -1;
        } else if (this.id < o.id){
            return 1;
        }
        return 0;
    }
}