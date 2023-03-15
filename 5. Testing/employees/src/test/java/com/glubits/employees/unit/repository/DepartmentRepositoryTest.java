package com.glubits.employees.unit.repository;

import com.glubits.employees.entity.Department;
import com.glubits.employees.exception.CouldNotDeleteException;
import com.glubits.employees.exception.NotFoundException;
import com.glubits.employees.repository.DepartmentRepository;
import com.glubits.employees.repository.EmployeeRepository;
import com.glubits.employees.utils.DepartmentFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Description;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public class DepartmentRepositoryTest {

    DepartmentRepository departmentRepository;

    @BeforeEach
    void setup() { //ver por qué va esto
        departmentRepository = new DepartmentRepository();
    }

    @Test
    @Description("Esperamos crear/guardar un nuevo departamento, al haber 3 (ID 0-2) el próximo en guardar es el 3")
    void save() {
        //arrange
        Department entity = DepartmentFactory.annotationSpellPractices();
        Integer expected = 3;

        //act
        var result = departmentRepository.save(entity);
        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    @Description("Borramos el Id de un departamento siempre que no contenga empleados")
    void deleteWhitExistenteId() {
        //arrange
        Integer id = 1;
        Integer expected = 1;

        //act
        var result = departmentRepository.delete(id);

        //assert
        Assertions.assertEquals(expected, result);

    }

    @Test
    @Description("Borramos el Id de un departamento que NO existe y evaluamos la excepción que debe arrojar")
    void deleteWithNotExistentIdNFE() {
        //arrange
        Integer id = 5;

        // act & assert
        Assertions.assertThrows(NotFoundException.class,
                () -> departmentRepository.delete(id));

    }

    @Test
    @Description("Borramos el Id de un departamento que NO existe y evaluamos la excepción que debe arrojar")
    void deleteWithNotExistentIdCNE() {
        //arrange
        Integer id = 2;

        // act & assert
        Assertions.assertThrows(CouldNotDeleteException.class,
                () -> departmentRepository.delete(id));

    }

    @Test
    @Description("Buscamos el Id de un departamento que exista y contenga la misma info que la DB(Json)")
    void findByExistentId() {
        //arrange
        Integer id = 1;
        Optional<Department> expected = Optional.of(DepartmentFactory.historySpringbootMagic());

        //act
        var result = departmentRepository.findById(id);

        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    @Description("Buscamos el Id de un departamento que No exista")
    void findByNotExistentId() {
        //arrange
        Integer id = 5;
        Optional<Department> expected = Optional.empty();

        //act
        var result = departmentRepository.findById(id);
        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    @Description("Buscamos el nombre de un departamento que exista y contenga la misma info que la DB(Json)")
    void findByExistedName() {
        //arrange
        String name = "Departamento de Defensa contra las Artes Antipedagogicas";
        List<Department> expected = List.of(DepartmentFactory.defenseAntiPedagogicalArts());

        //act
        var result = departmentRepository.findByName(name);
        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    @Description("Buscamos el nombre de un departamento que NO exista")
    void findByNotExistedName() {
        //arrange
        String name = "Barby";
        List<Department> expected = List.of();
        //act
        var result = departmentRepository.findByName(name);
        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    @Description("Buscamos la cantidad de departamentos que exista y contenga la misma info que la DB(Json)")
    void findByWhitSize() {
        //arrange
        Integer size = 3;
        List<Department> expected = List.of(DepartmentFactory.defenseAntiPedagogicalArts(),
                DepartmentFactory.historySpringbootMagic(),
                DepartmentFactory.magicalCreaturesTraining());
        //act
        var result = departmentRepository.findBySize(size);
        //assert
        Assertions.assertEquals(expected, result);

    }

    @Test
    @Description("Buscamos la cantidad de departamentos que NO existe")
    void findByNotSize() {
        Integer size = 1;
        List<Department> expected = List.of();

        //act
        var result = departmentRepository.findBySize(size);

        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    @Description("Listamos todos los departamentos que contenga toda la info de la DB")
    void listAll() {
        //arrange
        List<Department> expected = List.of(
                DepartmentFactory.defenseAntiPedagogicalArts(),
                DepartmentFactory.historySpringbootMagic(),
                DepartmentFactory.magicalCreaturesTraining());
        //act
        var result = departmentRepository.listAll();
        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void loadDataBase() {
        //arrange

        //act

        //assert

    }

}
