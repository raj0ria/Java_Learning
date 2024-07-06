package JavaClasses.Singleton;

public class BillPlough_Singleton {
    private BillPlough_Singleton(){}

    /**
     * This nested class do not get loaded at the time of class loading
     */
    public static class BillPlough_Singleton_Helper {
        private static final BillPlough_Singleton INSTANCE_OBJECT = new BillPlough_Singleton();
    }

    public static BillPlough_Singleton getInstance() {
        return BillPlough_Singleton_Helper.INSTANCE_OBJECT;
    }
}

class Main5 {
    public static void main(String[] args) {
        BillPlough_Singleton billPloughSingleton1 = BillPlough_Singleton.getInstance();
        BillPlough_Singleton billPloughSingleton2 = BillPlough_Singleton.getInstance();

        System.out.println(billPloughSingleton1.hashCode());
        System.out.println(billPloughSingleton2.hashCode());
    }
}
