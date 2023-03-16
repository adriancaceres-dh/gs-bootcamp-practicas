package com.glubits.employees.unit.service;

import com.glubits.employees.dto.CrudDTO;
import com.glubits.employees.dto.DepartmentDTO;
import com.glubits.employees.entity.Department;
import com.glubits.employees.exception.NotFoundException;
import com.glubits.employees.repository.DepartmentRepository;
import com.glubits.employees.service.DeparmentService;
import com.glubits.employees.utils.CrudDTOFactory;
import com.glubits.employees.utils.DepartmentDTOFactory;
import com.glubits.employees.utils.DepartmentFactory;
import com.glubits.employees.utils.EmployeeFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.context.annotation.Description;

import java.util.List;
import java.util.Optional;

@ExtendWith(MockitoExtension.class) //Ponemos esto p/activar las anotaciones p/usar Mock
public class DeparmentServiceTest {


    //Puede ser la clase o la interfaz
    //Aplicamos mock a la dependencia del service (autowired)
    @Mock
    DepartmentRepository departmentRepository;

    //Todos los mock que creamos con @Mocks se lo inyectamos, así separamos el service de la dependencia.
    @InjectMocks
    DeparmentService deparmentService;

    @Test
    @Description("Esperamos crear/guardar un nuevo departamento, al haber 3 (ID 0-2) el próximo en guardar es el 3")
    void saveDepartment() {
        //arrange
        DepartmentDTO deparmentDTO = DepartmentDTOFactory.magicOfTestingDTO();
        CrudDTO expected = CrudDTOFactory.crudDTOCreationWithId01();
        Department entity = DepartmentFactory.magicOfTesting();

        // act con mocks (when)
        Mockito.when(departmentRepository.save(entity)).thenReturn(0);
        var result = deparmentService.saveDepartment(deparmentDTO);

        // assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    @Description("Borramos un departamento siempre que no tenga empleados")
    void deleteDeparment() {
        //arrange
        Integer id = 1;
        CrudDTO expected = CrudDTOFactory.crudDTODeletationWithId01();

        // act con mocks (when)
        Mockito.when(departmentRepository.delete(id)).thenReturn(id);//podemos poner directamente en N° de ID
        var result = deparmentService.deleteDeparment(id);

        // assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    /**
     * Listamos todos los departamentos que contenga toda la info de la DB.
     * Al devolver un ListDTO y nosotros tener que mostrar un string, retornamos la Entidad y no el DTO directamente.
     */
    void listAllDeparments() {
        //arrange
        List<DepartmentDTO> expected = List.of(DepartmentDTOFactory.defenseAntiPedagogicalArtsDTO(),
                DepartmentDTOFactory.historySpringbootMagicDTO(),
                DepartmentDTOFactory.magicalCreaturesTrainingDTO());

        List<Department> shouldReturn = List.of(DepartmentFactory.defenseAntiPedagogicalArts(),
                DepartmentFactory.historySpringbootMagic(),
                DepartmentFactory.magicalCreaturesTraining());

        // act con mocks (when)
        Mockito.when(departmentRepository.listAll()).thenReturn(shouldReturn);
        var result = deparmentService.listAllDeparments();

        // assert
        Assertions.assertEquals(expected, result);

    }

    @Test
    @Description("Buscamos el Id de un departamento que exista y contenga la misma info que la DB(Json)")
    void findOneDeparment() {
        //arrange
        Integer id = 2;
        DepartmentDTO expected = DepartmentDTOFactory.historySpringbootMagicDTO();
        Department entity = DepartmentFactory.historySpringbootMagic();

        // act con mocks (when)
        Mockito.when(departmentRepository.findById(id)).thenReturn(Optional.of(entity));
        var result = deparmentService.findOneDeparment(id);

        // assert
        Assertions.assertEquals(expected, result);

    }

    @Test
    @Description("Buscamos el Id de un departamento que No exista")
    void findOneDeparmentNotExistentId() {
        //arrange
        Integer id = 4;

        // act con mocks (when)
        Mockito.when(departmentRepository.findById(id)).thenReturn(Optional.empty());

        // act & assert
        Assertions.assertThrows(
                NotFoundException.class,
                () -> deparmentService.findOneDeparment(id));

    }

    @Test
    @Description("Buscamos la cantidad de departamentos que exista y contenga la misma info que la DB(Json)")
    void findByDepartmentSize() {
        //arrange
        Integer size = 3;
        List<DepartmentDTO> expected = List.of(DepartmentDTOFactory.defenseAntiPedagogicalArtsDTO(),
                DepartmentDTOFactory.historySpringbootMagicDTO(),
                DepartmentDTOFactory.magicalCreaturesTrainingDTO());

        List<Department> shouldBeReturn = List.of(DepartmentFactory.defenseAntiPedagogicalArts(),
                DepartmentFactory.historySpringbootMagic(),
                DepartmentFactory.magicalCreaturesTraining());

        // act con mocks (when)
        Mockito.when(departmentRepository.findBySize(size)).thenReturn(shouldBeReturn);
        var result = deparmentService.findByDepartmentSize(size);

        // assert
        Assertions.assertEquals(expected, result);

    }

    @Test
    @Description("Buscamos el nombre de un departamento que exista y contenga la misma info que la DB(Json)")
    void findByName() {
        //arrange
        String name = "Departamento de Cuidado de Criaturas Magicas en capacitacion";
        List<DepartmentDTO> expected = List.of(DepartmentDTOFactory.magicalCreaturesTrainingDTO());
        Department entity = DepartmentFactory.magicalCreaturesTraining();

        // act con mocks (when)
        Mockito.when(departmentRepository.findByName(name)).thenReturn(List.of(entity));
        var result = deparmentService.findByName(name);

        // assert
        Assertions.assertEquals(expected, result);

    }

    @Test
    @Description("Buscamos el nombre de un departamento que NO exista")
    void findByNameNotExistentName() {
        //arrange
        String name = "Departamento de Historia de los hechizos";
        List<DepartmentDTO> expected = List.of();

        // act con mocks (when)
        Mockito.when(departmentRepository.findByName(name)).thenReturn(List.of());
        var result = deparmentService.findByName(name);

        // assert
        Assertions.assertEquals(expected, result);

    }

}

