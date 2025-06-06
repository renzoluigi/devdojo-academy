package academy.devdojo.javaoneforall.javacore.Hinheritance.test;

import academy.devdojo.javaoneforall.javacore.Hinheritance.domain.Address;
import academy.devdojo.javaoneforall.javacore.Hinheritance.domain.Manager;

public class ManagerTest01 {
    public static void main(String[] args) {
        Address address = new Address("12th ave", "12233");
        Manager manager = new Manager("Renzo", "0123", address, 2193.32, "T.I.");
    }
}

/*
Initialization order from an inheritance context:
0 - Static init block from the superclass is executed (only once) + static attributes initialized
1 - Static init block from the subclass is executed (only once) + static attributes initialized
2 - Memory is allocated for the superclass
3 - Memory is allocated for the subclass
4 - Attributes from the superclass initialized
5 - Init blocks from the superclass are executed in the order they appear
6 - Constructor from the superclass executed
7 - Attributes from the subclass initialized
8 - Init blocks from the subclass executed in the order they appear
9 - Constructor from the subclass executed
*/
