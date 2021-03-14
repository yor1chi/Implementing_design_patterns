public class Factory {
    public interface ILogistics {
        String getType();
    }
    public class Logistics implements ILogistics {
        @Override
        public String getType() {
            return null;
        }
    }
    public class Truck extends Logistics{

    }
    public class Ship extends Logistics {

    }
    public class Plane extends Logistics{

    }
    public class LogisticsFactory {
        public Logistics getLogistics(String type) {
            if(type == "land") {
                return new Truck();
            }
            if (type == "sea") {
                return new Ship();
            }
            if (type == "air") {
                return new Plane();
            }
            return null;
        }
    }
}
