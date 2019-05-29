package com.epita.socra.app;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.epita.socra.app.tools.IOAdapter;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test.
     */
    /*@Test
    public void givenAMock_WhenRunningMain_ThenCheckOuputs() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("TEST");
        App app = new App(mock);
        app.run();

        verify(mock).write("Hello, what's your name ?");
        verify(mock).write(argThat(message -> message.contains("TEST")));

    }*/
    public void create_test(String in, String out){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn(in).thenReturn("exit");
        App app = new App(mock);
        app.run();

        verify(mock).write("> ");
        verify(mock).write(argThat(message -> message.contains(out)));
        verify(mock).write("> ");
    }

    @Test
    public void test_0_un()
    {
        create_test("_ _ _ _ _", "0");
    }

    @Test
    public void test_1_un()
    {
        create_test(". _ _ _ _", "1");
    }
    @Test
    public void test_2_un()
    {
        create_test(". . _ _ _", "2");
    }
    @Test
    public void test_3_un()
    {
        create_test(". . . _ _", "3");
    }
    @Test
    public void test_4_un()
    {
        create_test(". . . . _", "4");
    }
    @Test
    public void test_5_un()
    {
        create_test(". . . . .", "5");
    }
    @Test
    public void test_6_un()
    {
        create_test("_ . . . .", "6");
    }
    @Test
    public void test_7_un()
    {
        create_test("_ _ . . .", "7");
    }
    @Test
    public void test_8_un()
    {
        create_test("_ _ _ . .", "8");
    }
    @Test
    public void test_9_un()
    {
        create_test("_ _ _ _ .", "9");
    }

    @Test
    public void test_76_un() {
        create_test("_ _ . . . _ . . . .", "76");
    }
    @Test
    public void test_06_un() {
        create_test("_ _ _ _ _ _ . . . .", "6");
    }
/*
    @Test
    public void test_valid_1(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("1");
        App app = new App(mock);
        app.run();

        verify(mock).write("Enter a number.");
        verify(mock).write(argThat(message -> message.contains(". _ _ _ _")));
    }
    @Test
    public void test_valid_2(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("2");
        App app = new App(mock);
        app.run();

        verify(mock).write("Enter a number.");
        verify(mock).write(argThat(message -> message.contains(". . _ _ _")));
    }
    @Test
    public void test_valid_3(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("3");
        App app = new App(mock);
        app.run();

        verify(mock).write("Enter a number.");
        verify(mock).write(argThat(message -> message.contains(". . . _ _")));
    }
    @Test
    public void test_valid_4(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("4");
        App app = new App(mock);
        app.run();

        verify(mock).write("Enter a number.");
        verify(mock).write(argThat(message -> message.contains(". . . . _")));
    }
    @Test
    public void test_valid_5(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("5");
        App app = new App(mock);
        app.run();

        verify(mock).write("Enter a number.");
        verify(mock).write(argThat(message -> message.contains(". . . . .")));
    }
    @Test
    public void test_valid_6(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("6");
        App app = new App(mock);
        app.run();

        verify(mock).write("Enter a number.");
        verify(mock).write(argThat(message -> message.contains("_ . . . .")));
    }
    @Test
    public void test_valid_7(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("7");
        App app = new App(mock);
        app.run();

        verify(mock).write("Enter a number.");
        verify(mock).write(argThat(message -> message.contains("_ _ . . .")));
    }
    @Test
    public void test_valid_8(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("8");
        App app = new App(mock);
        app.run();

        verify(mock).write("Enter a number.");
        verify(mock).write(argThat(message -> message.contains("_ _ _ . .")));
    }
*/
    @Test
    public void test_valid_9(){
        create_test("9", "_ _ _ _ .");
    }
/*
    @Test
    public void test_valid_10(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("10");
        App app = new App(mock);
        app.run();

        verify(mock).write("Enter a number.");
        verify(mock).write(argThat(message -> message.contains(". _ _ _ _ _ _ _ _ _")));
    }
    @Test
    public void test_valid_83(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("83");
        App app = new App(mock);
        app.run();

        verify(mock).write("Enter a number.");
        verify(mock).write(argThat(message -> message.contains("_ _ _ . . . . . _ _")));
    }
    @Test
    public void test_valid_1903(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("1903");
        App app = new App(mock);
        app.run();

        verify(mock).write("Enter a number.");
        verify(mock).write(argThat(message -> message.contains(". _ _ _ _ _ _ _ _ . _ _ _ _ _ . . . _ _")));
    }
    @Test
    public void test_valid_42(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("42");
        App app = new App(mock);
        app.run();

        verify(mock).write("Enter a number.");
        verify(mock).write(argThat(message -> message.contains(". . . . _ . . _ _ _")));
    }
    @Test
    public void test_valid_999(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("999");
        App app = new App(mock);
        app.run();

        verify(mock).write("Enter a number.");
        verify(mock).write(argThat(message -> message.contains("_ _ _ _ . _ _ _ _ . _ _ _ _ .")));
    }
    /*
    @Test
    public void test_invalid_nothing(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("");
        App app = new App(mock);
        app.run();

        verify(mock).write("Enter a number.");
        verify(mock).write(argThat(message -> message.contains("")));
    }
    */
/*
    @Test
    public void test_invalid_abc(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("abc");
        App app = new App(mock);
        app.run();

        verify(mock).write("Enter a number.");
        verify(mock).write(argThat(message -> message.contains("Invalid input: Not a number")));
    }
    @Test
    public void test_invalid_1a(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("1a");
        App app = new App(mock);
        app.run();

        verify(mock).write("Enter a number.");
        verify(mock).write(argThat(message -> message.contains("Invalid input: Not a number")));
    }
    @Test
    public void test_valid_420(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("420");
        App app = new App(mock);
        app.run();

        verify(mock).write("Enter a number.");
        verify(mock).write(argThat(message -> message.contains(". . . . _ . . _ _ _ _ _ _ _ _")));
    }
    @Test
    public void test_valid_69(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("69");
        App app = new App(mock);
        app.run();

        verify(mock).write("Enter a number.");
        verify(mock).write(argThat(message -> message.contains("_ . . . . _ _ _ _ .")));
    }

    @Test
    public void test_valid_0(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("0");
        App app = new App(mock);
        app.run();

        verify(mock).write("Enter a number.");
        verify(mock).write(argThat(message -> message.contains("_ _ _ _ _")));
    }

    @Test
    public void test_valid_06(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("06");
        App app = new App(mock);
        app.run();

        verify(mock).write("Enter a number.");
        verify(mock).write(argThat(message -> message.contains("_ . . . .")));
    }

    @Test
    public void test_valid_999999999(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("999999999");
        App app = new App(mock);
        app.run();

        verify(mock).write("Enter a number.");
        verify(mock).write(argThat(message -> message.contains("_ _ _ _ . _ _ _ _ . _ _ _ _ . _ _ _ _ . _ _ _ _ . _ _ _ _ . _ _ _ _ . _ _ _ _ . _ _ _ _ .")));
    }

    @Test
    public void test_valid_008(){
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("008");
        App app = new App(mock);
        app.run();

        verify(mock).write("Enter a number.");
        verify(mock).write(argThat(message -> message.contains("_ _ _ . .")));
    }
*/
}
