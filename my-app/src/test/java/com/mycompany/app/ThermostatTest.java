package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */

public class ThermostatTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void turnHeaterOnCaseOne() {
      // Arrange
      Thermostat actual = new Thermostat();
      ProgrammedSettings pSet = new ProgrammedSettings();
      pSet.setSetting(Period.MORNING,DayType.WEEKDAY,69);
      actual.setPeriod(Period.MORNING);
      actual.setDay(DayType.WEEKDAY);
      actual.setCurrentTemp(63);
      actual.setThresholdDiff(5);
      actual.setOverride(true);
      acutal.setOverTempt(72);
      actual.setTimeSinceLastRun(12);
      actual.setMinLag(10);
      
      assertTure(actual.turnHeaterOn(pSet));
    }    

    @Test
    public void turnHeaterOnCaseTwo() {
      // Arrange
      Thermostat actual = new Thermostat();
      ProgrammedSettings pSet = new ProgrammedSettings();
      pSet.setSetting(Period.MORNING,DayType.WEEKDAY,69);
      actual.setPeriod(Period.MORNING);
      actual.setDay(DayType.WEEKDAY);
      actual.setCurrentTemp(63);
      actual.setThresholdDiff(5);
      actual.setOverride(true);
      acutal.setOverTempt(67);
      actual.setTimeSinceLastRun(12);
      actual.setMinLag(10);
      
      assertTure(actual.turnHeaterOn(pSet));
    }    

    @Test
    public void turnHeaterOnCaseThree() {
      // Arrange
      Thermostat actual = new Thermostat();
      ProgrammedSettings pSet = new ProgrammedSettings();
      pSet.setSetting(Period.MORNING,DayType.WEEKDAY,69);
      actual.setPeriod(Period.MORNING);
      actual.setDay(DayType.WEEKDAY);
      actual.setCurrentTemp(66);
      actual.setThresholdDiff(5);
      actual.setOverride(true);
      acutal.setOverTempt(67);
      actual.setTimeSinceLastRun(12);
      actual.setMinLag(10);
      
      assertTure(actual.turnHeaterOn(pSet));
    }       

    @Test
    public void turnHeaterOnCaseFour() {
      // Arrange
      Thermostat actual = new Thermostat();
      ProgrammedSettings pSet = new ProgrammedSettings();
      pSet.setSetting(Period.MORNING,DayType.WEEKDAY,69);
      actual.setPeriod(Period.MORNING);
      actual.setDay(DayType.WEEKDAY);
      actual.setCurrentTemp(66);
      actual.setThresholdDiff(5);
      actual.setOverride(true);
      acutal.setOverTempt(72);
      actual.setTimeSinceLastRun(12);
      actual.setMinLag(10);
      
      assertTure(actual.turnHeaterOn(pSet));
    }    

    @Test
    public void turnHeaterOnCaseFive() {
      // Arrange
      Thermostat actual = new Thermostat();
      ProgrammedSettings pSet = new ProgrammedSettings();
      pSet.setSetting(Period.MORNING,DayType.WEEKDAY,69);
      actual.setPeriod(Period.MORNING);
      actual.setDay(DayType.WEEKDAY);
      actual.setCurrentTemp(66);
      actual.setThresholdDiff(5);
      actual.setOverride(false);
      acutal.setOverTempt(72);
      actual.setTimeSinceLastRun(12);
      actual.setMinLag(10);
      
      assertTure(actual.turnHeaterOn(pSet));
    }    
    @Test
    public void turnHeaterOnCaseSix() {
      // Arrange
      Thermostat actual = new Thermostat();
      ProgrammedSettings pSet = new ProgrammedSettings();
      pSet.setSetting(Period.MORNING,DayType.WEEKDAY,69);
      actual.setPeriod(Period.MORNING);
      actual.setDay(DayType.WEEKDAY);
      actual.setCurrentTemp(63);
      actual.setThresholdDiff(5);
      actual.setOverride(false);
      acutal.setOverTempt(72);
      actual.setTimeSinceLastRun(8);
      actual.setMinLag(10);
      
      assertTure(actual.turnHeaterOn(pSet));
    }     
}