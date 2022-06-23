public class Students {
    
    public static void main(String[] args) {
        
        String[] students = { "John", "Vitor", "Pedro", "Henry"};
    
        int i = 0;

        while (i < students.length) {

            System.out.println("Nome do aluno " + (i + 1) + ":" + students[i]);

            i++;
        }
    }
}
