class ATMcardDriver
{
    public static void main(String [] args)
    {
        ATMcard C1 = new ATMcard(1234,"SBI");
        ATMcard C2 = new ATMcard(5678,"SIB");

        C1.DetailsofAtmCard();
        C2.DetailsofAtmCard();

        // Setter
        C1.setpin(8754);
        C1.setBname("Canara Bank");
        C2.setpin(7854);
        C2.setBname("KVB");

        System.out.println("\n\n");

        C1.DetailsofAtmCard();
        C2.DetailsofAtmCard();

        System.out.println("\n\n");

        // Getter
        System.out.println("Pin number of Atmcard 1 is "+C1.getpin());
        System.out.println("Bank name of Atmcard 1 is "+C1.getBname());
        System.out.println("Pin number of Atmcard 2 is "+C2.getpin());
        System.out.println("Bank name of Atmcard 2 is "+C2.getBname());




    }

}
