package worked_codes;

public class task006exception {

    public static void main(String args[]) {
        try {
            int a[] = new int[2];
            //System.out.println("Access element three :" + a[2]);
            try {
                int b = 0;
                int c = 1/b;
            }catch(Exception e) {
                System.out.println("Exception thrown: " + e);
            }
            System.out.println("Access element three :" + a[3]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown: " + e);
        }
        System.out.println("Out of the block");
    }
}

