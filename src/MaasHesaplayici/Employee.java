package MaasHesaplayici;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    public double tax() {
        double tax = 0.0;
        if (this.salary >= 1000.0) {
            tax = (salary / 100.0) * 3.0;
        }
        return tax;
    }

    public double bonus() {
        double bonus = 0.0;
        if (this.workHours > 40) {
            int b = workHours - 40;
            bonus = b * 30.0;
        }
        return bonus;
    }

    public double raiseSalary() {
        int dif = 2021 - this.hireYear;
        double raise = 0.0;
        if (dif < 10)
            raise = (this.salary / 100) * 5.0;
        else if (dif < 20)
            raise = (this.salary / 100) * 10.0;
        else
            raise = (this.salary / 100) * 15.0;
        return raise;
    }

    public void toMyString() {
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + this.tax());
        System.out.println("Bonus : " + this.bonus());
        System.out.println("Maaş Artışı : " + this.raiseSalary());
        System.out.println("Vergi ve bonuslar ile birlikte maaş : " + (this.salary - this.tax() + this.bonus()));
        System.out.println("Toplam maaş : " + (this.salary + this.raiseSalary()));
    }

}

