package question8;

import java.util.HashMap;
import java.util.HashSet;

public class Answer8 {
   /* Write the program that tell you which line pass through particular stations.
    Just use Zone 1 stations name. (Challenge)*/
   public static void main(String[] args) {
       HashMap<String, HashSet<String>> lines = new HashMap<>();
       HashSet<String> line1Stations = new HashSet<>();
       line1Stations.add("Station A");
       line1Stations.add("Station B");
       line1Stations.add("Station C");

       HashSet<String> line2Stations = new HashSet<>();
       line2Stations.add("Station D");
       line2Stations.add("Station E");
       line2Stations.add("Station F");

       HashSet<String> line3Stations = new HashSet<>();
       line3Stations.add("Station G");
       line3Stations.add("Station H");
       line3Stations.add("Station I");
       lines.put("Line1", line1Stations);
       lines.put("Line2", line2Stations);
       lines.put("Line3", line3Stations);

       HashSet<String> zone1Stations = new HashSet<>();
       zone1Stations.add("Station A");
       zone1Stations.add("Station B");
       zone1Stations.add("Station C");
       zone1Stations.add("Station D");
       zone1Stations.add("Station E");
       zone1Stations.add("Station F");
       zone1Stations.add("Station G");
       zone1Stations.add("Station H");
       zone1Stations.add("Station I");

       System.out.println("Lines passing through Zone 1 stations:");
       for(String line : lines.keySet()){
           HashSet<String> stations = lines.get(line);
           boolean
                   passesThroughZone1 = false;
           for(String station : stations) {
               if(zone1Stations.contains(station)){
                   passesThroughZone1 = true;
                   break;
               }
           }
           if(passesThroughZone1){
               System.out.println(line);
           }
       }
   }
}
