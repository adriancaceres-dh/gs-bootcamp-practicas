package com.digitalhouse.obtenerdiploma.unit.service;

import com.digitalhouse.obtenerdiploma.dto.CertificateDTO;
import com.digitalhouse.obtenerdiploma.dto.StudentDTO;
import com.digitalhouse.obtenerdiploma.excepciones.NoSuffucientNoteExecption;
import com.digitalhouse.obtenerdiploma.service.CertificateServiceImpl;
import com.digitalhouse.obtenerdiploma.utils.CertificateFactory;
import com.digitalhouse.obtenerdiploma.utils.StudentFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CertificateServiceTest {

    CertificateServiceImpl certificateService =new CertificateServiceImpl();

    @Test
    public void analyzeNotes(){
        // arrange
        CertificateDTO expected = CertificateFactory.getCertificate();
        StudentDTO student = StudentFactory.getStudent();

        // act
        var result = certificateService.analyzeNotes(student);

        // assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void analyzeNotesWithAverage(){
        // arrange
        CertificateDTO expected = CertificateFactory.getCertificateWithAverage();
        StudentDTO student = StudentFactory.getStudentWithAverage();

        // act
        var result = certificateService.analyzeNotes(student);

        // assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void analyzeNotesExeption(){
        // arrange
        StudentDTO student = StudentFactory.getStudentException();

        // act && assert
        Assertions.assertThrows(NoSuffucientNoteExecption.class,
                ()-> certificateService.analyzeNotes(student)
        );
    }
}
