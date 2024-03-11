public class StudentGradesTable {
    public static void main(String[] args) {
        // Student data
        String[] names = {"Joe", "William", "Mary Su", "John", "Emily"};
        int[] labPoints = {43, 50, 39, 45, 48};
        int[] bonusPoints = {7, 8, 10, 6, 9};

        // Print table
        System.out.println("///////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("==\t\tStudent Points\t\t==");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////\n");

        System.out.println("Name\t\tLab\tBonus\tTotal");
        System.out.println("----\t\t---\t-----\t-----");

        for (int i = 0; i < names.length; i++) {
            int total = labPoints[i] + bonusPoints[i];
            System.out.println(names[i] + "\t\t" + labPoints[i] + "\t" + bonusPoints[i] + "\t" + total);
        }
    }
}
