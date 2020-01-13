package interfaces;

public class principal
{
    public static void main(String[] args) 
    {
        // CrushedRock rock = new CrushedRock(12, 10, 50);
        // System.out.println("Sales Price: " + rock.calcSalesPrice());

        SalesCalcs[] itemList = new SalesCalcs[5]; 
        ItemReport report = new ItemReport();

        itemList[0] = new CrushedRock(12.0, 10.0, 50.0);
        itemList[1] = new CrushedRock(8.0, 6.0, 10.0);
        itemList[2] = new CrushedRock(10.0, 8.0, 25.0);
        itemList[3] = new CrushedRock(6.0, 5.0, 10.0);
        itemList[4] = new CrushedRock(14.0, 12.0, 20);

        System.out.println("==Sales Report==");
        System.out.println();

    }
}