package com.ipiecoles.java.java350.model;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class EmployeTest {

    @Test
    public void testGetNombreAnneeAnciennete(){
        //Given
        Employe e = new Employe();
        e.setDateEmbauche(null);

        //When
        Integer nbAnneeAnciennete = e.getNombreAnneeAnciennete();

        //Then
        Assertions.assertEquals(0, nbAnneeAnciennete.intValue());
    }

    public void getPrimeAnuelle(Integer performance, String matricule, Long nbYeursAnciennete, Double tempsPartiel,
                                Double primeAnnuelle){
        //Given

        //When

        //Then
    }
}
