public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Денис", "Піцул");
        Student student2 = new Student("Володимир", "Перон");
        Student student3 = new Student("Андрій", "Онищук");
        Student student4 = new Student("Роман", "Осадчук");
        Student student5 = new Student("Олександр", "Срібний");
        Student student6 = new Student("Наташа", "Нігайчук");
        Student student7 = new Student("Роман", "Мовченюк");
        Student student8 = new Student("Андрій", "Макаренко");
        Student student9 = new Student("Станіслав", "Гуменюк");
        Student student10 = new Student("Андрій", "Нігайчук");
        Student student11 = new Student("Максим", "Гурів");
        Student student12 = new Student("Богдан", "Нігайчук");

        Group group = new Group(343);
        try {
            group.addStudentToGroup(student1);
            group.addStudentToGroup(student2);
            group.addStudentToGroup(student3);
            group.addStudentToGroup(student4);
            group.addStudentToGroup(student5);
            group.addStudentToGroup(student6);
            group.addStudentToGroup(student7);
            group.addStudentToGroup(student8);
            group.addStudentToGroup(student9);
            group.addStudentToGroup(student10);
            group.addStudentToGroup(student12);


        } catch (ArrayIsFullException e){
            System.out.println("This Array is already full");
        }

        System.out.println();
        group.deleteStudentFromGroup(student2);
        group.deleteStudentFromGroup(student5);
        group.deleteStudentFromGroup(student7);
        group.deleteStudentFromGroup(student11);
        System.out.println();

        try {
            group.addStudentToGroup(student12);
        } catch (ArrayIsFullException e){
            System.out.println("This Array is already full");
        }

        group.deleteStudentFromGroup(student3);

        try {
            group.addStudentToGroup(student2);
        } catch (ArrayIsFullException e){
            System.out.println("This Array is already full");
        }
        System.out.println(group.getStudentByLastName("Піцул"));
        System.out.println(group.toString());

        System.out.println(group.getStudentByLastName("Гуменюк"));



    }
}
