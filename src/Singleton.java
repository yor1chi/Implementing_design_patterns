public class Singleton {
    public static class Database {
        private static Database instance;
        private Database() {
            // Some initialization code, such as the actual
            // connection to a database server.
            // ...
        }
        public static Database getInstance() {
            if (instance==null) {
                instance = new Database();
            }
            return instance;
        }
    }
}