package Task1;

import java.util.*;
import java.util.List;


public class Main1 {
    public static void main(String[] args) {
        PharmancyComponent azitromet = new Azitronit(1,"Azitronit" , "10mg", 50);
        PharmancyComponent pinicilin = new Pinicilin(2,"Pinicilin" , "10mg", 120);
        PharmancyComponent water = new Water(3,"Water" , "10mg", 20);
        PharmancyComponent water2 = new Water(4,"Water" , "10mg", 20);
        PharmancyComponent aspirin = new Water(5,"Aspirin" , "20mg", 40);
        PharmancyComponent aspirin2 = new Water(6,"Aspirin" , "20mg", 40);
        PharmancyComponent aspirin3 = new Water(7,"Aspirin" , "30mg", 50);


        List<PharmancyComponent> pharmancyComponents = new ArrayList<>();
        pharmancyComponents.add(azitromet);
        pharmancyComponents.add(pinicilin);
        pharmancyComponents.add(water);
        pharmancyComponents.add(water2);
        pharmancyComponents.add(aspirin);
        pharmancyComponents.add(aspirin2);
        pharmancyComponents.add(aspirin3);
        System.out.println(pharmancyComponents);
        Collections.sort(pharmancyComponents);
        System.out.println(pharmancyComponents);

        Map<Integer, String> myMap = new HashMap<Integer, String>();
        for (int i = 1; i < pharmancyComponents.size(); i++) {
            myMap.put(i, String.valueOf(pharmancyComponents.get(i)));
        }
        System.out.println(myMap);


        Set<PharmancyComponent> result = new HashSet<>();
        result.add(azitromet);
        result.add(pinicilin);
        result.add(water);
        result.add(water2);
        result.add(aspirin);
        result.add(aspirin2);
        result.add(aspirin3);
        System.out.println(result.size());

        Pharmacy pharmacy1 = new Pharmacy().addComponent(azitromet).addComponent(water);
        Pharmacy pharmacy2 = new Pharmacy().addComponent(pinicilin).addComponent(water);

        for (PharmancyComponent comp: pharmacy2){
          //  System.out.println(comp.getName());

        }

        List<Pharmacy> pharmacies = new ArrayList<>();
        pharmacies.add(pharmacy1);
        pharmacies.add(pharmacy2);


        //Iterator<PharmancyComponent> iterator = pharmacy1;

        //while (((Iterator<Component>) pharmacy1).hasNext()) ;
//       while (iterator.hasNext())
//        System.out.println(iterator.next());
            }
}
