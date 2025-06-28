
        Student student = new Student(); // create object for Student.Student class by name student
        /*
         * student.name = "Chakresh Kumar ray"; // local variable
         student.age = 21;
         student.rollNumber = 205423;
         System.out.println(student.name);
         System.out.println(student.age);
         */

        // If we want to private this...
        student.setName("Chakresh kumar");  // set value
        System.out.println(student.getName()); // get value

        student.setAge(21);
        System.out.println(student.getAge());

        student.setRollNumber(205423);
        System.out.println(student.getRollNumber());

        student.setStudy("B.Tech");
        System.out.println(student.getStudy());

        student.setBranch("I.T.");
        System.out.println(student.getBranch());
