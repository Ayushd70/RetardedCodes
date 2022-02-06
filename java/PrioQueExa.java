import java.util.Comparator;
import java.util.PriorityQueue;

//Employee Class

class Employee {
    String name;
    int salary;

    //Constructor Of Employee

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " : " + salary;
    }
}

//MyComparator Class

class MyComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.salary - e2.salary;
    }
}

class PriorityQueueExample {
    public static void main(String[] args) {
        //Instantiating MyComparator
        MyComparator comparator = new MyComparator();

        //Creating PriorityQueue of Employee objects with MyComparator as Comparator
        PriorityQueue<Employee> pQueue = new PriorityQueue<>(7, comparator);

        //Adding Employee objects to pQueue
        pQueue.offer(new Employee("AAA", 15000));

        pQueue.offer(new Employee("BBB", 12000));

        pQueue.offer(new Employee("CCC", 7500));

        pQueue.offer(new Employee("DDD", 17500));

        pQueue.offer(new Employee("EEE", 21500));

        pQueue.offer(new Employee("FFF", 29000));

        pQueue.offer(new Employee("GGG", 14300));

        //Removing the head elements

        System.out.println(pQueue.poll());       //Output --> CCC : 7500

        System.out.println(pQueue.poll());       //Output --> BBB : 12000

        System.out.println(pQueue.poll());       //Output --> GGG : 14300

        System.out.println(pQueue.poll());       //Output --> AAA : 15000

        System.out.println(pQueue.poll());       //Output --> DDD : 17500

        System.out.println(pQueue.poll());       //Output --> EEE : 21500

        System.out.println(pQueue.poll());       //Output --> FFF : 29000
    }
}