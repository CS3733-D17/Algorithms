package com.slackers.inc.alrorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by John's New HP on 3/25/2017.
 */
public class CsvTest {


    public static void main(String args[]) throws IOException {

        FileOutputStream out = new FileOutputStream("outputCsv.csv");

        CsvWriter writer = new CsvWriter(out);

        List<BeverageEntityTest> entityTestList = new LinkedList<>();
        entityTestList.add(new BeverageEntityTest("Wine 1", BeverageEntityTest.BeverageType.WINE, new Date(2017,5,26)));
        entityTestList.add(new BeverageEntityTest("Wine 2", BeverageEntityTest.BeverageType.WINE, new Date(2017,5,27)));
        entityTestList.add(new BeverageEntityTest("Wine 4", BeverageEntityTest.BeverageType.WINE, new Date(2017,5,28)));
        entityTestList.add(new BeverageEntityTest("Wine 6", BeverageEntityTest.BeverageType.WINE, new Date(2017,5,29)));
        entityTestList.add(new BeverageEntityTest("Beer X", BeverageEntityTest.BeverageType.BEER, new Date(2016,1,2)));
        entityTestList.add(new BeverageEntityTest("Distilled Z", BeverageEntityTest.BeverageType.DISTILLED, new Date(2017,3,6)));

        List<UserEntityTest> userEntityTestList = new LinkedList<>();
        userEntityTestList.add(new UserEntityTest("Joe", UserEntityTest.UserLevel.USER, new String[]{"Google", "Facebook","Twitter","YouTube"}));
        userEntityTestList.add(new UserEntityTest("Joe", UserEntityTest.UserLevel.USER, new String[]{"Outlook", "Facebook","YouTube"}));
        userEntityTestList.add(new UserEntityTest("Joe", UserEntityTest.UserLevel.USER, new String[]{"Gmail", "Apple"}));

        List<Vehicle> vehicleList = new LinkedList<>();
        vehicleList.add(new Vehicle("Airplane"));
        vehicleList.add(new Car("Model T", "Ford"));
        vehicleList.add(new Car("Model S", "Tesla"));
        vehicleList.add(new Boat("Boaty Mc. Boatface", true));

        writer.init(BeverageEntityTest.class);
        writer.writeColumnHeader();
        writer.write(entityTestList);

        writer.reset();
        writer.write(userEntityTestList);

        writer.reset();
        writer.init(Vehicle.class);
        writer.initSubtype(Car.class);
        writer.initSubtype(Boat.class);
        writer.writeColumnHeader();
        writer.write(vehicleList);
    }
}
