#list to contain student data entries
Students = []

def add_student():
    name = input("Enter student name: ")
    id = int(input("Enter student ID: "))

    #grades for three tests and one final exam
    grades = []
    for index in range(1,4):
       grade = int(input(f"Enter grade for test {index}: "))
       grades.append(grade)
    final_exam = int(input(f"Enter grade for final exam: "))
    grades.append(final_exam)

    #storing data in dictionary inside the student list
    student = {
        "name": name,
        "ID":id,
        "grade":grades
    }
    Students.append(student)
    print(f"Data of {name} - {id} has been added.")

    #view students 
    #calculate average 
    #find top students
    #delete student data

