public class Builder {
    public class House {
        private int walls, doors, windows;
        private boolean hasGarage, hasSwimPool, hasStatues, hasGarden;

        public House(HouseBuilder houseBuilder) {
        }

        public class HouseBuilder {
            private int walls, doors, windows;
            private boolean hasGarage, hasSwimPool, hasStatues, hasGarden;
            public HouseBuilder(int walls, int doors, int windows) {
                this.walls = walls;
                this.doors = doors;
                this.windows = windows;
            }
            public HouseBuilder withGarage(boolean hasGarage) {
                this.hasGarage = hasGarage;
                return this;
            }
            public HouseBuilder withGarden(boolean hasGarden) {
                this.hasGarden = hasGarden;
                return this;
            }
            public HouseBuilder withStuff(boolean hasSwimPool, boolean hasStatues) {
                this.hasSwimPool = hasSwimPool;
                this.hasStatues = hasStatues;
                return this;
            }
            public House build() {
                return new House(this);
            }
        }
    }
}
