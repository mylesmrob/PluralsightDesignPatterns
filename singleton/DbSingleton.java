package singleton;

public class DbSingleton {

    private static volatile DbSingleton instance = null; //new DbSingleton() would be used if easily loaded

    private DbSingleton(){
        if(instance != null){
            throw new RuntimeException("Use get getInstance() method to create");
        }
    }

    public static DbSingleton getInstance(){
        if(instance == null){ //Lazily loaded and Threadsafe
            synchronized(DbSingleton.class){
                if(instance == null){
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }
}
