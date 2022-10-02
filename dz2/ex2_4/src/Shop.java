import java.util.ArrayList;

public class Shop {
    ArrayList<Computer> computers = new ArrayList<>();

    public Shop () {

    }

    public Shop (ArrayList<Computer> computers) {
        this.computers = computers;
    }

    void addComputer (Computer comp) {
        computers.add(comp);
    }

    boolean deleteComputer (String name) {
        boolean done = false;
        for (int i = 0; i < computers.size(); i++) {
            if (computers.get(i).name.equals(name)) {
                computers.remove(computers.get(i));
                done = true;
            }
        }
        if (!done) {
            System.out.println("Haven't found computer with name \"" + name + "\"");
            return false;
        }
        else {
            System.out.println("Computer removed successfully!");
            return true;
        }
    }

    String findComputer (String name) {
        String result = "";
        boolean exist = false;
        for (int i = 0; i < computers.size(); i++) {
            if (computers.get(i).name.equals(name) && !exist) {
                System.out.println("Computer with such name exists");
                System.out.println(computers.get(i));
                exist = true;
                result += "Computer with such name exists\n";
                result += computers.get(i).toString();
            }
        }

        if (!exist)
            result = "Haven't found computer with name \"" + name + "\"";
        return result;
    }

    @Override
    public String toString () {
        String result = "Shop:\n";
        for (int i = 0; i < computers.size(); i++) {
            String buff = (i + 1) + ": " + computers.get(i).name + "\n";
            result += buff;
        }
        return result;
    }
}
