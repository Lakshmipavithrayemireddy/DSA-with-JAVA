class Main {
    public static void main(String[] args) {
        System.out.println("Suming up of the marks from each subject");
        int student_marks[] = {90,82,95,63,71,80,56,98};
        int total_marks=0;
        for(int i=0;i<student_marks.length;i++)
        {
            total_marks+=student_marks[i];
        }
        System.out.println(total_marks);
        
        
    }
}

output:

Suming up of the marks from each subject
635
