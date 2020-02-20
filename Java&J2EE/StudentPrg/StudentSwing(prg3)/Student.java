class Student {
    String name;
    String usn;
    int age;
    String address;
    double sgpa[];
    String category;

    Student(String name, String usn, int age, String address, double sgpa[], String category) {
        this.name = name;
        this.usn = usn;
        this.age = age;
        this.address = address;
        this.sgpa = sgpa;
        this.category = category;
    }

    public String toString() {
        String res = "Name:" + name + "  USN:" + usn + "  Age:" + age + "\nAddress:" + address + "  SGPA:\n";
        for (int i = 0; i < sgpa.length; i++) {
            res = res + "sem " + (i + 1) + ":" + sgpa[i]+"  ";
            // the following line is just to foramt the output so not required
            if(i!=0 && i%3 == 0)res += "\n";
        }
        return res + "\nCategory:" + category+"\n";
    }
}