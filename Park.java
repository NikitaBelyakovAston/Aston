public class Park {
    private String Staff;

    public Park(String Staff) {
        this.Staff = Staff;
    }

    public class Attraction {
        private String attractionName;
        private String openingHours;
        private int price;

        public Attraction(String attractionName, String openingHours, int price) {
            this.attractionName = attractionName;
            this.openingHours = openingHours;
            this.price = price;
        }

        public void printInformation() {
            System.out.println("Название Аттракциона:" + attractionName);
            System.out.println("Часы работы:" + openingHours);
            System.out.println("Цена:" + price);
        }
    }

    public static void main(String[] args) {
        Park park = new Park("Золотой ключик");
        Attraction attractionRollercoaster = park.new Attraction("Американские горки", "08:00 - 20:00", 400);
        Attraction attractionFerriswheel = park.new Attraction("Колесо обозрения", "08:00 - 20:00", 250);
        Attraction attractionWaltz = park.new Attraction("Вальс", "08:00 - 20:00", 300);
        Attraction attractionAutodrome = park.new Attraction("Автодром", "08:00 - 20:00", 500);
        Attraction attractionСhain = park.new Attraction("Цепочка", "08:00 - 20:00", 450);
        attractionRollercoaster.printInformation();
        attractionFerriswheel.printInformation();
        attractionWaltz.printInformation();
        attractionAutodrome.printInformation();
        attractionСhain.printInformation();
    }
}
