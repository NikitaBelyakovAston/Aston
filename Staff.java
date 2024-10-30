public class Staff {
    private String FIO;
    private String post;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Staff(String FIO, String post, String email, String phoneNumber, int salary, int age) {
        this.FIO = FIO;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInformation() {
        System.out.println("Информация о персонале:");
        System.out.println("Фио:" + FIO);
        System.out.println("Должность:" + post);
        System.out.println("Почта:" + email);
        System.out.println("Номер телефона:" + phoneNumber);
        System.out.println("Зарплата:" + salary);
        System.out.println("Возраст:" + age);
    }

    public static void main(String[] args) {
        Staff Staff = new Staff("Куликов Денис Викторович", "Старший инженер", "klv@yandex.ru", "+78585858181", 65000, 31);
        Staff.printInformation();
        Staff[] staffArray = new Staff[5];
        staffArray[0] = new Staff("Лютин Владимир Андреевич", "Рководитель направления", "lva@yandex.ru", "+78585858585", 100000, 40);
        staffArray[1] = new Staff("Ефанов Кирилл Витальевич", "Эксперт", "ekv@yandex.ru", "+78585855858", 75000, 37);
        staffArray[2] = new Staff("Игнатьев Сергей Николаевич", "Страший инженер", "isn@yandex.ru", "+78484848484", 65000, 30);
        staffArray[3] = new Staff("Колесников Антон Олегович", "Инженер", "kao@yandex.ru", "+78484844848", 50000, 24);
        staffArray[4] = new Staff("Нефедов Дмитрий Сергеевич", "Инженер", "nds@yandex.ru", "+78383838383", 50000, 21);
    }
}
