public class TestBasicHive
{
    /*
     * Just like the Tester you used in labs, you can use these methods to test
     * your code. Remove the comments from the relevant methods as you complete
     * the coursework, then run the TestBasicHive to check your work
     */
    public static void main(String[] args)
    {
        testpart1();
        //testpart2();
        //testpart3();
    }

    public static void testpart1()
    {
        final int TESTS = 2;
        int pass_count = 0;

        System.out.println("         Testing Part 1");
        System.out.println("--------------------------------");

        try
        {
            System.out.print("Extending the abstract Bee class...");

            class TestBee extends Bee
            {
                @Override
                public boolean anotherDay() {
                    return true;
                }

                @Override
                public boolean eat() {
                    return true;
                }

            }

            TestBee bee = new TestBee();
            System.out.println("\t\tPASS");
            pass_count++;

            System.out.print("Testing extended Bee's methods...");
            bee.setAge(11);
            if(bee.getAge() == 11)
            {
                 pass_count++;
                 System.out.println("\t\tPASS");
            }
            else
            {
                System.out.println("\t\tFAIL");
            }

            System.out.println();
            if(pass_count == TESTS)
            {
                System.out.println("All tests passed!");
            }
            else
            {
                System.out.println(pass_count+"/"+TESTS+" tests passed");
            }
            System.out.println();
        }
        catch (Exception e)
        {
            System.out.println();
            System.out.println("Something went wrong during the test!");
            System.out.println("The exact cause was a "+e+" - check your code and try again.");
        }

    }

    /*
    public static void testpart2()
    {
        final int TESTS = 4;
        int pass_count = 0;
        boolean pass;

        System.out.println("         Testing Part 2");
        System.out.println("--------------------------------");

        try
        {
            class TestBee extends Bee
            {
                @Override
                public Bee anotherDay() {
                    return this;
                }

                @Override
                public boolean eat() {
                    return true;
                }

            }

            System.out.print("Creating a new Hive...");
            Hive h = new Hive();
            pass_count++;
            System.out.println("\t\t\t\tPASS");

            System.out.print("Testing adding and removing honey/pollen/jelly..");

            h.takeHoney(Integer.MAX_VALUE);
            h.takePollen(Integer.MAX_VALUE);
            h.takeRoyalJelly(Integer.MAX_VALUE);

            h.addHoney(20);
            h.addPollen(20);
            h.addRoyalJelly(20);

            pass = true;

            if (h.takeHoney(20) != 20 || h.takeHoney(20) != 0)
            {
                System.out.println("FAIL");
                System.out.println("Not enough honey returned, or some left in the hive");
            }
            if (h.takePollen(20) != 20 || h.takePollen(20) != 0)
            {
                System.out.println("FAIL");
                System.out.println("Not enough pollen returned, or some left in the hive");
            }
            if (h.takeRoyalJelly(20) != 20 || h.takeRoyalJelly(20) != 0)
            {
                System.out.println("FAIL");
                System.out.println("Not enough jelly returned, or some left in the hive");
            }

            if(pass)
            {
                System.out.println("PASS");
                pass_count++;
            }

            System.out.print("Adding bees to hive...");

            Bee b = new TestBee();

            if(!h.addBee(b) || h.cells.isEmpty())
            {
                System.out.println("\t\t\t\tFAIL");
                System.out.println("Could not add bees to the hive");
            }
            else
            {
                pass_count++;
                System.out.println("\t\t\t\tPASS");
            }

            for (int i = 0; i < 101; i++)
            {
                b = new TestBee();
                h.addBee(b);
            }

            System.out.print("Testing Hive max capacity...");
            b = new TestBee();
            if(h.addBee(b) || h.cells.size() > 100)
            {
                System.out.println("\t\t\tFAIL");
                System.out.println("Able to add too many bees!");
                System.out.println("Check your Hive's max capacity and try again");
            }
            else
            {
                System.out.println("\t\t\tPASS");
                pass_count++;
            }

            System.out.println();
            if(pass_count == TESTS)
            {
                System.out.println("All tests passed!");
            }
            else
            {
                System.out.println(pass_count+"/"+TESTS+" tests passed");
            }
            System.out.println();
        }
        catch (Exception e)
        {
            System.out.println();
            System.out.println("Something went wrong during the test!");
            System.out.println("The exact cause was a "+e+" - check your code and try again.");
        }
    }
    */

    /*
    public static void testpart3()
    {
        final int TESTS = 8;
        int pass_count = 0;
        boolean pass;
        Bee b;
        Hive h = new Hive();

        System.out.println("         Testing Part 3");
        System.out.println("--------------------------------");

        try
        {
            System.out.print("Creating a new Queen with NO Hive...");
            b = new Queen();
            pass_count++;
            System.out.println("\t\tPASS");

            System.out.print("Creating a new Queen WITH a Hive...");
            b = new Queen(h);
            pass_count++;
            System.out.println("\t\tPASS");

            System.out.print("Checking the Queen's type...");
            if(b.getType() == 1)
            {
                 pass_count++;
                 System.out.println("\t\t\tPASS");
            }
            else
            {
                System.out.println("\t\t\tFAIL");
            }

            System.out.print("Testing the Queen's age...");
            b.setAge(11);
            if(b.getAge() == 11)
            {
                 pass_count++;
                 System.out.println("\t\t\tPASS");
            }
            else
            {
                System.out.println("\t\t\tFAIL");
            }


            System.out.print("Checking the Queen's health...");
            h = new Hive();
            b = new Queen(h);
            h.addBee(b);

            h.takeHoney(Integer.MAX_VALUE);
            h.addHoney(8);
            h.anotherDay();
            h.anotherDay();
            h.anotherDay();
            h.anotherDay();

            pass = false;
            for(Bee bee : h.cells)
            {
                if(bee.getType() == 1)
                {
                    pass = true;
                    break;
                }
            }

            if(pass)
            {
                pass_count++;
                System.out.println("\t\t\tPASS");
            }
            else
            {
                System.out.println("\t\t\tFAIL");
                System.out.println("Your Queen died too soon!");
                System.out.println("Check how her food intake affects her health");
            }

            System.out.print("Checking the Queen's health (again)...");
            h.anotherDay();
            h.anotherDay();
            h.anotherDay();

            pass = true;
            for(Bee bee : h.cells)
            {
                if(bee.getType() == 1)
                {
                    pass = false;
                    break;
                }
            }

            if(pass)
            {
                pass_count++;
                System.out.println("\t\tPASS");
            }
            else
            {
                System.out.println("\t\tFAIL");
                System.out.println("Your Queen lived too long!");
                System.out.println("Check how her food intake affects her health");
            }

            System.out.print("Checking if the Queen lays eggs early...");
            h = new Hive();
            b = new Queen(h);
            h.addHoney(100);
            h.addBee(b);
            h.anotherDay();
            h.anotherDay();

            if(!(h.cells.size() > 1))
            {
                pass_count++;
                System.out.println("\tPASS");
            }
            else
            {
                System.out.println("\tFAIL");
                System.out.println("The queen lays eggs too often!");
            }

            System.out.print("Checking if the Queen lays enough eggs...");
            h.anotherDay();

            h.anotherDay();
            h.anotherDay();
            h.anotherDay();

            if(h.cells.size() == 3)
            {
                pass_count++;
                System.out.println("\tPASS");
            }
            else
            {
                System.out.println("\tFAIL");
                System.out.println("The queen doesn't lay eggs often enough!");
            }



            System.out.println();
            if(pass_count == TESTS)
            {
                System.out.println("All tests passed!");
            }
            else
            {
                System.out.println(pass_count+"/"+TESTS+" tests passed");
            }
        }
        catch (Exception e)
        {
            System.out.println();
            System.out.println("Something went wrong during the test!");
            System.out.println("The exact cause was a "+e+" - check your code and try again.");
        }

    }
    */
}