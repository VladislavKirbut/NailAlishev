package alishevcourse.generics.genericexample;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Mariya", 15);

        Students student1 = new Students("Nikolay", 20);
        Students student2 = new Students("Kseniya", 18);

        Employee employee1 = new Employee("Zaur", 32);
        Employee employee2 = new Employee("Mikhail", 47);

        Team<Schoolar> schoolarTeam = new Team<>("Drago");
        // ������ �������� ���������, ��� � ������� � ���������� �� ����� �������� � �������� � ���������
        // ��� ����� �� ������ ������ Team ��� <T>
        // ���������� ��� ���� ��������, ��� �� ����� ���������� ������ ���������, ���������� � ����������
        // ��� String ��������, ����� ��� ��������, ���������� � ������ Team ��������� extends Participant
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);

        Team<Students> StudentTeam = new Team<>("Vpered");
        Team<Employee> EmployeeTeam = new Team<>("Rabotyagi");
        StudentTeam.addNewParticipant(student1);
        StudentTeam.addNewParticipant(student2);
        EmployeeTeam.addNewParticipant(employee1);
        EmployeeTeam.addNewParticipant(employee2);

        Team<Schoolar> schoolarTeam2 = new Team<>("Mudreci");
        Schoolar schoolar3 = new Schoolar("Sergey", 12);
        Schoolar schoolar4 = new Schoolar("Olya", 14);
        schoolarTeam.addNewParticipant(schoolar3);
        schoolarTeam.addNewParticipant(schoolar4);
        // ����� �������� ��������� ����� ������ �� ���������� (� ������ playWith ������ ��� <T>)
        schoolarTeam.playWith(schoolarTeam2);
    }
}
