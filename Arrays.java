public class Main {
    public static void main(String[] args) {

        //declare array of string
        //                  0   1       2       3       4       5
        String[] cars = {"BMW", "VOLVO", "KIA", "MAZDA", "SEAT", "AUDI", "SKODA"};

        System.out.println(cars[2]);//print kia
        //print first and last
        System.out.println(cars[0]);//print first one in the array
        //print the last one
        int length = cars.length;
        System.out.println("the length is " + length);
        System.out.println(cars[length - 1]);
        //to print one before the last
        System.out.println(cars[length - 2]);

        for (int i = 0; i < length; i++) { //i will be as indesx and it starts from 0 to the length of the array
            System.out.print(cars[i] + " ");//cars[0], cars[1], cars[2].....
        }
        System.out.println();

        /*//                  0   1       2       3       4       5
        String[] cars = {"BMW", "VOLVO", "KIA", "SEAT", "AUDI", "SKODA"};*/
        //to find the index of "SEAT" in the cars
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].equals("SEAT")) {
                System.out.println(i);
            }
        }

        String[] cars2 = {"","","","","","","",""};
        cars2[0] = cars[0];
        cars2[1] = cars[1];
        cars2[2] = cars[2];
       /* ....
        ...
        .
       */
        for (int i = 0; i < cars.length; i++) {
            cars2[i] = cars[i];
        }
        System.out.println(cars2[6]);
    }
}
