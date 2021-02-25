package hashcode;

public class Main {

    /**
     * The main driver of the project.
     * @param args standard arguments
     */
    public static void main(final String[] args) {
        /*
        System.out.println("Hello");
        FileManager.createFile("testFile.txt");
        FileManager.clearFile("testFile.txt");
        FileManager.writeIntoFile("testFile.txt", "Test line 1");
        FileManager.readFile("testFile.txt");
        FileManager.writeIntoFile("testFile.txt", "Test line 2");
        FileManager.writeIntoFile("testFile.txt", "Test line 3");
        FileManager.readFile("testFile.txt");
        */
        getInputFromFile("a.txt");
    }

    public static void getInputFromFile(final String fileName){
        String output = FileManager.readFile(fileName);
        String lines[] = output.split("\n");
        int duration = Integer.parseInt(lines[0].split(" ")[0]);
        int numberIntersection = Integer.parseInt(lines[0].split(" ")[1]);
        int numberOfCars = Integer.parseInt(lines[0].split(" ")[2]);
        int scoreForReachingEnd = Integer.parseInt(lines[0].split(" ")[3]);
        System.out.println(duration);
        System.out.println(numberIntersection);
        System.out.println(numberOfCars);
        System.out.println(scoreForReachingEnd);
        getIntersections(lines,numberIntersection);
        getCars(lines, numberOfCars ,numberIntersection);
    }

    public static void getIntersections(final String lines[], final int intersections) {
        for(int i = 1; i < 1 + intersections; i++) {
            int startIntersection = Integer.parseInt(lines[i].split(" ")[0]);
            int endIntersection = Integer.parseInt(lines[i].split(" ")[1]);
            String streetName = lines[i].split(" ")[2];
            int L = Integer.parseInt(lines[i].split(" ")[3]);
            System.out.println(startIntersection);
            System.out.println(endIntersection);
            System.out.println(streetName);
            System.out.println(L +"\n");
        }
    }

    public static void getCars(final String lines[], final int cars, final int currentLine) {
        for(int i = currentLine; i < currentLine + cars; i++) {
            String[] path = lines[i].split(" ");
            int numberOfStreets = Integer.parseInt(path[0]);
            for(int j = 1; j < numberOfStreets; j++) {
                String StreetToPass = path[j];
            }
        }
    }
}
