package Dealership;

class SalesmenMain {

    public static void main(String[] args){
        Salesperson s1 = new Salesperson();
        s1.setFirstName("John");
        s1.setLastName("Doe");
        s1.setCompanyName("CarPlace");
        s1.setPayrate("25");
        s1.setRank("Sales Manager");

        Salesperson s2 = new Salesperson();
        s2.setFirstName("John");
        s2.setLastName("Smith");
        s2.setCompanyName("CarPlace");
        s2.setPayrate("30");
        s2.setRank("Sales Manager");


        System.out.println(s1.getFirstName()+" "+s1.getLastName());
        System.out.println(s2.getFirstName()+" "+s2.getLastName());


    }

}