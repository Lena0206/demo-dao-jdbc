package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department findById ===");
        Department dep = departmentDao.findById(3);
        System.out.println(dep);

        System.out.println("\n=== TEST 2: department findByAll ===");
        List<Department> list = departmentDao.findAll();
        for(Department obj: list){
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: department insert ===");
        dep.setName("HR");
        departmentDao.insert(dep);
        System.out.println(dep);

        System.out.println("\n=== TEST 4: department update ===");
        dep = departmentDao.findById(6);
        dep.setName("Accounting");
        departmentDao.update(dep);
        System.out.println("Update Completed");

        System.out.println("\n=== TEST 5: department delete ===");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deletById(id);
        System.out.println("Delete completed");
    }
}
