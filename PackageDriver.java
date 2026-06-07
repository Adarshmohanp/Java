package in;//import custom packages, u should be in a package to import other packages

import in.kerala.*;//implicitly import all classes of in.kerala package
import in.banglore.package10;//explicitly import XYZ class of in.banglore package

public class PackageDriver {
    public static void main(String args[]){
        package9 obj1=new package9(20);
        obj1.getA();

        package10 obj2=new package10(30);
        obj2.getX();
    }
}

