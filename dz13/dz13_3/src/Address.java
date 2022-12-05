import java.util.ArrayList;
import java.util.StringTokenizer;

public class Address {
    String country, region, city, street, house, building, room;

    public void getAddressFromString (String str) {
        String[] info = str.split(",");
        country = info[0];
        region = info[1];
        city = info[2];
        street = info[3];
        house = info[4];
        building = info[5];
        room = info[6];
        System.out.println(room);
    }

    public void getAddressFromStringAny (String str) {
        ArrayList<String> info = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(str, ",.;");
        while (st.hasMoreTokens()) {
            info.add(st.nextToken());
        }
        country = info.get(0);
        region = info.get(1);
        city = info.get(2);
        street = info.get(3);
        house = info.get(4);
        building = info.get(5);
        room = info.get(6);
        System.out.println(country);
    }
}
